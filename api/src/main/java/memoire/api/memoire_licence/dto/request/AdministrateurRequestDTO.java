package memoire.api.memoire_licence.dto.request;


import java.io.Serializable;
import java.util.Date;

/**
 * DTO class for "Administrateur"
 *
 * @author Telosys
 *
 */
public class AdministrateurRequestDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nom ;


    private String prenom ;


    private Long telephone ;


    private String email ;


    private String adresse ;


    private String motdepasse ;


    private Integer codedaccess ;

    private Date date_de_naissance;


    /**
     * Constructor
     */
    public AdministrateurRequestDTO() {
		super();
    }
    


    public void setCodedaccess( Integer codedaccess ) {
        this.codedaccess = codedaccess ;
    }
    public Integer getCodedaccess() {
        return this.codedaccess;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Long getTelephone() {
        return telephone;
    }

    public void setTelephone(Long telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getMotdepasse() {
        return motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }

    public Date getDate_de_naissance() {
        return date_de_naissance;
    }

    public void setDate_de_naissance(Date date_de_naissance) {
        this.date_de_naissance = date_de_naissance;
    }

    @Override
	public String toString() { 
		String separator = "|";
		StringBuilder sb = new StringBuilder();
		sb.append("Administrateur[");
		sb.append(separator).append("codedaccess=").append(codedaccess);
		sb.append("]");
		return sb.toString();
	}
}
