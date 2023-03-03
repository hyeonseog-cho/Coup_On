package kr.co.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.entity.Board;

public interface BoardRepository extends JpaRepository<Board, String> {

}
