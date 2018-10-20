import sun.security.provider.ConfigFile;

import javax.swing.*;

public class MarsApplication {
    public static void main(String[] args) {
        MarsRobot Spirit = new MarsRobot();
        MarsRobot opportunity = new MarsRobot();

        opportunity.status = "eksploracja";
        opportunity.speed = 3;
        opportunity.temperature = -70;

        opportunity.showAttributes();

        Spirit.status = "eksploracja";
        Spirit.speed = 2;
        Spirit.temperature = -60;

        Spirit.showAttributes();

        System.out.println("Zwiększamy prędkość do 3.");

        Spirit.speed = 3;
        Spirit.showAttributes();

        System.out.println("Zmiana temperatury na -90.");
        Spirit.temperature = -90;
        Spirit.showAttributes();

        System.out.println("Sprawdanie temperatury.");
        Spirit.checkStatus();

    }
}
