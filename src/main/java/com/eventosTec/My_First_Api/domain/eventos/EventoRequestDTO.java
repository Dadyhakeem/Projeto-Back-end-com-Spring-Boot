package com.eventosTec.My_First_Api.domain.eventos;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public record EventoRequestDTO(String titulos,String descricao,Long data,String cidade,String estado,Boolean remote,String eventos_url ,MultipartFile image) {
    
}
 // parei no 43 minutos