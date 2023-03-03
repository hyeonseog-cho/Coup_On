package kr.co.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.entity.Server;

public interface ServerRepository extends JpaRepository<Server, String>{

}
