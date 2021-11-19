package com.devcarlos.springboot.carteira.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcarlos.springboot.carteira.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}
