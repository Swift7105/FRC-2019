package frc.robot.commands;

import frc.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Right90 extends Command {
Boolean Finished;
    public Right90() {
    	requires(Robot.DRIVETRAIN);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Finished = false;
    	Robot.DRIVETRAIN.Right90();
    	Timer.delay(1);
    	Robot.DRIVETRAIN.DriveStop();
    	Finished = true;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Finished;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.DRIVETRAIN.DriveStop();
    }
}
