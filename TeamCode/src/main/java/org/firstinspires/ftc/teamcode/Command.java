package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

public class Command extends LinearOpMode{

    protected boolean isActive;
    public Command(){
        initialize();
        isActive = true;
    }
    public void initialize(){}
    public void execute(){}
    public void end(){}
    public boolean isFinished(){return !isActive;}

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
