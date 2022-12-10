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
    private CCSparkMax one = new CCSparkMax("One", "O", RobotMap.BAR_LIFTER_MOTOR, MotorType.kBrushless, IdleMode.kBrake, RobotMap.BAR_LIFTER_REVERSE, true);
    
    public BarLifter() {

    }
    
    public void moveBar(double speed) {
        one.set(speed);
    }
    
}