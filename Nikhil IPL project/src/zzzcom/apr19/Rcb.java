package zzzcom.apr19;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class Rcb {
	
	String name;
	String cn;
	String role;
	int runs;
	int wic;
	
	public Rcb(String n,String cn,String r,int run,int  wic){
		this.name = n;
		this.cn = cn;
		this.role = r;
		this.runs = run;
		this.wic = wic;
	}
	
	
	public static final void rcb() {
		System.out.println("\n***Wellcome in Team Rcb***");
	Scanner s2 = new Scanner(System.in);
	while (true) {
		
		

		HashMap<Integer ,Rcb> m = new LinkedHashMap();

		Scanner s1 = new Scanner(System.in);
		System.out.print("\n1.Show Team of Rcb "
				+ "\n2.Captain of Rcb"
				+ "\n3.player with highest runs "
				+ "\n4.Player with highest wickets"
				+ "\n5.Batsmans"
				+ "\n6.Bowlers"
				+ "\n7.All-rounders"
				+ "\n\nchoose option :");
		
		int z = s1.nextInt();
		
		m.put(13,new Rcb("Faf du Plessis(c) "," South Africa "," Batsman ", 4365, 0));
		m.put(18,new Rcb("Virat Kohli "," India "," Batsman ", 7624, 4));
		m.put(97,new Rcb("Rajat Patidar "," India ", " Batsman ", 513, 0));
		m.put(19,new Rcb("Dinesh Karthik(wk) "," India ", " Batsman ", 4742, 0));
		m.put(32,new Rcb("Glenn Maxwell "," Australia ", " All rounder ", 2751, 35));
		m.put(42,new Rcb("Cameron Green "," Australia "," All rounder ", 520, 8));
		m.put(01,new Rcb("Mahipal Lomror "," India "," All rounder ", 471, 1));
		m.put(02,new Rcb("Karn Sharma "," India "," All rounder ", 319, 70));
		m.put(03,new Rcb("Alzarri Joseph "," West Indies ", " Bowler ", 27, 21));
		m.put(04,new Rcb("Lockie Ferguson "," New zealand "," Bowler ", 67, 39));
		m.put(73,new Rcb("Mohammed Siraj "," India ", " Bowler ", 	109, 86));
		m.put(11,new Rcb("Yash Dayal "," India ", " Bowler ", 0, 18));
		m.put(11,new Rcb("Akash Deep "," India ", " Bowler ", 19, 7));

		switch (z) {
		
		case 1:
			System.out.println("\nTeam Royal Challengers Banglore :\n");

			  System.out.println("+---------+----------------------+-----------------+---------------+----------+---------+");
		      System.out.println("|jersy no |         Name         |     Country     |     Role      |   Runs   | Wickets |");
		      System.out.println("+---------+----------------------+-----------------+---------------+----------+---------+");

		      for (Integer i : m.keySet()) {
		    	  Rcb player = m.get(i);
		            System.out.printf("| %-2d      | %-20s | %-15s | %-13s | %-8d | %-7d |%n",
		                              i, player.getName(), player.getCn(), 
		                              player.getRole(), player.getRuns(), player.getWic());
		        }
		        System.out.println("+---------+----------------------+-----------------+---------------+----------+---------+");
			break;

		case 2:
			
			System.out.println("***Captain of Rcb***");
			  System.out.println("+----------------------+-----------------+---------------+----------+---------+");
		      System.out.println("|         Name         |     Country     |     Role      |   Runs   | Wickets |");
		      System.out.println("+----------------------+-----------------+---------------+----------+---------+");

		      Rcb player1 = m.get(13);
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

//			for (Rcb player : m.values()) {
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

			
			Rcb name = null;
			int highestRuns = 0;
			System.out.println("***player with highest runs***");

			  System.out.println("+----------------------+-----------------+---------------+----------+---------+");
		      System.out.println("|         Name         |     Country     |     Role      |   Runs   | Wickets |");
		      System.out.println("+----------------------+-----------------+---------------+----------+---------+");

			for (Rcb player : m.values()) {
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
			
			Rcb n = null;
			int highestwic = 0;
			System.out.println("***player with highest wickets***");

			  System.out.println("+----------------------+-----------------+---------------+----------+---------+");
		      System.out.println("|         Name         |     Country     |     Role      |   Runs   | Wickets |");
		      System.out.println("+----------------------+-----------------+---------------+----------+---------+");

			for (Rcb player : m.values()) {
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
			System.out.println("***Batsmans of Team Rcb***");
			String players= " ";
			System.out.println("+----------------------+----------+");
			System.out.println("|         Name         |   Runs   |");
		    System.out.println("+----------------------+----------+");

			for (Rcb player : m.values()) {
			    if (player.getRole().equals(" Batsman ")) {
			    	System.out.printf("| %-20s | %-8d |",
		            player.getName(), player.getRuns());
			    	System.out.println();
			    }
			}
		    System.out.println("+----------------------+----------+");

			
			break;
			
		case 6:
			System.out.println("***Bowlers of Team Rcb***");
			String pl= " ";
			System.out.println("+----------------------+----------+");
			System.out.println("|         Name         |  wickets |");
		    System.out.println("+----------------------+----------+");

			for (Rcb player : m.values()) {
			    if (player.getRole().equals(" Bowler ")) {
			    	System.out.printf("| %-20s | %-7d  |",
				            player.getName(), player.getWic());
					    	System.out.println();
			    }
			}
			System.out.println("+----------------------+----------+");
			
			break;
						
			
		case 7:
			System.out.println("***All-rounders of Team Rcb***");
			String p= " ";
			System.out.println("+----------------------+----------+----------+");
			System.out.println("|         Name         |   Runs   |  wickets |");
		    System.out.println("+----------------------+----------+----------+");

			for (Rcb player : m.values()) {
			    if (player.getRole().equals(" All rounder ")) {
			    	System.out.printf("| %-20s | %-8d | %-7d  |",
				            player.getName(), player.getRuns(),player.getWic());
					    	System.out.println();
			    }
			}
			System.out.println("+----------------------+----------+----------+");
			
			break;
			

	}
		System.out.print("\n1.Go to Rcb menu\n2.exit from Rcb"
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
