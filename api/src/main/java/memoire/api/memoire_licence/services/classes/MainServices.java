package memoire.api.memoire_licence.services.classes;

import memoire.api.memoire_licence.entities.Prestataire;
import memoire.api.memoire_licence.entities.Proposer;
import memoire.api.memoire_licence.repositories.PrestataireRepository;
import memoire.api.memoire_licence.repositories.ProposerRepository;
import memoire.api.memoire_licence.repositories.ServiceRepository;
import memoire.api.memoire_licence.services.interfaces.MainServicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class MainServices implements MainServicesInterface {

    @Autowired
    ServiceRepository serviceRepository;

    @Autowired
    PrestataireRepository prestataireRepository;

    @Autowired
    ProposerRepository proposerRepository;

    @Override
    public boolean proposerService(int idprestataire, int idservice, String description) {
        Prestataire prestataire=prestataireRepository.findById(idprestataire).orElse(null);
        memoire.api.memoire_licence.entities.Service service=serviceRepository.findById(idservice).orElse(null);

        if(prestataire !=null && service!=null){
            Proposer proposition=new Proposer();
            proposition.setPrestataire(prestataire);
            proposition.setService(service);
            proposition.setDescription_perso(description);


            proposerRepository.save(proposition);

            return true;
        }
        else
            return false;
    }

    @Override
    public List<memoire.api.memoire_licence.entities.Service> servicesProposees() {
        ArrayList<Proposer> propositions=new ArrayList<>();

        Iterator i=proposerRepository.findAll().iterator();

        while(i.hasNext()){
            propositions.add((Proposer) i.next());
        }

        ArrayList<memoire.api.memoire_licence.entities.Service> services=new ArrayList<>();

        for(Proposer proposition:propositions){
            memoire.api.memoire_licence.entities.Service service=proposition.getService();
            if(service!=null)
                services.add(service);
        }

        return services ;
    }
}
