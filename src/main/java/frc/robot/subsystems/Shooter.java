package frc.robot.subsystems;

import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.helpers.CCSparkMax;
import frc.parent.RobotMap;

public class Shooter extends SubsystemBase {
    private final CCSparkMax flywheelOne = new CCSparkMax("Flywheel One", "fo", RobotMap.FLYWHEEL_ONE_PORT, MotorType.kBrushless, IdleMode.kBrake, RobotMap.FLYWHEEL_ONE_REVERSE, true);
    private final CCSparkMax flywheelTwo = new CCSparkMax("Flywheel Two", "ft", RobotMap.FLYWHEEL_TWO_PORT, MotorType.kBrushless, IdleMode.kBrake, RobotMap.FLYWHEEL_TWO_REVERSE, true);

    public Shooter() {

    }

    public void setShooterSpeed(double speed){
        flywheelOne.set(speed);
        flywheelTwo.set(speed);
    }
}