package com.eventosTec.My_First_Api.domain.Endereco;

import java.util.UUID;

import com.eventosTec.My_First_Api.domain.eventos.Eventos;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name = "endereco")
@Entity
public class Endereco {

    private UUID id;
    private String cidade;
    private String estado;

    @ManyToOne
    @JoinColumn(name = "enventos_id")
    private Eventos eventos;
    
}
