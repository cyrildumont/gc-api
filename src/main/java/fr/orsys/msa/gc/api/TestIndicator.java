package fr.orsys.msa.gc.api;

import fr.orsys.msa.gc.api.resource.TestK8sResource;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class TestIndicator implements HealthIndicator {


    @Override
    public Health health() {
        if(TestK8sResource.down){
            return Health.down(new Exception("Application arretée par l'utilisateur")).build();
        }else{
            return Health.up().build();
        }
    }
}
