package pharmacie.controller;

import pharmacie.entity.Produit;
import pharmacie.service.ProduitService;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/produits")
public class ProduitController {


    private final ProduitService service;


    public ProduitController(ProduitService service) {
        this.service = service;
    }


    // GET ALL
    @GetMapping
    public List<Produit> getAll() {
        return service.getAll();
    }


    // GET BY ID
    @GetMapping("/{id}")
    public Optional<Produit> getById(@PathVariable Long id) {
        return service.getById(id);
    }


    // POST
    @PostMapping
    public Produit createProduit(@RequestBody Produit produit) {
        return service.save(produit);
    }


    // PUT
    @PutMapping("/{id}")
    public Produit updateProduit(
            @PathVariable Long id,
            @RequestBody Produit produit) {

        produit.setId(id);

        return service.save(produit);
    }


    // DELETE
    @DeleteMapping("/{id}")
    public void deleteProduit(@PathVariable Long id) {
        service.delete(id);
    }

}