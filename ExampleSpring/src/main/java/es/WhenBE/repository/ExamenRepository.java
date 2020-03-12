package es.WhenBE.repository;

import es.WhenBE.Examen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ExamenRepository extends JpaRepository<Examen, Integer> {
}
