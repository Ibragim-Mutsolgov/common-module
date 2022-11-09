package liga.medical.common.core.service.serviceimpl;

import liga.medical.common.core.model.Exception;
import liga.medical.common.core.repository.ExceptionRepository;
import liga.medical.common.core.service.ExceptionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ExceptionServiceImpl implements ExceptionService {

    private ExceptionRepository repository;

    @Override
    public void save(Exception exception) {
        repository.save(exception);
    }
}
