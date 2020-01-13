package com.app.pojos;

import javax.persistence.Entity;
import com.app.pojos.*;
import javax.validation.constraints.Min;
import javax.persistence.*;

@Entity
@Table(name = "LOGIN")
public class Login {
	private Integer id,age;
	private Role role;
	private String name;
	private String email;
	private Member member;
	private String password;
	
	public Login(Integer age, Role role, String name, String email, String password) {
		super();
		this.age = age;
		this.role = role;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	public Login() {}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@OneToOne(mappedBy = "user",cascade = CascadeType.ALL,orphanRemoval = true)
	public Member getMember() {
		return member;
	}
	
	public void setMember(Member member) {
		this.member = member;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Min(value = 18)
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Enumerated(EnumType.STRING)
	public Role getRole() {
		return role;
	}
	
	public void setRole(Role role) {
		this.role = role;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Login [id=" + id + ", age=" + age + ", role=" + role + ", email=" + email + ", password=" + password
				+ "]";
	}
	
}
