package liga.medical.common.core.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class DebugDto {

    private UUID uuid;

    private String systemTypeId;

    private String methodParams;
}
