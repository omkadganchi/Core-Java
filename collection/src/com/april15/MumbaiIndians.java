package com.april15;

import java.util.ArrayList;

public class MumbaiIndians {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Player>MI = new ArrayList();
		
		MI.add(new Player(45,"Rohit Sharma",6472,15));
		MI.add(new Player(54,"Lendl Simmons",1049,1));
		MI.add(new Player(66,"Surya Kumar Yadav",3301,0));
		MI.add(new Player(9,"Ambati Rayudu",3916,0));
		MI.add(new Player(9,"Tilak Verma",914,0));
		MI.add(new Player(55,"Kieron Pollard",3412,69));
		MI.add(new Player(3,"Harbhajan Singh",833,150));
		MI.add(new Player(81,"Mitchell McClenaghan",85,71));
		MI.add(new Player(99,"Lasith Malinga",88,170));
		MI.add(new Player(93,"Jasprit Bumrah",66,155));
		MI.add(new Player(34,"Zaheer Khan",117,102));
		
		System.out.println("Players Name");
		//to display names
		for(Player p:MI) {
			System.out.println(p.toString());
		}
		//OR
//		System.out.println(MI);
		
		System.out.println();
		
		//to diplay total runs scored for MI
		for(Player p:MI) {
			System.out.println(p.getName()+": "+p.getRuns());
		}
		System.out.println();
		
		
		//to display jerseyNumber & Name who scored more than 3000 for MI
		for(Player p: MI) {
			if(p.getRuns()>3000) {
				System.out.println(p.getName());
			}
		}
		System.out.println();
		
		
		//to find highest wicket taker for
		Player highestWicketTaker = MI.get(0);
		for (Player p : MI) {
		    if (p.getWickets() > highestWicketTaker.getWickets()) {
		        highestWicketTaker = p;
		    }
		}
		System.out.println("Player with the most wickets: " 
		+ highestWicketTaker.getName() + " (" +
				highestWicketTaker.getWickets() + " wickets)");
		System.out.println();
		
		
		Player highestRunsScorer = MI.get(0);
		for(Player p: MI) {
			if(p.getRuns()>highestRunsScorer.getRuns()) {
				highestRunsScorer = p;
			}
		}
		System.out.println("Player with the most runs: "+highestRunsScorer.getName()
		+" (" +highestRunsScorer.getRuns()+" runs)");
	
	}
}
