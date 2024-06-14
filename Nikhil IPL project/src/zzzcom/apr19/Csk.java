package zzzcom.apr19;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class Csk {
	
	String name;
	String cn;
	String role;
	int runs;
	int wic;
	
	public Csk(String n,String cn,String r,int run,int  wic){
		this.name = n;
		this.cn = cn;
		this.role = r;
		this.runs = run;
		this.wic = wic;
	}
	
	
	public static final void csk() {
		System.out.println("\n***Wellcome in Team Csk***");
	Scanner s2 = new Scanner(System.in);
	while (true) {
		
		

		HashMap<Integer ,Csk> m = new LinkedHashMap();

		Scanner s1 = new Scanner(System.in);
		System.out.print("\n1.Show Team of Csk "
				+ "\n2.Captain of Csk"
				+ "\n3.player with highest runs "
				+ "\n4.Player with highest wickets"
				+ "\n5.Batsmans"
				+ "\n6.Bowlers"
				+ "\n7.All-rounders"
				+ "\n\nchoose option :");
		
		int z = s1.nextInt();
		
		m.put(31,new Csk("Ruturaj Gaikwad(c) "," India "," Batsman ", 2038, 0));
		m.put(88,new Csk("Devon Conway "," South Africa "," Batsman ", 924, 0));
		m.put(21,new Csk("Ajinkya Rahane "," India ", " Batsman ", 4560, 1));
		m.put(01,new Csk("Sameer Rizvi "," India ", " Batsman ", 15, 0));
		m.put(7,new Csk("MS Dhoni(wk) "," India ", " Batsman ", 5169, 0));
		m.put(8,new Csk("Ravindra Jadeja "," India ", " All rounder ", 2833, 156));
		m.put(02,new Csk("Daryl Mitchell "," New Zealand "," All rounder ", 168, 1));
		m.put(70,new Csk("Shivam Dube "," India "," All rounder ", 1351, 4));
		m.put(18,new Csk("Moeen Ali "," England "," All rounder ", 1064, 35));
		m.put(90,new Csk("Deepak Chahar "," India "," Bowler ", 80, 76));
		m.put(61,new Csk("Maheesh Theekshana "," Sri lanka ", " Bowler ", 7, 25));
		m.put(03,new Csk("Mustafizur Rahman "," Bangladesh ", " Bowler ", 13, 58));
		m.put(96,new Csk("Tushar Deshpande "," India ", " Bowler ", 21, 31));

		switch (z) {

		case 1:
			System.out.println("\nTeam Chennai Super Kings :\n");

			  System.out.println("+---------+----------------------+-----------------+---------------+----------+---------+");
		      System.out.println("|jersy no |         Name         |     Country     |     Role      |   Runs   | Wickets |");
		      System.out.println("+---------+----------------------+-----------------+---------------+----------+---------+");

		      for (Integer i : m.keySet()) {
		            Csk player = m.get(i);
		            System.out.printf("| %-2d      | %-20s | %-15s | %-13s | %-8d | %-7d |%n",
		                              i, player.getName(), player.getCn(), 
		                              player.getRole(), player.getRuns(), player.getWic());
		        }
		        System.out.println("+---------+----------------------+-----------------+---------------+----------+---------+");
			break;
			
			
		case 2 :
			System.out.println("***Captain of Csk***");
			  System.out.println("+----------------------+-----------------+---------------+----------+---------+");
		      System.out.println("|         Name         |     Country     |     Role      |   Runs   | Wickets |");
		      System.out.println("+----------------------+-----------------+---------------+----------+---------+");

		      Csk player1 = m.get(31);
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

//			for (Csk player : m.values()) {
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

			
			Csk name = null;
			int highestRuns = 0;
			System.out.println("***player with highest runs***");

			  System.out.println("+----------------------+-----------------+---------------+----------+---------+");
		      System.out.println("|         Name         |     Country     |     Role      |   Runs   | Wickets |");
		      System.out.println("+----------------------+-----------------+---------------+----------+---------+");

			for (Csk player : m.values()) {
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
			
			Csk n = null;
			int highestwic = 0;
			System.out.println("***player with highest wickets***");

			  System.out.println("+----------------------+-----------------+---------------+----------+---------+");
		      System.out.println("|         Name         |     Country     |     Role      |   Runs   | Wickets |");
		      System.out.println("+----------------------+-----------------+---------------+----------+---------+");

			for (Csk player : m.values()) {
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
			System.out.println("***Batsmans of Team Csk***");
			String players= " ";
			System.out.println("+----------------------+----------+");
			System.out.println("|         Name         |   Runs   |");
		    System.out.println("+----------------------+----------+");

			for (Csk player : m.values()) {
			    if (player.getRole().equals(" Batsman ")) {
			    	System.out.printf("| %-20s | %-8d |",
		            player.getName(), player.getRuns());
			    	System.out.println();
			    }
			}
		    System.out.println("+----------------------+----------+");

			
			break;
			
		case 6:
			System.out.println("***Bowlers of Team Csk***");
			String pl= " ";
			System.out.println("+----------------------+----------+");
			System.out.println("|         Name         |  wickets |");
		    System.out.println("+----------------------+----------+");

			for (Csk player : m.values()) {
			    if (player.getRole().equals(" Bowler ")) {
			    	System.out.printf("| %-20s | %-7d  |",
				            player.getName(), player.getWic());
					    	System.out.println();
			    }
			}
			System.out.println("+----------------------+----------+");
			
			break;
						
			
		case 7:
			System.out.println("***All-rounders of Team Csk***");
			String p= " ";
			System.out.println("+----------------------+----------+----------+");
			System.out.println("|         Name         |   Runs   |  wickets |");
		    System.out.println("+----------------------+----------+----------+");

			for (Csk player : m.values()) {
			    if (player.getRole().equals(" All rounder ")) {
			    	System.out.printf("| %-20s | %-8d | %-7d  |",
				            player.getName(), player.getRuns(),player.getWic());
					    	System.out.println();
			    }
			}
			System.out.println("+----------------------+----------+----------+");
			
			break;
			

	}
		System.out.print("\n1.Go to Csk menu\n2.exit from Csk"
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
