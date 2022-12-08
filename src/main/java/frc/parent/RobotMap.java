package frc.parent;

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
    //DriveTrain Constants
    public static final int FRONT_RIGHT_PORT = 0;
    public static final boolean FRONT_RIGHT_REVERSE = false;
    public static final int FRONT_LEFT_PORT = 1;
    public static final boolean FRONT_LEFT_REVERSE = false;
    public static final int BACK_RIGHT_PORT = 2;
    public static final boolean BACK_RIGHT_REVERSE = false;
    public static final int BACK_LEFT_PORT = 3;
    public static final boolean BACK_LEFT_REVERSE = false;

    //Shooter Constants
    public static final int FLYWHEEL_ONE_PORT = 4;
    public static final boolean FLYWHEEL_ONE_REVERSE = false;
    public static final int FLYWHEEL_TWO_PORT = 5;
    public static final boolean FLYWHEEL_TWO_REVERSE = false;

    //Loader Constants
    public static final int LOADER_ONE = 1;
    public static final int LOADER_TWO = 2;
    //Bar Lifter Constants
    public static final int LIFTER_PORT = 6;
    public static final boolean LIFTER_REVERSE = false;

    // Example Constants
    public static final int EXAMPLE_MOTOR_PORT = 234545;
    public static final boolean EXAMPLE_MOTOR_REVERSE = false;
}
