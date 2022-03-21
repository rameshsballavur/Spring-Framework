package com.jsp.MavenProject3;

import java.util.List;

public class Ipl {
	private String teamName;
	private String captainName;
	
	private List<String> players;

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCaptainName() {
		return captainName;
	}

	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}

	public List<String> getPlayers() {
		return players;
	}

	public void setPlayers(List<String> players) {
		this.players = players;
	}

	@Override
	public String toString() {
		return "Ipl [teamName=" + teamName + ", captainName=" + captainName + ", players=" + players + "]";
	}
	
	
}
