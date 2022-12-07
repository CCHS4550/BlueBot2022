package frc.robot.subsystems;

import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.helpers.CCSparkMax;
import frc.parent.RobotMap;

public class Shooter extends SubsystemBase {
    // Initializing motors and solenoids
    private final Solenoid loader = new Solenoid(PneumaticsModuleType.CTREPCM, 1); // CTREPCM or REVPH?
    private final CCSparkMax flywheel = new CCSparkMax("Flywheel One", "fo", RobotMap.FLYWHEEL_ONE_PORT, MotorType.kBrushless, IdleMode.kBrake, RobotMap.FLYWHEEL_ONE_REVERSE, true);

    public Shooter() {

    }

    public Command setSpeedCommand(double speed) {
        RunCommand res = new RunCommand(() -> {
            setSpeed(speed);
        }, this){
            @Override
            public boolean isFinished() {
                return true;
            }
        };
        return res;
    }

    public void setSpeed(double speed){
        flywheel.set(speed);
    }
    
    public void load(boolean toggle){
        loader.set(toggle);
    }
}