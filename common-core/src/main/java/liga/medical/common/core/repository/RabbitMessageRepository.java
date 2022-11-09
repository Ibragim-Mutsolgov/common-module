package liga.medical.common.core.repository;

import liga.medical.common.core.model.RabbitMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RabbitMessageRepository extends JpaRepository<RabbitMessage, Long> {
}
