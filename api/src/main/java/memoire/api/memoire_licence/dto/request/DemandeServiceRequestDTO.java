package memoire.api.memoire_licence.dto.request;

import java.util.Date;

public class DemandeServiceRequestDTO {

    private int idclient;

    private int idprestataire;

    private int idservice;

    private Date datedemande;

    private String detailsdemande;

    private Date daterendezvous;

    private int idcontrat;

    public int getIdclient() {
        return idclient;
    }

    public void setIdclient(int idclient) {
        this.idclient = idclient;
    }

    public int getIdprestataire() {
        return idprestataire;
    }

    public void setIdprestataire(int idprestataire) {
        this.idprestataire = idprestataire;
    }

    public int getIdservice() {
        return idservice;
    }

    public void setIdservice(int idservice) {
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

    public int getIdcontrat() {
        return idcontrat;
    }

    public void setIdcontrat(int idcontrat) {
        this.idcontrat = idcontrat;
    }
}
