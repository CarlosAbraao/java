package com.devcarlos.springboot.carteira.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcarlos.springboot.carteira.model.Usuario;

public interface LancamentoRepository extends JpaRepository<Usuario, Long> {

}
