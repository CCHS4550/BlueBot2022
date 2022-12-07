package frc.robot;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Shooter;


public class Autonomous extends SequentialCommandGroup{
    //auto is set up such that it will run when yuo want it to

    //inside the constructor you have to put an object of each subsystem you plan to use
    public Autonomous(DriveTrain dt, Shooter s){
        //put all commands within this super.addcommands
        //make note that it uses commas instead of semicolons because you're technically adding them in a list
        super.addCommands(dt.moveTo(5), s.setSpeedCommand(1), new WaitCommand(4));

            //whatever you put here must extend from command
            //https://first.wpi.edu/wpilib/allwpilib/docs/release/java/edu/wpi/first/wpilibj2/command/package-summary.html
            //check link for relevant subclasses

            
    }
}