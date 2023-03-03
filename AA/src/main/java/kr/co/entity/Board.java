package kr.co.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Board { // 게시판 테이블
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int board_idx; 				// 게시글 인덱스
	
	private String board_title; 		// 게시글 제목
	private String board_text; 			// 게시글 내용
	private int board_writer_idx; 		// 게시글 작성자 인덱스
	private String board_date; 			// 게시글 작성일자
	private String board_writer_name; 	// 게시글 작성자 -> Member의 user_name
	
}
