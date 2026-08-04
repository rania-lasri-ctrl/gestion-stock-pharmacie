package pharmacie.service;

import pharmacie.entity.Produit;
import pharmacie.repository.ProduitRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProduitService {

    private final ProduitRepository repository;


    public ProduitService(ProduitRepository repository) {
        this.repository = repository;
    }


    // récupérer tous les produits
    public List<Produit> getAll() {
        return repository.findAll();
    }


    // récupérer un produit par id
    public Optional<Produit> getById(Long id) {
        return repository.findById(id);
    }


    // ajouter / modifier produit
    public Produit save(Produit produit) {
        return repository.save(produit);
    }


    // supprimer produit
    public void delete(Long id) {
        repository.deleteById(id);
    }
}