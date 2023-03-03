package kr.co.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.Data;

@Entity
@Data
public class Server {
	
	@Enumerated(EnumType.STRING)
	private String game_type;	// 게임 종류
	
	@Enumerated(EnumType.STRING)
	private Domain game_status;	// 게임 상태
	
	private int max_player;		// 최대 플레이어
	private int now_player;		// 현재 플레이어
}
