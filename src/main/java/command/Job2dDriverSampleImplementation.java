package command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class Job2dDriverSampleImplementation implements Job2dDriver{


        @Override
        public void operateTo(int x, int y) {
            System.out.println("Driver operateTo action...");
        }

        @Override
        public void setPosition(int x, int y) {
            System.out.println("Driver setPosition action...");
        }

}
