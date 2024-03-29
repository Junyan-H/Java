/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.MechContrCommand;

/**
 * Add your docs here.
 */
public class MechContrSubsystem extends Subsystem {
 
 private WPI_TalonSRX winchTalonSRX;
  
  public MechContrSubsystem()
  {
    super();
    winchTalonSRX = new WPI_TalonSRX(2);
    winchTalonSRX.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative);
    winchTalonSRX.setSelectedSensorPosition(0);
  }
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
// this is the method used to move the mechanism

public void printSensorVal(){
  winchTalonSRX.getSensorCollection().getQuadratureVelocity();
  
}
 public void mechMove(){
   winchTalonSRX.set(ControlMode.PercentOutput, 0.5);  
  }
  public double getSensorVal(){
    return winchTalonSRX.getSelectedSensorPosition();
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new MechContrCommand());
  }
}
