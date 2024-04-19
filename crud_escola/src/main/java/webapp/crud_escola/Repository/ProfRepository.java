package webapp.crud_escola.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import webapp.crud_escola.Model.Prof;

public interface ProfRepository extends CrudRepository<Prof, String> {
    Prof findByCpf(String cpf);
    Prof findBySenha(String senha);

    @Query("SELECT p FROM Prof p JOIN p.disciplinas d WHERE d.nome = :nomeDisciplina")
    List<Prof> findByDisciplinasNome(@Param("nomeDisciplina") String nomeDisciplina);
}