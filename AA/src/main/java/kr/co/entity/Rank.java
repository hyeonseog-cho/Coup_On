package kr.co.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;


import lombok.Data;

@Entity
@Data
public class Rank {

	@OneToOne(mappedBy = "id")
	private String user_id; 	// 사용자의 id -> Member의 id
	private int macth_count; 	// 게임 수
	private int win_count; 		// 승 수
	private int lose_count;		// 패배 수
}
