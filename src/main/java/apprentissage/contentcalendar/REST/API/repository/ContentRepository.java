package apprentissage.contentcalendar.REST.API.repository;

import apprentissage.contentcalendar.REST.API.model.Content;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;


public interface ContentRepository extends ListCrudRepository<Content,Integer> {
    List<Content> findAllByContentType(String type);
}