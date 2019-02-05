/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.PIDSubsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class IntakeRotatePID extends PIDSubsystem {
 // Initialize your subsystem here
 public IntakeRotatePID() {
  super("Intake Encoder", 0.009, 0.0, 0.0);
  setOutputRange(-0.38,0.7);
  
  //setSetpoint(0);
  //enable();
  
  
  
  
  // Use these to get going:
  // setSetpoint() - Sets where the PID controller should move the system
  // to
  // enable() - Enables the PID controller.
}

public void initDefaultCommand() {
  // Set the default command for a subsystem here.
  // setDefaultCommand(new MySpecialCommand());
}

protected double returnPIDInput() {
  return RobotMap.Intake.getDistance();
  // Return your input value for the PID loop
  // e.g. a sensor, like a potentiometer:
  // yourPot.getAverageVoltage() / kYourMaxVoltage;

}

protected void usePIDOutput(double output) {
  RobotMap.IntakeRotate.set(output);
  // Use output to drive your system, like a motor
  // e.g. yourMotor.set(output);
}
}