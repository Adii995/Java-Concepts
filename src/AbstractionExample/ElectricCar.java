package AbstractionExample;

 public class ElectricCar extends Car {
      @Override
      public void drive() {
    	  System.out.println("drive ElectricCar");
      }
      public void accelerate() {
    	  System.out.println("Accelerate ElectricCar");
      }
      @Override
      public void playMusic() {
    	  System.out.println("Play Music is ElectricCar");
      }
      public void charge() {
    	  System.out.println("charge ElectricCar");
      }
}
