package com.app.pojos;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "TEAMS")
public class Team {
	private Integer teamId;
	private String teamName;
	private String teamRegion;
	private Integer rating;
	private List<Member> members;
	private List<Matches> matchId;
	public Team() {
		// TODO Auto-generated constructor stub
	}
	public Team(String teamName, String teamRegion, Integer rating) {
		super();
		this.teamName = teamName;
		this.teamRegion = teamRegion;
		this.rating = rating;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getTeamId() {
		return teamId;
	}
	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getTeamRegion() {
		return teamRegion;
	}
	public void setTeamRegion(String teamRegion) {
		this.teamRegion = teamRegion;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	@OneToMany(mappedBy = "team",cascade = CascadeType.ALL,orphanRemoval = true)
	public List<Member> getMembers() {
		return members;
	}
	
	public void setMembers(List<Member> members) {
		this.members = members;
	}
	@OneToMany(mappedBy = "teamId",cascade = CascadeType.ALL,orphanRemoval = true)
	public List<Matches> getMatchId() {
		return matchId;
	}
	public void setMatchId(List<Matches> matchId) {
		this.matchId = matchId;
	}
	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName + ", teamRegion=" + teamRegion + ", rating=" + rating
				+ "]";
	}
	
}
