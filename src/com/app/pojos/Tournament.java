package com.app.pojos;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "TOURNAMENTS")
public class Tournament {
	private Integer tournamentId;
	private String tournamentName;
	private String location;
	private double prize;
	private String winner;
	private String description;
	private List<Matches> matches;

	
	public Tournament(String tournamentName, String location, double prize, String winner,
			String description) {
		super();
		this.tournamentName = tournamentName;
		this.location = location;
		this.prize = prize;
		this.winner = winner;
		this.description = description;
	}
	
	public Tournament() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getTournamentId() {
		return tournamentId;
	}

	public void setTournamentId(Integer tournamentId) {
		this.tournamentId = tournamentId;
	}
	
	@Column
	@Lob
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getTournamentName() {
		return tournamentName;
	}

	public void setTournamentName(String tournamentName) {
		this.tournamentName = tournamentName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getPrize() {
		return prize;
	}

	public void setPrize(double prize) {
		this.prize = prize;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}
	
	@OneToMany(mappedBy = "tournament_id",cascade = CascadeType.ALL,orphanRemoval = true)
	public List<Matches> getmatches() {
		return matches;
	}
	
	public void setmatches(List<Matches> matches) {
		this.matches = matches;
	}
	
	@Override
	public String toString() {
		return "Tournament [tournamentId=" + tournamentId + ", tournamentName=" + tournamentName + ", location="
				+ location + ", prize=" + prize + ", winner=" + winner + "]";
	}

}
