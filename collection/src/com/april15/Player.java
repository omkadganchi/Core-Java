package com.april15;

public class Player {
	private int jerseyNumber;
	private String name;
	private int runs;
	private int wickets;
	
	public Player(int jerseyNumber, String name, int runs, int wickets) {
		super();
		this.jerseyNumber = jerseyNumber;
		this.name = name;
		this.runs = runs;
		this.wickets = wickets;
	}

	public int getJerseyNumber() {
		return jerseyNumber;
	}

	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	@Override
	public String toString() {
		return name;
	}
}
