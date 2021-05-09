package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

public class Command extends LinearOpMode{
    protected boolean isActive;
    public void initialize(){}
    public void execute(){}
    public void end(){}
    public boolean isFinished(){return !isActive;}
    public Command(){
        initialize();
        isActive = true;
    }
    @Override
    public void runOpMode() throws InterruptedException {
        if (!isFinished()&&isActive){
            execute();
        } else {
            end();
            isActive = false;
        }
    }

}
