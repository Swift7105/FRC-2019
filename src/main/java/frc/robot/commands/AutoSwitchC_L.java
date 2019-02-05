package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoSwitchC_L extends CommandGroup {

    public AutoSwitchC_L() {
    	
    	addSequential(new DriveReverse0_5second());
    	addSequential(new Left_R45());
    	addSequential(new DriveReverse1_5seconds());
    	addSequential(new Right_R45());
    	addSequential(new DriveReverseSlow());
    	addSequential(new Intake_Switch());
    	addSequential(new ElevatorSwitchUp());
    	addSequential(new DumperOut());
    	addSequential(new Intake_Back());
    	/*addSequential(new DumperIn());
    	addSequential(new ElevatorSwitchDown());
    	addSequential(new DriveForward0_5second());
    	addSequential(new Left90());*/
    	
    	
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
