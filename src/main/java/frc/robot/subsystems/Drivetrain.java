package frc.robot.subsystems;

import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.command.ConditionalCommand;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.helpers.CCSparkMax;
import frc.helpers.OI;
import frc.parent.RobotMap;

public class DriveTrain extends SubsystemBase {
    // Initializing motors
    private final CCSparkMax left_one = new CCSparkMax("Front Left", "fl", RobotMap.LEFT_ONE_PORT, MotorType.kBrushless, IdleMode.kCoast, RobotMap.LEFT_ONE_REVERSE, true);
    private final CCSparkMax right_one = new CCSparkMax("Front Right", "fr", RobotMap.RIGHT_ONE_PORT, MotorType.kBrushless, IdleMode.kCoast, RobotMap.RIGHT_ONE_REVERSE, true);
    private final CCSparkMax left_two = new CCSparkMax("Back Left", "bl", RobotMap.LEFT_TWO_PORT, MotorType.kBrushless, IdleMode.kCoast, RobotMap.LEFT_TWO_REVERSE, true);
    private final CCSparkMax right_two = new CCSparkMax("Back Right", "br", RobotMap.RIGHT_TWO_PORT, MotorType.kBrushless, IdleMode.kCoast, RobotMap.RIGHT_TWO_REVERSE, true);

    MotorControllerGroup left = new MotorControllerGroup(left_one, left_two);
    MotorControllerGroup right = new MotorControllerGroup(right_one, right_two);
    DifferentialDrive driveTrain = new DifferentialDrive(left, right);
    private final double speed_cap = 0.3;

    public DriveTrain() {
        
    }


    public void axisDrive(double speed, double turnSpeed) {
        driveTrain.arcadeDrive(OI.normalize(speed * speed * Math.signum(speed), -1, 1) * -speed_cap ,OI.normalize(turnSpeed * turnSpeed * Math.signum(turnSpeed), -1, 1) * speed_cap ); //if backwrds kill for being autistis(multiply by - 1)
    }


    public SequentialCommandGroup runForTime(double seconds, double power){
        SequentialCommandGroup res = new SequentialCommandGroup(
            new InstantCommand(() -> axisDrive(power, 0)),
            new WaitCommand(seconds),
            new InstantCommand(() -> axisDrive(0, 0))
        );
        return res;
    }


}