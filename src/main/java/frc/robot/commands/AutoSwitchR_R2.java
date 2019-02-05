package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoSwitchR_R2 extends CommandGroup {

    public AutoSwitchR_R2() {
    	
    	addSequential(new DriveForward2seconds());
    	addSequential(new Right90());
    	addSequential(new DriveReverse0_5second());
    	addSequential(new Intake_Switch());
    	addSequential(new ElevatorSwitchUp());
    	addSequential(new DumperOut());
    	addSequential(new Intake_Back());
    	
    	
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
