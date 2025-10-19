package memoire.api.memoire_licence.dto.request;

import java.math.BigDecimal;

public class ContratRequestDTO {

    private String horaires ;
    private String jours ;
    private BigDecimal montantSalaire ;
    private Integer duree ;


    public String getHoraires() {
        return horaires;
    }

    public void setHoraires(String horaires) {
        this.horaires = horaires;
    }

    public BigDecimal getMontantSalaire() {
        return montantSalaire;
    }

    public void setMontantSalaire(BigDecimal montantSalaire) {
        this.montantSalaire = montantSalaire;
    }

    public String getJours() {
        return jours;
    }

    public void setJours(String jours) {
        this.jours = jours;
    }

    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }
}
