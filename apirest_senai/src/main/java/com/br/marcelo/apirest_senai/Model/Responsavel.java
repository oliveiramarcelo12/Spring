package com.br.marcelo.apirest_senai.Model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;



@Entity
@Setter
@Getter
public class Responsavel implements Serializable {
    //atributos
    @Id
    private Long id;
    private String nome;

 

    
}
