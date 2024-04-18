package webapp.crud_escola.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import webapp.crud_escola.Model.Disciplina;

public interface DisciplinaRepository extends JpaRepository<Disciplina, String> {
    List<Disciplina> findByNome(String nome);
}
