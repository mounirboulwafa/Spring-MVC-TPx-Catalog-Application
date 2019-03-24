package com.mounirboulwafa.springmvctpcatalog.dao;

import com.mounirboulwafa.springmvctpcatalog.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
