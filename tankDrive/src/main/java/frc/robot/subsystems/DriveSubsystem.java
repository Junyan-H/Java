/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.Robot;
import frc.robot.commands.DriveCommand;

import com.ctre.phoenix.motorcontrol.ControlMode;
//import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
/**
 * Add your docs here.
 */
public class DriveSubsystem extends Subsystem {
  WPI_TalonSRX lefTalonSRX = new WPI_TalonSRX(2);
  WPI_TalonSRX rightTalonSRX = new WPI_TalonSRX(3);
  DifferentialDrive drive = new DifferentialDrive(lefTalonSRX,rightTalonSRX);

// tank drive with joysticks
public void TankDrive( double Lval, double Rval){
drive.tankDrive(Lval, Rval);
}

// arcadedrive with xbox controller
public void ArcadeDrive(double move, double turn){
drive.arcadeDrive(move, turn);
}
  
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
   // setDefaultCommand(drivesubsystem);
   setDefaultCommand(new DriveCommand());
  }
}
