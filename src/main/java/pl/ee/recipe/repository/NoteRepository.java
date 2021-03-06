package pl.ee.recipe.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.ee.recipe.model.Note;

@Repository
public interface NoteRepository extends CrudRepository<Note, Long> {
}
