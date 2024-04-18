package webapp.crud_escola.Model;

import java.io.Serializable;

import jakarta.persistence.Entity;
@Entity
public class Disciplina implements Serializable {
    private String nome;
    private String codigo;

    public Disciplina() {
        // Construtor vazio necessário para frameworks como Spring
    }

    public Disciplina(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
