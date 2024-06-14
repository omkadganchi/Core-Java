package zzzcom.apr19;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class Mi {
	String name;
	String cn;
	String role;
	int runs;
	int wic;
	
	public Mi(String n,String cn,String r,int run,int  wic){
		this.name = n;
		this.cn = cn;
		this.role = r;
		this.runs = run;
		this.wic = wic;
	}
	
	
	public static final void mi() {
		System.out.println("\n***Wellcome in Team MI***");
	Scanner s2 = new Scanner(System.in);
	while (true) {
		
		

		HashMap<Integer ,Mi> m = new LinkedHashMap();

		Scanner s1 = new Scanner(System.in);
		System.out.print("\n1.Show Team of Mi "
				+ "\n2.Captain of Mi"
				+ "\n3.player with highest runs "
				+ "\n4.Player with highest wickets"
				+ "\n5.Batsmans"
				+ "\n6.Bowlers"
				+ "\n7.All-rounders"
				+ "\n\nchoose option :");
		
		int z = s1.nextInt();
		
		m.put(45,new Mi("Rohit sharma "," India "," Batsman ", 6472, 15));
		m.put(22,new Mi("Ishan kishan(wk) "," India "," Batsman ", 2508, 0));
		m.put(9,new Mi("Tilak varma "," India ", " Batsman ", 914, 0));
		m.put(30,new Mi("Suryakumar yadav "," India ", " Batsman ", 3301, 0));
		m.put(16,new Mi("Tim david "," Australia ", " Batsman ", 546, 0));
		m.put(27,new Mi("Hardik pandya(c) "," India "," All rounder ", 2432, 56));
		m.put(01,new Mi("Romario shepherd "," West Indies "," All rounder ", 113, 4));
		m.put(17,new Mi("Dewald brevis "," South Africa "," All rounder ", 207, 1));
		m.put(7,new Mi("Mohammad nabi "," Afganistan ", " All rounder ", 184, 13));
		m.put(93,new Mi("Jasprit bumrah "," India "," Bowler ", 65, 155));
		m.put(02,new Mi("Akash madhwal "," India ", " Bowler ", 4, 18));
		m.put(11,new Mi("Piyush chawla "," India ", " Bowler ", 612, 150));
		m.put(19,new Mi("Shreyash gopal "," India ", " Bowler ", 180, 51));

		switch (z) {

		case 1:
			System.out.println("\nTeam Mumbai Indians :\n");
			  System.out.println("+---------+----------------------+-----------------+---------------+----------+---------+");
		      System.out.println("|jersy no |         Name         |     Country     |     Role      |   Runs   | Wickets |");
		      System.out.println("+---------+----------------------+-----------------+---------------+----------+---------+");

		      for (Integer i : m.keySet()) {
		            Mi player = m.get(i);
		            System.out.printf("| %-2d      | %-20s | %-15s | %-13s | %-8d | %-7d |%n",
		                              i, player.getName(), player.getCn(), 
		                              player.getRole(), player.getRuns(), player.getWic());
		        }
		        System.out.println("+---------+----------------------+-----------------+---------------+----------+---------+");
			break;
			
			
		case 2 :
			System.out.println("***Captain of Mi***");
			  System.out.println("+----------------------+-----------------+---------------+----------+---------+");
		      System.out.println("|         Name         |     Country     |     Role      |   Runs   | Wickets |");
		      System.out.println("+----------------------+-----------------+---------------+----------+---------+");

		      Mi player1 = m.get(27);
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

//			for (Mi player : m.values()) {
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

			
			Mi name = null;
			int highestRuns = 0;
			System.out.println("***player with highest runs***");

			  System.out.println("+----------------------+-----------------+---------------+----------+---------+");
		      System.out.println("|         Name         |     Country     |     Role      |   Runs   | Wickets |");
		      System.out.println("+----------------------+-----------------+---------------+----------+---------+");

			for (Mi player : m.values()) {
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
			
			Mi n = null;
			int highestwic = 0;
			System.out.println("***player with highest wickets***");

			  System.out.println("+----------------------+-----------------+---------------+----------+---------+");
		      System.out.println("|         Name         |     Country     |     Role      |   Runs   | Wickets |");
		      System.out.println("+----------------------+-----------------+---------------+----------+---------+");

			for (Mi player : m.values()) {
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
			System.out.println("***Batsmans of Team Mi***");
			String players= " ";
			System.out.println("+----------------------+----------+");
			System.out.println("|         Name         |   Runs   |");
		    System.out.println("+----------------------+----------+");

			for (Mi player : m.values()) {
			    if (player.getRole().equals(" Batsman ")) {
			    	System.out.printf("| %-20s | %-8d |",
		            player.getName(), player.getRuns());
			    	System.out.println();
			    }
			}
		    System.out.println("+----------------------+----------+");

			
			break;
			
		case 6:
			System.out.println("***Bowlers of Team Mi***");
			String pl= " ";
			System.out.println("+----------------------+----------+");
			System.out.println("|         Name         |  wickets |");
		    System.out.println("+----------------------+----------+");

			for (Mi player : m.values()) {
			    if (player.getRole().equals(" Bowler ")) {
			    	System.out.printf("| %-20s | %-7d  |",
				            player.getName(), player.getWic());
					    	System.out.println();
			    }
			}
			System.out.println("+----------------------+----------+");
			
			break;
						
			
		case 7:
			System.out.println("***All-rounders of Team Mi***");
			String p= " ";
			System.out.println("+----------------------+----------+----------+");
			System.out.println("|         Name         |   Runs   |  wickets |");
		    System.out.println("+----------------------+----------+----------+");

			for (Mi player : m.values()) {
			    if (player.getRole().equals(" All rounder ")) {
			    	System.out.printf("| %-20s | %-8d | %-7d  |",
				            player.getName(), player.getRuns(),player.getWic());
					    	System.out.println();
			    }
			}
			System.out.println("+----------------------+----------+----------+");
			
			break;
			

	}
		System.out.print("\n1.Go to MI menu\n2.exit from MI"
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
