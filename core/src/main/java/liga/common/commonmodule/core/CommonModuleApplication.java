package liga.common.commonmodule.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"liga.common.commonmodule", "liga.common.commonmodule.core"})
public class CommonModuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonModuleApplication.class, args);
    }

}
