package pharmacie.controller;


import pharmacie.entity.DetailProduit;
import pharmacie.service.DetailProduitService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/details")
public class DetailProduitController {


    private final DetailProduitService service;


    public DetailProduitController(DetailProduitService service){
        this.service = service;
    }


    @GetMapping
    public List<DetailProduit> getAll(){
        return service.getAll();
    }


    @GetMapping("/{id}")
    public Optional<DetailProduit> getById(@PathVariable Long id){
        return service.getById(id);
    }


    @PostMapping
    public DetailProduit save(@RequestBody DetailProduit detail){
        return service.save(detail);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}