package liga.medical.common.core.dto;

import liga.medical.common.core.model.Type;
import lombok.Data;

@Data
public class RabbitMessageDto {

    private Long id;

    private Type type;

    private String description;
}
