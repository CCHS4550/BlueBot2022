package frc.robot.subsystems;

import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.DigitalInput;
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
import frc.robot.Robot;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

public class BarLifter extends SubsystemBase {
    private CCSparkMax one = new CCSparkMax("One", "O", RobotMap.FLYWHEEL_ONE_PORT, MotorType.kBrushless, IdleMode.kBrake, RobotMap.FLYWHEEL_ONE_REVERSE, true);
    private CCSparkMax two = new CCSparkMax("Two", "T", RobotMap.FLYWHEEL_TWO_PORT, MotorType.kBrushless, IdleMode.kBrake, RobotMap.FLYWHEEL_TWO_REVERSE, true);
    private MotorControllerGroup motors = new MotorControllerGroup(one, two);
    private DigitalInput limSwitch = new DigitalInput(RobotMap.BAR_LIMIT_SWITCH);
    
    public BarLifter() {

    }
    
    public void moveBar(double speed) {
        if (!limSwitch.get()) {
            motors.set(speed);    
        } else {
            motors.set(0);
        }
    }
    
}