package pharmacie.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Produit {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String nom;

    private String description;

    private Double prix;

    private String codeBarre;

    private LocalDate dateExpiration;



    // Plusieurs produits appartiennent à une seule catégorie
    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;



    // Plusieurs produits appartiennent à un seul fournisseur
    @ManyToOne
    @JoinColumn(name = "fournisseur_id")
    private Fournisseur fournisseur;



    // Un produit possède un seul détail
    @OneToOne
    @JoinColumn(name = "detail_id")
    private DetailProduit detailProduit;



    // Plusieurs produits possèdent plusieurs tags
    @ManyToMany
    @JoinTable(
            name = "produit_tag",
            joinColumns = @JoinColumn(name = "produit_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private List<Tag> tags;

}