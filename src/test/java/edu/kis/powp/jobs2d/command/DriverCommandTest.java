package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

class DriverCommandTest {
    public static void main(String[] args) {
        Job2dDriver job2dDriver = new TestDriver();

        SetPositionCommand setPositionCommand = new SetPositionCommand(job2dDriver,0,0);
        setPositionCommand.execute();

        OperateToCommand operateToCommand = new OperateToCommand(job2dDriver, 5, 5);
        operateToCommand.execute();
    }


    static class TestDriver implements Job2dDriver
    {

        @Override
        public void setPosition(int i, int i1) {
            System.out.println("setPosition I = " + i + ", I2 = " + i1);
        }

        @Override
        public void operateTo(int i, int i1) {
            System.out.println("operateTo I = " + i + ", I2 = " + i1);
        }
    }
}