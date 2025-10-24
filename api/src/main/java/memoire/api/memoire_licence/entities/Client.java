package memoire.api.memoire_licence.entities;


import java.io.Serializable;
import jakarta.persistence.*;

/**
 * JPA entity class for "Client"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="client", schema="public", catalog="memoire_database" )
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idclient", nullable=false)
    private int        idclient ;


    @OneToOne
    @JoinColumn(name = "idutilisateur", referencedColumnName = "idutilisateur")
    private Utilisateur utilisateur;


    /**
     * Constructor
     */
    public Client() {
		super();
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }



    public void setIdclient(int idclient ) {
        this.idclient = idclient ;
    }
    public int getIdclient() {
        return this.idclient;
    }



    public Utilisateur getUtilisateur() {
        return this.utilisateur;
    } 



}
