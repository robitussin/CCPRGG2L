final class Car {

    // Composition
    private final Engine engine;

    // Constructor
    Car(Engine engine) {

        // This keywords refers to same instance
        this.engine = engine;
    }

    // Method
    public void start() {

        if (engine != null) {
            engine.start();
            System.out.println("Car is moving ");
        }
    }
}
