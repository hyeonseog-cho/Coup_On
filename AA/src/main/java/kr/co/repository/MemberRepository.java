package kr.co.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.entity.Member;

public interface MemberRepository extends JpaRepository<Member, String>{

}
