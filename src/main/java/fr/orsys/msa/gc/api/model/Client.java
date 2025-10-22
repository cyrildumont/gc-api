package fr.orsys.msa.gc.api.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Client {

    @Id
    private Integer id;
    private String lastname;
    private String firstname;
    @JsonIgnore
    private String city;
    @JsonIgnore
    private String zipCode;
    @JsonIgnore
    private String address;

}
