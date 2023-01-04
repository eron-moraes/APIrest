package com.eronapi.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eronapi.api.model.Cliente;

@Repository	
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
