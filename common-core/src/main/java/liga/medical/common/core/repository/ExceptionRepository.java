package liga.medical.common.core.repository;

import liga.medical.common.core.model.Exception;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ExceptionRepository extends JpaRepository<Exception, UUID> {
}
