package kr.co.entity;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class Match {

	@Enumerated(EnumType.STRING)
	private String game_type;	// 게임 종류
	private String winner_id; 	// 승자 -> Member테이블의 id
	// 탈락한 순서 ? -> 판마다 참여인원이 다름. 칼럼을 최대인원수에 맞게 짠 후 최대인원보다 적은 게임의 경우 후 순위 null?
}
