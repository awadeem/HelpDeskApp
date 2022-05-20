package alvina.waseem.helpdeskserver.repository;

import alvina.waseem.helpdeskserver.model.HelpRequest;
import org.springframework.data.repository.CrudRepository;

public interface HelpRequestRepo extends CrudRepository<HelpRequest, Long> {
}
