package com.tuempresa.libreria.repository;

import com.tuempresa.libreria.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
