package zzzcom.apr19;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class Kkr {
	
	String name;
	String cn;
	String role;
	int runs;
	int wic;
	
	Kkr(String n,String cn,String r,int run,int  wic){
		this.name = n;
		this.cn = cn;
		this.role = r;
		this.runs = run;
		this.wic = wic;
	}
	
	
	public static final void Kkr() {
		System.out.println("\n***Wellcome in Team Kkr***");
	Scanner s2 = new Scanner(System.in);
	while (true) {
		
		

		HashMap<Integer ,Kkr> m = new LinkedHashMap();

		Scanner s1 = new Scanner(System.in);
		System.out.print("\n1.Show Team of Kkr "
				+ "\n2.Captain of Kkr"
				+ "\n3.player with highest runs "
				+ "\n4.Player with highest wickets"
				+ "\n5.Batsmans"
				+ "\n6.Bowlers"
				+ "\n7.All-rounders"
				+ "\n\nchoose option :");
		
		int z = s1.nextInt();
		
		m.put(96,new Kkr("Shreyas iyer(c) "," India "," Batsman ", 2916, 0));
		m.put(27,new Kkr("Nitish rana "," India "," Batsman ", 2603, 0));
		m.put(35,new Kkr("Rinku singh "," India ", " Batsman ", 808, 0));
		m.put(37,new Kkr("Manish pandey(wk) "," India ", " Batsman ", 3808, 0));
		m.put(25,new Kkr("Venktesh iyer "," India ", " All rounder ", 1029, 3));
		m.put(12,new Kkr("Andre russell "," West indies ", " All rounder ", 2390, 102));
		m.put(74,new Kkr("Sunil narine "," West Indies "," All rounder ", 1322, 170));
		m.put(29,new Kkr("Varun chakravarthy "," India "," Bowler ", 25, 69));
		m.put(56,new Kkr("Mitchel starc "," Australia "," Bowler ", 103, 39));
		m.put(13,new Kkr("Vaibhav arora "," India "," Bowler ", 9, 15));
		m.put(22,new Kkr("Harshit rana "," India ", " Bowler ", 2, 13));
		m.put(15,new Kkr("Srikar bharat "," India ", " Bowler ", 180, 51));

		switch (z) {

		case 1:
			System.out.println("\nTeam Kolkata Knight Riders :\n");
			  System.out.println("+---------+----------------------+-----------------+---------------+----------+---------+");
		      System.out.println("|jersy no |         Name         |     Country     |     Role      |   Runs   | Wickets |");
		      System.out.println("+---------+----------------------+-----------------+---------------+----------+---------+");

		      for (Integer i : m.keySet()) {
		            Kkr player = m.get(i);
		            System.out.printf("| %-2d      | %-20s | %-15s | %-13s | %-8d | %-7d |%n",
		                              i, player.getName(), player.getCn(), 
		                              player.getRole(), player.getRuns(), player.getWic());
		        }
		        System.out.println("+---------+----------------------+-----------------+---------------+----------+---------+");
			break;
			
			
		case 2 :
			System.out.println("***Captain of Kkr***");
			  System.out.println("+----------------------+-----------------+---------------+----------+---------+");
		      System.out.println("|         Name         |     Country     |     Role      |   Runs   | Wickets |");
		      System.out.println("+----------------------+-----------------+---------------+----------+---------+");

		      Kkr player1 = m.get(27);
	            System.out.printf("| %-20s | %-15s | %-13s | %-8d | %-7d |%n",
	                              player1.getName(), player1.getCn(), 
	                              player1.getRole(), player1.getRuns(), player1.getWic());
		        System.out.println("+----------------------+-----------------+---------------+----------+---------+");

			
			break;


		case 3:
//			int highestRuns = 0;
//			String playerWithHighestRuns = "";
//			System.out.println("***player with highest runs***");

//			System.out.println("+----------------------+----------+);
//		    System.out.println("|         Name         |   Runs   |");
//		    System.out.println("+----------------------+----------+");

//			for (Kkr player : m.values()) {
//			    if (player.getRuns() > highestRuns) {
//			        highestRuns = player.getRuns();
//			        playerWithHighestRuns = player.getName();
//			System.out.printf("| %-20s | %-8d |",
//                    player.getName(), player.getRuns());
//	        System.out.println("+----------------------+----------+");

//			    }
//			}
//
//			System.out.println("Player with highest runs: " + playerWithHighestRuns + " (" + highestRuns + ")");

			
			Kkr name = null;
			int highestRuns = 0;
			System.out.println("***player with highest runs***");

			  System.out.println("+----------------------+-----------------+---------------+----------+---------+");
		      System.out.println("|         Name         |     Country     |     Role      |   Runs   | Wickets |");
		      System.out.println("+----------------------+-----------------+---------------+----------+---------+");

			for (Kkr player : m.values()) {
			    if (player.getRuns() > highestRuns) {
			        highestRuns = player.getRuns();
			        name = player;
			    }
			    }
			
			if (name != null) {
			  
				System.out.printf("| %-20s | %-15s | %-13s | %-8d | %-7d |%n",
                        name.getName(), name.getCn(), 
                        name.getRole(), name.getRuns(), name.getWic());
		        System.out.println("+----------------------+-----------------+---------------+----------+---------+");

			} 
			else {
			    System.out.println("No player found.");
			}

		    break;
		    
		    
		    
		case 4:
			
			Kkr n = null;
			int highestwic = 0;
			System.out.println("***player with highest wickets***");

			  System.out.println("+----------------------+-----------------+---------------+----------+---------+");
		      System.out.println("|         Name         |     Country     |     Role      |   Runs   | Wickets |");
		      System.out.println("+----------------------+-----------------+---------------+----------+---------+");

			for (Kkr player : m.values()) {
			    if (player.getWic() > highestwic) {
			        highestwic = player.getWic();
			        n = player;
			    }
			    }
			
			if (n != null) {
				System.out.printf("| %-20s | %-15s | %-13s | %-8d | %-7d |%n",
                        n.getName(), n.getCn(), 
                        n.getRole(), n.getRuns(), n.getWic());
		        System.out.println("+----------------------+-----------------+---------------+----------+---------+");

			} else {
			    System.out.println("No player found.");
			}
			
			break;
			
		case 5:
			System.out.println("***Batsmans of Team Kkr***");
			String players= " ";
			System.out.println("+----------------------+----------+");
			System.out.println("|         Name         |   Runs   |");
		    System.out.println("+----------------------+----------+");

			for (Kkr player : m.values()) {
			    if (player.getRole().equals(" Batsman ")) {
			    	System.out.printf("| %-20s | %-8d |",
		            player.getName(), player.getRuns());
			    	System.out.println();
			    }
			}
		    System.out.println("+----------------------+----------+");

			
			break;
			
		case 6:
			System.out.println("***Bowlers of Team Kkr***");
			String pl= " ";
			System.out.println("+----------------------+----------+");
			System.out.println("|         Name         |  wickets |");
		    System.out.println("+----------------------+----------+");

			for (Kkr player : m.values()) {
			    if (player.getRole().equals(" Bowler ")) {
			    	System.out.printf("| %-20s | %-7d  |",
				            player.getName(), player.getWic());
					    	System.out.println();
			    }
			}
			System.out.println("+----------------------+----------+");
			
			break;
						
			
		case 7:
			System.out.println("***All-rounders of Team Kkr***");
			String p= " ";
			System.out.println("+----------------------+----------+----------+");
			System.out.println("|         Name         |   Runs   |  wickets |");
		    System.out.println("+----------------------+----------+----------+");

			for (Kkr player : m.values()) {
			    if (player.getRole().equals(" All rounder ")) {
			    	System.out.printf("| %-20s | %-8d | %-7d  |",
				            player.getName(), player.getRuns(),player.getWic());
					    	System.out.println();
			    }
			}
			System.out.println("+----------------------+----------+----------+");
			
			break;
			

	}
		System.out.print("\n1.Go to Kkr menu\n2.exit from Kkr"
				+ "\nchoose option :");
		int a = s2.nextInt();
		if(a==2) {
			break;
		}
		
	}
}
	
	
	public String getCn() {
		return cn;
	}


	public void setCn(String cn) {
		this.cn = cn;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public int getRuns() {
		return runs;
	}


	public void setRuns(int runs) {
		this.runs = runs;
	}


	public int getWic() {
		return wic;
	}


	public void setWic(int wic) {
		this.wic = wic;
	}


	@Override
	public String toString() {
		
		return name;
	} 
	


}
