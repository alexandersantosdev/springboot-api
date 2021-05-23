package com.alexander.produtos.controller;

import com.alexander.produtos.model.ProdutoModel;
import com.alexander.produtos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    @RequestMapping(value = "/produtos", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.FOUND)
    public @ResponseBody List<ProdutoModel> listAll(){

        return (List<ProdutoModel>) produtoRepository.findAll();
    }

    @RequestMapping(value = "/produtos", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody ProdutoModel addProduto(@RequestBody ProdutoModel produto){
        return produtoRepository.save(produto);
    }

}
