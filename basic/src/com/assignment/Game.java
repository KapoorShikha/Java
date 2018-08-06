package com.assignment;

import java.util.Random;
import java.util.Scanner;

public class Game {
	
	static int coins,no,lucky_no;
	static int i = 1;
	static String ch;
	
	static Scanner sc = new Scanner(System.in);
	static Random rn = new Random();
	
	public static void GamePlay()
	{
		System.out.println("Enter a 3-digit no");
		no = sc.nextInt();
		
		if (no >= 0 && no < 1000) 
		{
			while (i <= coins) 
			{
				lucky_no = rn.nextInt(1000);
				if (no == lucky_no)
					System.out.println("Congratulationss!!!! YOU WON!!!");
				else {
					i++;
					System.out.println("do you wish to try again??(Yes/No)");
					ch=sc.next();
					if(ch.equalsIgnoreCase("Yes")==true)
					{
						Game.GamePlay();
					}
					else
						break;
				}
			}
			System.out.println("Thank You For playing!!!!");
		}
		
	}

	public static void main(String[] args) {
		
		System.out.println("Enter total number of coins you have");
		coins = sc.nextInt();
		
		Game.GamePlay();

		if(no<0||no>1000)
		{
		System.out.println("LOST");
		System.out.println("Do you wish to try again??(Yes/No)");
		ch=sc.next();
		if(ch.equalsIgnoreCase("Yes")==true)
		{
			i++;
			Game.GamePlay();
		}
		else
				System.out.println("Thank You For playing!!!!");
		}

	}
}


