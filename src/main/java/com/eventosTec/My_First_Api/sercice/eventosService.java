package com.eventosTec.My_First_Api.sercice;

import java.util.Date;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.eventosTec.My_First_Api.domain.eventos.EventoRequestDTO;
import com.eventosTec.My_First_Api.domain.eventos.Eventos;

@Service
public class eventosService {
    public Eventos criarEventos(EventoRequestDTO data)
    {
        String imgUrl = null;
        if (data.image()!= null) 
        {
           imgUrl = this.uploadImg(data.image()) ;
        }

        Eventos newEventos = new Eventos();
        newEventos.setTitulos(data.titulos());
        newEventos.setDescricao(data.descricao());
        newEventos.setEventoUrl(data.eventos_url());
        newEventos.setData(new Date(data.data()) );
        newEventos.setImgUrl(imgUrl);

        return newEventos;

    }

    private String uploadImg(MultipartFile multipartFile)
    {
        return "";
    }



}    
