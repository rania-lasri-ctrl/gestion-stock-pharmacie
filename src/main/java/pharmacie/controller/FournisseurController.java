package pharmacie.controller;

import org.springframework.web.bind.annotation.*;
import pharmacie.entity.Fournisseur;
import pharmacie.service.FournisseurService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/fournisseurs")
public class FournisseurController {

    private final FournisseurService fournisseurService;

    public FournisseurController(FournisseurService fournisseurService) {
        this.fournisseurService = fournisseurService;
    }

    @GetMapping
    public List<Fournisseur> getAllFournisseurs() {
        return fournisseurService.getAllFournisseurs();
    }

    @GetMapping("/{id}")
    public Optional<Fournisseur> getFournisseurById(@PathVariable Long id) {
        return fournisseurService.getFournisseurById(id);
    }

    @PostMapping
    public Fournisseur createFournisseur(@RequestBody Fournisseur fournisseur) {
        return fournisseurService.saveFournisseur(fournisseur);
    }

    @DeleteMapping("/{id}")
    public void deleteFournisseur(@PathVariable Long id) {
        fournisseurService.deleteFournisseur(id);
    }
}