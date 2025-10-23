package memoire.api.memoire_licence.dto.request;



import jakarta.validation.constraints.*;

import java.io.Serializable;

/**
 * DTO class for "Administrateur"
 *
 * @author Telosys
 *
 */
public class AdministrateurRequestDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotBlank(message = "Le nom de famille doit etre renseigner")
    @Size(min=2,message="Le nom doit etre au moins 2 caracteres")
    private String nom ;

    @NotBlank(message = "Le prenom doit etre renseigner")
    @Size(min = 4,message="Le prenom doit etre au moins de 6 caracteres")
    private String prenom;

    @Min(value = 700000000,message = "Le numero de telephone est invalide")
    @Digits(integer = 9,fraction = 0,message="Le numero de telephone est invalide")
    private Long telephone ;

    @NotBlank(message = "Le mail doit être renseigné")
    @Email(message = "email invalide")
    private String email ;

    @NotBlank(message = "L'adresse doit etre renseigner")
    @Size(min=4,message = "l'adresse doit etre au moins de 6 caracteres")
    private String adresse ;

    @NotBlank(message = "Le mot de passe doit etre renseigner")
    @Size(min=8,message = "Le mot doit etre au moins de 8 caracteres")
    private String motdepasse ;

    @Min(value = 1000,message = "Le code doit etre superieur ou egal a 1000")
    @Digits(integer = 4, fraction = 0,message = "Le code d'acces doit etre exactement 4 chiffres")
    private Integer codedaccess ;



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
