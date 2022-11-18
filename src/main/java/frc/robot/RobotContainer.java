package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.helpers.OI;
import frc.parent.ControlMap;
import frc.parent.PilotMap;
import frc.parent.RobotMap;
import frc.robot.subsystems.BarLifter;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.MotorEx;
import frc.robot.subsystems.Shooter;

public class RobotContainer {
    //must instantiate an object of each subsystem you use
    private MotorEx example = new MotorEx();
    private DriveTrain driveTrain = new DriveTrain();
    private BarLifter bLifter = new BarLifter();
    Joystick[] controllers = OI.joystickArray;

    private Shooter shooter = new Shooter();

    public RobotContainer(){
        driveTrain.setDefaultCommand(new RunCommand(() -> driveTrain.axisDrive(OI.axis(ControlMap.L_JOYSTICK_VERTICAL, PilotMap.Y_AXIS), OI.axis(ControlMap.R_JOYSTICK_HORIZONTAL, PilotMap.X_AXIS))));
        configureButtons();
    } 

    private void configureButtons() {
        //this is how you do teleop stuff
        //when you create a trigger or trigger subclass, it will run whatever you want run when you specify
        
        //https://first.wpi.edu/wpilib/allwpilib/docs/release/java/edu/wpi/first/wpilibj2/command/button/Button.html 
        //list of modifiers to control what happens for trigger objects (joystickbuttons extend trigger)

        //https://first.wpi.edu/wpilib/allwpilib/docs/release/java/edu/wpi/first/wpilibj2/command/button/Trigger.html 
        //triggers are like buttons, but you can control when they go off
        //any logic amongst triggers must be done with .and, .negate, and others
        //see link for full list of logic operators



        new JoystickButton(controllers[0], ControlMap.A_BUTTON)
         .whenPressed(() -> example.setSpeed(0.5))
                .whenReleased(() -> example.setSpeed(0));
         
        new JoystickButton(controllers[1], ControlMap.B_BUTTON).whenPressed(() -> {
            shooter.setSpeed(1);
        }).whenReleased(() -> {
            shooter.setSpeed(0);
        });

        new JoystickButton(controllers[1], ControlMap.Y_BUTTON).whenPressed(() -> {
            shooter.load();
        });



       Trigger uppies = new Trigger(){
            public boolean get(){
                return OI.dPad(1, ControlMap.DPAD_UP);
            }
        }.whenActive(() -> bLifter.moveBar(0.8))
         .negate()
         .whenActive(() -> bLifter.moveBar(-0.8));
        
        // new Trigger(){
        //     public boolean get(){
        //         return OI.dPad(1, ControlMap.DPAD_DOWN);
        //     }
        // }.and(uppies.negate()).whenActive(() -> bLifter.moveBar(-0.8));
    }

    void test(){

    }

    public Command getAutoCommand(){
        //see Autonomous class for more details
        return new Autonomous(driveTrain);
    }
}
