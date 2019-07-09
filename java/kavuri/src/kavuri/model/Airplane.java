package kavuri.model;

public class Airplane implements Vehicle{
    @Override
    public void move() {
        System.out.println("landing");
    }

    @Override
    public void stop() {
        System.out.println("taking off");

    }
}
