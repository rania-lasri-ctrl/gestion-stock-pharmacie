package pharmacie.controller;


import pharmacie.entity.Produit;
import pharmacie.service.ProduitService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
public class ProduitWebController {


    private final ProduitService service;


    public ProduitWebController(ProduitService service){

        this.service = service;

    }



    @GetMapping("/produits-page")
    public String produits(Model model){

        model.addAttribute("produits", service.getAll());

        return "produits";

    }




    @GetMapping("/produits/ajouter")
    public String ajouterPage(Model model){

        model.addAttribute("produit", new Produit());

        return "ajouter-produit";

    }




    @PostMapping("/produits/save")
    public String save(@ModelAttribute Produit produit){

        service.save(produit);

        return "redirect:/produits-page";

    }



    @GetMapping("/produits/delete/{id}")
    public String delete(@PathVariable Long id){

        service.delete(id);

        return "redirect:/produits-page";

    }


}