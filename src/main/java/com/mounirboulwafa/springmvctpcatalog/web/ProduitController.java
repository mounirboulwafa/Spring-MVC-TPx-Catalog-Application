package com.mounirboulwafa.springmvctpcatalog.web;

import com.mounirboulwafa.springmvctpcatalog.dao.ProduitRepository;
import com.mounirboulwafa.springmvctpcatalog.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProduitController {
    @Autowired
    private ProduitRepository produitRepository;

    @RequestMapping(value = "/index")
    public String index(Model model) {
        List<Produit> produits = produitRepository.findAll();
        model.addAttribute("listProduits", produits);

        return "produits";
    }
}
