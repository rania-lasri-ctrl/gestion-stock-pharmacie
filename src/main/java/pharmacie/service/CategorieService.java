package pharmacie.service;

import pharmacie.entity.Categorie;
import pharmacie.repository.CategorieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CategorieService {


    private final CategorieRepository categorieRepository;


    public CategorieService(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }


    public List<Categorie> getAllCategories() {
        return categorieRepository.findAll();
    }


    public Optional<Categorie> getCategorieById(Long id) {
        return categorieRepository.findById(id);
    }


    public Categorie saveCategorie(Categorie categorie) {
        return categorieRepository.save(categorie);
    }


    public void deleteCategorie(Long id) {
        categorieRepository.deleteById(id);
    }

}