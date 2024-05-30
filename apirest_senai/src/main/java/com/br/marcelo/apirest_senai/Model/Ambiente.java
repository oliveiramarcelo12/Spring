package com.br.marcelo.apirest_senai.Model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
@Entity
@Setter
@Getter
public class Ambiente implements Serializable {
    //atributos
    @Id
    private Long id;
    private String nome;
    @ManyToOne
    @JoinColumn( name = "id_responsavel")
    private Responsavel responsavel;
    
}
