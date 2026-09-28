package AbstractionExample;

abstract class Vehicle {
    public void start() {
    System.out.println("Start Vehicle");
    }
    public void stop() {
    System.out.println("Stop Vehicle");
 }
    public abstract void drive();
    public abstract void accelerate();
}
                                        