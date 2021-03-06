package frc.robot.commands;

import frc.robot.Robot;
import frc.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Intake_Down extends Command {
	boolean finished;
	double setpoint = -410;
	double error = Math.abs(setpoint - RobotMap.Intake.getDistance());

	public Intake_Down() {
		requires(Robot.INTAKEROTATEPID);
		RobotMap.Intake.setDistancePerPulse(2);

		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
	}

	// Called just before this Command runs the first time
	protected void initialize() {

	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.INTAKEROTATEPID.setSetpoint(setpoint);
		Robot.INTAKEROTATEPID.enable();

	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return Math.abs(Robot.INTAKEROTATEPID.getSetpoint() - Robot.INTAKEROTATEPID.getPosition()) < 10;
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	
	}
}
