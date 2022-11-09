package liga.medical.common.core.service.serviceimpl;

import liga.medical.common.core.model.RabbitMessage;
import liga.medical.common.core.repository.RabbitMessageRepository;
import liga.medical.common.core.service.RabbitMessageService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RabbitMessageServiceImpl implements RabbitMessageService {

    private RabbitMessageRepository repository;

    @Override
    public void save(RabbitMessage rabbitMessage) {
        repository.save(rabbitMessage);
    }
}
