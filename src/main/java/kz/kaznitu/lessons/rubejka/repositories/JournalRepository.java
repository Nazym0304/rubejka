package kz.kaznitu.lessons.rubejka.repositories;


import kz.kaznitu.lessons.rubejka.models.Journal;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface JournalRepository extends CrudRepository<Journal,Long> {
    Optional<Journal> findById(Long id);
}