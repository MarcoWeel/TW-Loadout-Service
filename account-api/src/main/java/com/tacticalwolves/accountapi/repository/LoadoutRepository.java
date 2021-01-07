package com.tacticalwolves.accountapi.repository;

import com.tacticalwolves.accountapi.entity.Loadout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoadoutRepository extends JpaRepository<Loadout,Integer> {
}
