package com.gaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gaming.entities.Teams;

@Repository
public interface TeamsRepo extends JpaRepository<Teams,Integer>{

}
