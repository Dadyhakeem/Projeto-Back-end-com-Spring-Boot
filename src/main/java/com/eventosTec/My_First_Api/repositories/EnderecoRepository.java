package com.eventosTec.My_First_Api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventosTec.My_First_Api.domain.Endereco.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco,UUID> {

    

    
}
