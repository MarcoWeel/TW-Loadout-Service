package com.tacticalwolves.accountapi.repository;

import com.tacticalwolves.accountapi.entity.Loadout;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoadoutRepository extends JpaRepository<Loadout,Integer> {
    List<Loadout> findByUserId(String UserId);
}
