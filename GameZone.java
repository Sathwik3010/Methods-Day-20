package com.codegnan.oopmethods;

import java.util.Scanner;

public class GameZone {
	static int totalPoints;
	
	
	public static int calculateTotalPoints(int totalGames) {
		int points = totalGames * 10;
		if(points > 10000) {
			points = 10000;
		}
		totalPoints=points;
		return totalPoints;
	}
	
	public int calculateGamePoints(int games, String gameType) {
		int points = 0;
		
		if(games<0) {
            System.out.println("Invalid game count.");
            return 0;
		}
		
		if(gameType.equalsIgnoreCase("puzzle")) {
			points = games * 15;
		} else if(gameType.equalsIgnoreCase("action")) {
            points = games * 20;
		} else {
            System.out.println("Invalid game type.");
            return 0;
		}
		
		if(points > 10000) {
			points=10000;
		}
		return points;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int totalGames = sc.nextInt();
        int games = sc.nextInt();
        String gameType = sc.next();
        
        int staticPoints = calculateTotalPoints(totalGames);
        GameZone gp = new GameZone();
        
        int instancePoints = gp.calculateGamePoints(games, gameType);
        
        System.out.println(staticPoints+" "+instancePoints);
        sc.close();
	}

}
