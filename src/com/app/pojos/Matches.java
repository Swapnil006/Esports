package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name = "MATCHES")
public class Matches {
	private Integer matchId;
	private Team teamId;
	private Tournament tournament_id;
	public Matches() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getMatchId() {
		return matchId;
	}

	public void setMatchId(Integer matchId) {
		this.matchId = matchId;
	}

	@ManyToOne
	@JoinColumn(name = "team_id")
	public Team getTeamId() {
		return teamId;
	}

	public void setTeamId(Team teamId) {
		this.teamId = teamId;
	}
	@ManyToOne
	@JoinColumn(name = "tournament_id")
	public Tournament getTournament_id() {
		return tournament_id;
	}
	public void setTournament_id(Tournament tournament_id) {
		this.tournament_id = tournament_id;
	}
}
