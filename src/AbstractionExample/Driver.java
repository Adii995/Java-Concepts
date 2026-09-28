package AbstractionExample;

public class Driver {
   public static void main(String[] args) {
	   Vehicle v1=new ElectricCar();
	   v1.start();
	   v1.drive();
	   v1.accelerate();
	   v1.accelerate();
	   Car c1=(Car)v1;
	   c1.openGate();
	   c1.playMusic();
	   ElectricCar e1=(ElectricCar)v1;
	   e1.charge();
	   
   }
}
