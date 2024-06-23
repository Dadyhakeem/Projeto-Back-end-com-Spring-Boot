package com.eventosTec.My_First_Api.domain.coupon;

import java.sql.Date;
import java.util.UUID;

import org.hibernate.annotations.ManyToAny;
import org.yaml.snakeyaml.events.Event;

import com.eventosTec.My_First_Api.domain.eventos.Eventos;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "coupon")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Coupon {

    private UUID id;
    private String code;
    private Integer discount;
    private Date valid;
    @ManyToOne
    @JoinColumn(name = "eventos_id")
    private Eventos eventos;
    
}
