package kavuri;

import kavuri.model.Airplane;
import kavuri.model.Car;
import kavuri.model.Vehicle;






public class Application {
    public static void main(String[] args) {

        System.out.println("Hello Java");


        Vehicle car= new Car();
        car.move();

        Vehicle airplane = new Airplane();
        airplane.move();
    }
}
