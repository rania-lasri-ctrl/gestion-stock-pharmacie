package pharmacie.repository;

import pharmacie.entity.DetailProduit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailProduitRepository
        extends JpaRepository<DetailProduit, Long> {

}