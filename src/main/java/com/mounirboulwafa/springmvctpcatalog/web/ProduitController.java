package com.mounirboulwafa.springmvctpcatalog.web;

import com.mounirboulwafa.springmvctpcatalog.dao.ProduitRepository;
import com.mounirboulwafa.springmvctpcatalog.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProduitController {
    @Autowired
    private ProduitRepository produitRepository;

    @RequestMapping(value = "/index")
    public String index(Model model,
                        @RequestParam(name = "page", defaultValue = "0") int p,
                        @RequestParam(name = "size", defaultValue = "5") int s) {
//        List<Produit> produits = produitRepository.findAll();     //Return all products in one page
//        model.addAttribute("listProduits", produits);

        Page<Produit> pageProduits = produitRepository.findAll(PageRequest.of(p, s));  //Results in Pages
        model.addAttribute("listProduits", pageProduits.getContent());  //getContent() = return result products

        return "produits";
    }
}
