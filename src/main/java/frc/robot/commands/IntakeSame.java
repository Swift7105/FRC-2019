package frc.robot.commands;

import frc.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class IntakeSame extends Command {
boolean Finished;
    public IntakeSame() {
    	requires(Robot.INTAKE);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.INTAKE.IntakeTurn();
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Finished;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.INTAKE.IntakeStop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.INTAKE.IntakeStop();
    }
}
