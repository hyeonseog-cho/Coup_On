package kr.co.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Member {
	
	@Id
	@OneToOne
	@JoinColumn(name = "user_id")
	private String id; 
	private String password;
	private String name;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	private boolean enabled; 
	
}
