package WeaponGameProject;

import java.util.Scanner;

public class Game {
	{
		System.out.println("Game Has Started");	
	}
   public Weapon selectWeapon() {
	   Scanner scanner=new Scanner(System.in);
	   System.out.println("Enter the Score");
	   int score = scanner.nextInt();
	   if(score<=400) {
		   System.out.println("you got Knife");
		   Knife k=new Knife();
		   return k;
	   }else if(score<=800) {
		   
		   System.out.println("you got Gun");
		   return new Gun();
	   }
	   else {
		   System.out.println("you got Bomb");
		   return new Bomb();
	   }
   }
}
