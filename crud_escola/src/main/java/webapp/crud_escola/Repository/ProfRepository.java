package webapp.crud_escola.Repository;


import org.springframework.data.repository.CrudRepository;


import webapp.crud_escola.Model.Prof;

public interface ProfRepository extends CrudRepository<Prof, String> {
    Prof findByCpf(String cpf);
    Prof findBySenha(String senha);

   
}