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
    public static final int FRONT_LEFT_PORT = 3; //swap with right side if need be
    public static final boolean FRONT_LEFT_REVERSE = false;
    public static final int BACK_LEFT_PORT = 4;
    public static final boolean BACK_LEFT_REVERSE = false;

    public static final int FRONT_RIGHT_PORT = 1;
    public static final boolean FRONT_RIGHT_REVERSE = false;
    public static final int BACK_RIGHT_PORT = 2;
    public static final boolean BACK_RIGHT_REVERSE = false;

    // Shooter
    public static final int FLYWHEEL_ONE_PORT = 12;
    public static final boolean FLYWHEEL_ONE_REVERSE = false;

    public static final int BAR_LIFTER_MOTOR = 5;
    public static final boolean BAR_LIFTER_REVERSE = false;

    public static final int LOADER_ONE = 0; //Change 
    public static final int LOADER_TWO = 1;
    
    // Example
    public static final int EXAMPLE_MOTOR_PORT = 5318008;
    public static final boolean EXAMPLE_MOTOR_REVERSE = false;

}
