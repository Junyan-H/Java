/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
//import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
/**
 * Add your docs here.
 */
public class DriveSubsystem extends Subsystem {
  WPI_TalonSRX lefTalonSRX = new WPI_TalonSRX(1);
  WPI_TalonSRX rightTalonSRX = new WPI_TalonSRX(2);
  

public void TankDrive( double Lval, double Rval){
lefTalonSRX.set(ControlMode.PercentOutput,Lval);
rightTalonSRX.set(ControlMode.PercentOutput,Rval);

}
  
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
   // setDefaultCommand(drivesubsystem);
  }
}
