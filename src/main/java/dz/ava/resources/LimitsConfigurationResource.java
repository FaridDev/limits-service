package dz.ava.resources;

import dz.ava.bean.LimitConfiguration;
import dz.ava.configuration.Configuration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LimitsConfigurationResource {

    private final Configuration configuration;

    public LimitsConfigurationResource(Configuration configuration) {
        this.configuration = configuration;
    }

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfiguration(){
        return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }
}
