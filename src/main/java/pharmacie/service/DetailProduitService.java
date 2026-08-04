package pharmacie.service;

import pharmacie.entity.DetailProduit;
import pharmacie.repository.DetailProduitRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class DetailProduitService {


    private final DetailProduitRepository repository;


    public DetailProduitService(DetailProduitRepository repository) {
        this.repository = repository;
    }


    public List<DetailProduit> getAll(){
        return repository.findAll();
    }


    public Optional<DetailProduit> getById(Long id){
        return repository.findById(id);
    }


    public DetailProduit save(DetailProduit detail){
        return repository.save(detail);
    }


    public void delete(Long id){
        repository.deleteById(id);
    }

}