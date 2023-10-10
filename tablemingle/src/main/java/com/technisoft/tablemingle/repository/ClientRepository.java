package com.technisoft.tablemingle.repository;

import com.technisoft.tablemingle.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository  extends JpaRepository<Client, Integer> {
}
