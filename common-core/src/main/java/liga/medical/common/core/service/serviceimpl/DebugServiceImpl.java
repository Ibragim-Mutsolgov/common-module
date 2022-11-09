package liga.medical.common.core.service.serviceimpl;

import liga.medical.common.core.model.Debug;
import liga.medical.common.core.repository.DebugRepository;
import liga.medical.common.core.service.DebugService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DebugServiceImpl implements DebugService {

    private DebugRepository repository;

    @Override
    public void save(Debug debug) {
        repository.save(debug);
    }
}
