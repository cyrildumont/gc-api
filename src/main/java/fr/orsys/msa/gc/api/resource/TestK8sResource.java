package fr.orsys.msa.gc.api.resource;

import org.springframework.boot.actuate.health.Health;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/down")
public class TestK8sResource {

    public static boolean down = false;

    @GetMapping
    public Boolean down(){
        down = true;
        return true;
    }
}
