package fr.orsys.msa.gc.api.resource;

import fr.orsys.msa.gc.api.data.ClientRepository;
import fr.orsys.msa.gc.api.model.Client;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@CrossOrigin
public class ClientResource implements IClientResource {

    final private ClientRepository clientRepository;

    @Override
    public List<Client> getClients(){
        log.trace("Recherche des clients");
        List<Client> clients = clientRepository.findAll();
        log.info("Clients trouvés : {}", clients.size());
        return clients;
    }
}
