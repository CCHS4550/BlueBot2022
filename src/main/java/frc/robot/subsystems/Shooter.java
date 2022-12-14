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
import frc.helpers.PneumaticsSystem;
import frc.parent.RobotMap;

public class Shooter extends SubsystemBase {
    // Initializing motors and solenoids
    private final CCSparkMax flywheelOne = new CCSparkMax("Flywheel One", "fo", RobotMap.FLYWHEEL_PORT,
            MotorType.kBrushless, IdleMode.kBrake, RobotMap.FLYWHEEL_REVERSE, true);
    private final PneumaticsSystem loader = new PneumaticsSystem(PneumaticsModuleType.CTREPCM, RobotMap.LOADER_ONE,
            RobotMap.LOADER_TWO);

    public Shooter() {

    }

    public void setSpeed(double speed) {
        flywheelOne.set(speed);
    }
    
    public void load() { // pressa twice or press until hold
        loader.toggle();
    }
}