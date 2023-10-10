package com.technisoft.tablemingle.repository;

import com.technisoft.tablemingle.model.DiningTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DinnerTableRepository extends JpaRepository<DiningTable, Integer> {

}
