package kr.co.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.entity.Match;

public interface MatchRepository extends JpaRepository<Match, String>{

}
