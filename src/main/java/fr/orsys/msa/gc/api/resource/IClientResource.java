package fr.orsys.msa.gc.api.resource;

import fr.orsys.msa.gc.api.model.Client;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@RequestMapping("/api/clients")
public interface IClientResource {
    @GetMapping
    @Operation(description = "Retourne la liste des clients")
    List<Client> getClients();
}
