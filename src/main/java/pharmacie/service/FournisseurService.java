package pharmacie.service;

import pharmacie.entity.Fournisseur;
import pharmacie.repository.FournisseurRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class FournisseurService {


    private final FournisseurRepository fournisseurRepository;


    public FournisseurService(FournisseurRepository fournisseurRepository) {
        this.fournisseurRepository = fournisseurRepository;
    }


    public List<Fournisseur> getAllFournisseurs() {
        return fournisseurRepository.findAll();
    }


    public Optional<Fournisseur> getFournisseurById(Long id) {
        return fournisseurRepository.findById(id);
    }


    public Fournisseur saveFournisseur(Fournisseur fournisseur) {
        return fournisseurRepository.save(fournisseur);
    }


    public void deleteFournisseur(Long id) {
        fournisseurRepository.deleteById(id);
    }

}