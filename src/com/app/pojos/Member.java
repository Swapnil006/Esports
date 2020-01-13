package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name = "MEMBERS")
public class Member {
	private Integer memberId;
	private Login user;
	private Team team;
	private Integer played, win, lost, level;
	private double killDeathRatio;

	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	public Member(Integer played, Integer win, Integer lost, Integer level, double killDeathRatio) {
		super();
		this.played = played;
		this.win = win;
		this.lost = lost;
		this.level = level;
		this.killDeathRatio = killDeathRatio;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getMemberId() {
		return memberId;
	}
	
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	
	public Integer getPlayed() {
		return played;
	}

	public void setPlayed(Integer played) {
		this.played = played;
	}

	public Integer getWin() {
		return win;
	}

	public void setWin(Integer win) {
		this.win = win;
	}

	public Integer getLost() {
		return lost;
	}

	public void setLost(Integer lost) {
		this.lost = lost;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public double getKillDeathRatio() {
		return killDeathRatio;
	}

	public void setKillDeathRatio(double killDeathRatio) {
		this.killDeathRatio = killDeathRatio;
	}

	@OneToOne
	@JoinColumn(name = "member_id")
	public Login getUser() {
		return user;
	}

	public void setUser(Login user) {
		this.user = user;
	}

	@ManyToOne
	@JoinColumn(name = "team_id")
	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "Member [played=" + played + ", win=" + win + ", lost=" + lost + ", level=" + level + ", killDeathRatio="
				+ killDeathRatio + "]";
	}
	
}
