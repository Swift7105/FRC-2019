package frc.robot.commands;

import frc.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Intake_Auto extends Command {
	boolean Finished;

    public Intake_Auto() {
    	 requires(Robot.INTAKEROTATE);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Finished = false;
    	Robot.INTAKEROTATE.Intake_Auto();
    	Timer.delay(0.75);
    	Robot.INTAKEROTATE.Intake_Stop();
    	Finished = true;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Finished;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.INTAKEROTATE.Intake_Stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.INTAKEROTATE.Intake_Stop();
    }
}
