package com.tuempresa.libreria.repository;

import com.tuempresa.libreria.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}
