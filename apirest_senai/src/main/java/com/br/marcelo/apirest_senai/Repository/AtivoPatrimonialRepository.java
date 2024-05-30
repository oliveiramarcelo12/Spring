package com.br.marcelo.apirest_senai.Repository;

import org.springframework.data.repository.CrudRepository;

import com.br.marcelo.apirest_senai.Model.Responsavel;

public interface AtivoPatrimonialRepository extends CrudRepository<Responsavel,Long> {
    
}
