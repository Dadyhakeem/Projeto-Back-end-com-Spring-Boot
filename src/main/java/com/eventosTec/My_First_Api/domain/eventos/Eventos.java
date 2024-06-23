package com.eventosTec.My_First_Api.domain.eventos;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "eventos")  // este anotacao representa tabela na nossa banco de dados e demos um nome para essa tabela
@Entity  // este anotacao representa Entidades
@Setter // gerar setter automatica com lombok
@Getter  // gerar getter automatica com lombok
@NoArgsConstructor  // gerar construtor sem argumento
@AllArgsConstructor  // gerar construtor com argumento
public class Eventos {
    @Id
    @GeneratedValue  // este anotacao represanta o valor gerado pela propria tabela
    private UUID id;

    private String titulos;
    private String descricao;
    private String imgUrl;
    private String eventoUrl;
    private boolean remote;
    private Date data;
}
