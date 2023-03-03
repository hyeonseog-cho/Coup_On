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
public class Member { // 회원 테이블
	
	@Id
	@OneToOne
	@JoinColumn(name = "user_id")
	private String user_id; 			// 회원 id
	private String user_password;		// 회원 비번
	private String user_name;			// 회원 이름
	
	@Enumerated(EnumType.STRING)
	private Role role;					// 회원 역할
	private boolean enabled; 			// 아이디 사용가능 여부
	
}
