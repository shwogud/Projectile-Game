
import java.util.Scanner;
public class ProjectileMain {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int score = 0; //setting user score to start at 0
		int b = 1;
		while (b == 1) {
		
			int h = (int )(Math.random() * 50 + 1); //random height of wall up to 50 feet tall
			int d = (int)(Math.random() * 30 + 1); //random distance up to 30 feet away
			
			System.out.print("The wall is " + d + " feet away and " + h + " feet tall."); //tells user the parameters
			
			System.out.print("Please enter the velocity and angle you would like to shoow your projectile at.");
				
			int v = sc.nextInt(); //user set velocity
			int a = sc.nextInt(); //user set angle in DEGREES --> converted to radians in the y formula			
			double g = 9.8; //gravity
				
			double y = (d*Math.tan(a*0.0174533)) - (g*d*d)/(2*(v*Math.cos(a*0.0174533)*Math.cos(a*0.0174533))); //height of the projectile
				
			if (y > h) {
				score = score + 1;
				System.out.print("You made it over the wall! Your score is now " + score);
					
			}
			else {
				score = score - 1;
				System.out.print("Projectile did not make it over the wall. Your score is now " + score);
			}
		}		
	}
}
