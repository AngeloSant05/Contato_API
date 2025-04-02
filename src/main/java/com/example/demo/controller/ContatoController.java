package com.example.demo.controller;

import com.example.demo.model.Contato;
import com.example.demo.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContatoController {

    @Autowired
    private ContatoService contatoService;

    @GetMapping
    public list<Contato> listarTodos () {
        return contatoService.listarTodos();
    }

    @PutMapping
    public
}
