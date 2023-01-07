class CarEngine {

    public void startEngine() {

        System.out.println("The car engine has Started.");

    }

    public void stopEngine() {

        System.out.println("The car engine has Stopped.");

    }
}

class Car {

    private String colour;

    private int maxi_Speed;

    public void carDetails() {

        System.out.println("Car Colour= " + colour + "; Maximum Speed= " + maxi_Speed);

    }

    // Setting colour of the car

    public void setColour(String colour) {

        this.colour = colour;

    }

    // Setting maximum car Speed

    public void setMaxSpeed(int maxi_Speed) {

        this.maxi_Speed = maxi_Speed;

    }

}

class Honda extends Car {

    public void HondaStart() {

        CarEngine Honda_Engine = new CarEngine(); // composition

        Honda_Engine.startEngine();

    }

}

public class App {

    public static void main(String[] args) {

        Honda HondaJazz = new Honda();

        HondaJazz.setColour("Black");

        HondaJazz.setMaxSpeed(160);

        HondaJazz.carDetails();

        HondaJazz.HondaStart();
    }
}