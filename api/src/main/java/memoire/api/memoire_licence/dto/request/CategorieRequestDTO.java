package memoire.api.memoire_licence.dto.request;

import java.io.Serializable;

public class CategorieRequestDTO implements Serializable {

    private String libelle;

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
