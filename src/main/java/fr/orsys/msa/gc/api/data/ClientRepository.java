package fr.orsys.msa.gc.api.data;

import fr.orsys.msa.gc.api.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
