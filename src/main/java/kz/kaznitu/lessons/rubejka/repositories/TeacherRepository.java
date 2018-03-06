package kz.kaznitu.lessons.rubejka.repositories;

import kz.kaznitu.lessons.rubejka.models.Teacher;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TeacherRepository extends CrudRepository<Teacher, Long> {
    Optional<Teacher> findById(Long id);

}


