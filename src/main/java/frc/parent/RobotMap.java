package frc.parent;

import frc.robot.subsystems.DriveTrain;

// import com.revrobotics.CANSparkMax.IdleMode;
// import com.revrobotics.CANSparkMaxLowLevel.MotorType;

// import frc.robot.CCSparkMax;

/*
    RobotMap holds all the ports involved in the robot.
    This ranges from talon ports, all the way to the ports
    on the controllers. This also contains the polarity for the wheels
    and the various ports assoiated with sensors
    If you wish to create your own port, here is the syntax:
        public static final returnType name = value;
    Notes on creating ports:
        1. Ports must be integers or booleans
        2. they MUST be public static final;
        3. If the port is not plugged in, make int values -1, and boolean values false
*/
public interface RobotMap {
    // DriveTrain (placeholder values)
    //the front of the robot is the side without the bar lifter
    public static final int LEFT_ONE_PORT = 3; //front and back dont matter. Just the fact these two are on this side
    public static final boolean LEFT_ONE_REVERSE = true;
    public static final int LEFT_TWO_PORT = 4;
    public static final boolean LEFT_TWO_REVERSE = true;

    public static final int RIGHT_ONE_PORT = 1;
    public static final boolean RIGHT_ONE_REVERSE = false;
    public static final int RIGHT_TWO_PORT = 2;
    public static final boolean RIGHT_TWO_REVERSE = false;

    // Shooter
    public static final int FLYWHEEL_PORT = 6;
    public static final boolean FLYWHEEL_REVERSE = false;

    public static final int BAR_LIFTER_MOTOR = 5;
    public static final boolean BAR_LIFTER_REVERSE = false;

    public static final int LOADER_ONE = 6; //Change 
    public static final int LOADER_TWO = 4;
    
    // Example
    public static final int EXAMPLE_MOTOR_PORT = 5318008;
    public static final boolean EXAMPLE_MOTOR_REVERSE = false;

}
