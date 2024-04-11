package br.com.santander.mssx.mssx.demo.repository;

import br.com.santander.mssx.mssx.demo.models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAlunoRepository extends JpaRepository<Aluno, Long> {
}
