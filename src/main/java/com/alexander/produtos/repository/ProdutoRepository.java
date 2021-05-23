package com.alexander.produtos.repository;

import com.alexander.produtos.model.ProdutoModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProdutoRepository extends CrudRepository<ProdutoModel, Long> {

    List<ProdutoModel> findAll();
    ProdutoModel findByCodigo(Long codigo);
    void delete(ProdutoModel produto);
    <ProdMod extends ProdutoModel>ProdMod save(ProdMod produto);

}
