package memoire.api.memoire_licence.dto.request;

import java.io.Serializable;

public class ServiceRequestDTO implements Serializable {

    private String nom;
    private String description;
    private int idcategorie;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIdcategorie() {
        return idcategorie;
    }

    public void setIdcategorie(int idcategorie) {
        this.idcategorie = idcategorie;
    }
}
