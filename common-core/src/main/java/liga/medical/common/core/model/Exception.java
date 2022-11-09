package liga.medical.common.core.model;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.UUID;

@Entity
@Table(name = "exception")
@NoArgsConstructor
public class Exception {

    @Id
    @Column(name = "uuid", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;

    @Column(name = "system_type_id")
    private String systemTypeId;

    @Column(name = "method_params")
    private String methodParams;

    public Exception(String systemTypeId, String methodParams) {
        this.systemTypeId = systemTypeId;
        this.methodParams = methodParams;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getSystemTypeId() {
        return systemTypeId;
    }

    public void setSystemTypeId(String systemTypeId) {
        this.systemTypeId = systemTypeId;
    }

    public String getMethodParams() {
        return methodParams;
    }

    public void setMethodParams(String methodParams) {
        this.methodParams = methodParams;
    }
}
