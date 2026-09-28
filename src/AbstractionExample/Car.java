package AbstractionExample;

abstract class Car extends Vehicle{
    public void openGate() {
    	System.out.println("Open Gate in Car");
    }
      public abstract void playMusic();
}
