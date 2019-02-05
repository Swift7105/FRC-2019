package frc.robot.commands;

import frc.robot.Robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class MainAutoPriority extends CommandGroup {
	
	Command AutoSwitchL_L;
	Command AutoSwitchL_R;
	Command AutoSwitchC_L;
	Command AutoSwitchC_R;	
	Command AutoSwitchR_L;
	Command AutoSwitchR_R;
	Command AutoScaleL_L;
	Command AutoScaleL_R;
	Command AutoScaleC_L;
	Command AutoScaleC_R;	
	Command AutoScaleR_L;
	Command AutoScaleR_R;

    public MainAutoPriority() {
    	
    	AutoSwitchL_L = new AutoSwitchL_L();
    	AutoSwitchL_R = new AutoSwitchL_R();
    	AutoSwitchC_L = new AutoSwitchC_L();
    	AutoSwitchC_R = new AutoSwitchC_R();
    	AutoSwitchR_L = new AutoSwitchR_L();
    	AutoSwitchR_R = new AutoSwitchR_R();
    	AutoScaleL_L = new AutoScaleL_L();
    	AutoScaleL_R = new AutoScaleL_R();
    	AutoScaleC_L = new AutoScaleC_L();
    	AutoScaleC_R = new AutoScaleC_R();
    	AutoScaleR_L = new AutoScaleR_L();
    	AutoScaleR_R = new AutoScaleR_R();

    	requires(Robot.DRIVETRAIN);
    	requires(Robot.class);
    	
    	
    	
    
    	
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

	private void requires(Class<Robot> class1) {
		// TODO Auto-generated method stub
		
	}
	protected void execute(){
		

		
		String GameData = DriverStation.getInstance().getGameSpecificMessage();
		
	
		
		if(Robot.Pos.equals("L")) {
			if(GameData.length()>0) {
        		if(GameData.charAt(1)=='L') {
        			
        				//Left Left Left
        				AutoScaleL_L.start();
        				SmartDashboard.putString("Running:","Auto Scale Left On Left" );
        						}
        		}
    		else if(GameData.charAt(1)=='R' || GameData.charAt(0)=='L'){
    			AutoSwitchL_L.start();
				SmartDashboard.putString("Running:","Auto Switch Left On Left" );			
    		}
    		else if(GameData.charAt(0)=='R'||GameData.charAt(1)=='R'){
    			AutoScaleL_R.start();
    			SmartDashboard.putString("Running:","Auto Scale Right On Left" );		
    		}
    	}
    	
		if(Robot.Pos.equals("C")) {
    		if(GameData.length()>0) {
        		if(GameData.charAt(0)=='L') {
        			
        				//Left Left Left
        				AutoSwitchC_L.start();
        				SmartDashboard.putString("Running:","Auto Switch Left On Center" );
        						}
        		}
    		else if(GameData.charAt(0)=='R'){
    			AutoSwitchC_R.start();
				SmartDashboard.putString("Running:","Auto Switch Left On Center" );
			
    		}
        		
        				}
        	    	
    	
    	
		if(Robot.Pos.equals("R")) {
    		if(GameData.length()>0) {
        		if(GameData.charAt(1)=='R') {
        			
        				//Left Left Left
        				AutoScaleR_R.start();
        				SmartDashboard.putString("Running:","Auto Scale Right On Right" );
        						}
        		}
    		else if(GameData.charAt(1)=='L' || GameData.charAt(0)=='R'){
    			AutoSwitchR_R.start();
				SmartDashboard.putString("Running:","Auto Switch Right On Right" );
			
    		}
    		else if(GameData.charAt(0)=='L'||GameData.charAt(1)=='L'){
    			AutoScaleR_L.start();
    			SmartDashboard.putString("Running:","Auto Scale Left On Right" );		
    		}
    			}
    		
		
		}
	}
	
	
	


