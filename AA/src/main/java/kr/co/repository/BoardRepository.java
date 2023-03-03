package kr.co.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.entity.Board;

// Repository -> DB연결을 담당하지만 ServiceImpl에서 Repository의 함수를 이용하기 때문에 공백란으로 남겨둠
public interface BoardRepository extends JpaRepository<Board, String> {
}
