package memoire.api.memoire_licence.dto.request;


import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public class DemandeServiceRequestDTO {

    @NotNull(message = "Vous devez fournir l'id du client")
    @Min(value = 1,message = "L'id du client doit etre renseigner")
    private Integer idclient;

    @NotNull(message = "Vous devez fournir l'id du prestataire")
    @Min(value = 1,message = "L'id du prestataire doit etre renseigner")
    private Integer idprestataire;

    @NotNull(message = "Vous devez fournir l'id du prestataire")
    @Min(value = 1,message = "L'id du service doit etre renseigner")
    private Integer idservice;

    @NotBlank(message = "Vous devez fournir des details sur la demande")
    private String detailsdemande;

    @NotNull
    @FutureOrPresent(message = "La date du rendez-vous doit etre aujourd'hui ou dans le futur")
    private Date daterendezvous;

    @NotNull(message = "Vous devez fournir l'id du contrat pour cette demande")
    @Min(value = 1,message = "L'id du contrat doit etre renseigner")
    private Integer idcontrat;

    public Integer getIdclient() {
        return idclient;
    }

    public void setIdclient(Integer idclient) {
        this.idclient = idclient;
    }

    public Integer getIdprestataire() {
        return idprestataire;
    }

    public void setIdprestataire(Integer idprestataire) {
        this.idprestataire = idprestataire;
    }

    public Integer getIdservice() {
        return idservice;
    }

    public void setIdservice(Integer idservice) {
        this.idservice = idservice;
    }


    public String getDetailsdemande() {
        return detailsdemande;
    }

    public void setDetailsdemande(String detailsdemande) {
        this.detailsdemande = detailsdemande;
    }

    public Date getDaterendezvous() {
        return daterendezvous;
    }

    public void setDaterendezvous(Date daterendezvous) {
        this.daterendezvous = daterendezvous;
    }

    public Integer getIdcontrat() {
        return idcontrat;
    }

    public void setIdcontrat(Integer idcontrat) {
        this.idcontrat = idcontrat;
    }
}
