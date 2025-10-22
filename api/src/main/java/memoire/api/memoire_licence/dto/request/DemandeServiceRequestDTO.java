package memoire.api.memoire_licence.dto.request;


import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public class DemandeServiceRequestDTO {

    @NotNull(message = "Vous devez fournir l'id du client")
    private Integer idclient;

    @NotNull(message = "Vous devez fournir l'id du prestataire")
    private Integer idprestataire;

    @NotNull(message = "Vous devez fournir l'id du prestataire")
    private Integer idservice;

    @FutureOrPresent(message = "La date d'une demande ne peut pas etre dans le passe")
    private Date datedemande;

    @NotBlank(message = "Vous devez fournir des details sur la demande")
    private String detailsdemande;

    @NotNull
    @FutureOrPresent(message = "La date du rendez-vous doit etre aujourd'hui ou dans le futur")
    private Date daterendezvous;

    @NotNull(message = "Vous devez fournir l'id du contrat pour cette demande")
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

    public Date getDatedemande() {
        return datedemande;
    }

    public void setDatedemande(Date datedemande) {
        this.datedemande = datedemande;
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
