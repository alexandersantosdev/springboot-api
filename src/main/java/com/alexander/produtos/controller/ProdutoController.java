package com.alexander.produtos.controller;

import com.alexander.produtos.model.ProdutoModel;
import com.alexander.produtos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public @ResponseBody String inicio(){
        return "Inicio";
    }

    @RequestMapping(value = "/sobre", method = RequestMethod.GET)
    public @ResponseBody String sobre(){
        return "Sobre";
    }

    @RequestMapping(value = "/contato", method = RequestMethod.GET)
    public @ResponseBody String contato(){
        return "Contato";
    }

}
