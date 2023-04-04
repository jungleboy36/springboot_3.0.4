package com.achraf.produits.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.achraf.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
