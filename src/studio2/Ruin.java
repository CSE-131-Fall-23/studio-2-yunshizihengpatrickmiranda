package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("The amount of money that you start with: ");
		double startAmount = in.nextDouble();
		
		System.out.println("The win probability: ");
		double winChance = in.nextDouble();
		
		System.out.println("The amount of money you wish to reach: ");
		double winLimit = in.nextDouble();
		
		System.out.println("The number of simulation: ");
		int totalSimulation = in.nextInt();
		int day = 1;
		
		

		
		while (day <= totalSimulation) {
			
			int i = 0;
			double money = startAmount;

			while ( money < winLimit && money > 0 )
			{
				double random = Math.random();
				
				if (random <= winChance) {
						money++;
						i++;
						//System.out.println(i +"money"+ startAmount + "win");
						
				}
				else 
				{ 
						money--;
						i++;
						//System.out.println(i +"money"+ startAmount + "lose");
						
					}
	
			}
			
			if (money <= 0)
				System.out.println("Simulation " + day + ": " + i +"Ruin");
			if (money >= winLimit)
				System.out.println("Simulation " + day + ": " + i +"Successful day!");
			
			day++;

		}
			//System.out.println("Simulation " + totalSimulation + ": " + i);
		
			
		
		//System.out.println(startAmount);
		//if startAmount <= 0
			
		
		
		
		

	}

}
