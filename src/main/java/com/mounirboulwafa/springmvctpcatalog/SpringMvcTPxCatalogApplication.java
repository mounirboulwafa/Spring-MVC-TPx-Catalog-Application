package com.mounirboulwafa.springmvctpcatalog;

import com.mounirboulwafa.springmvctpcatalog.dao.ProduitRepository;
import com.mounirboulwafa.springmvctpcatalog.entities.Produit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringMvcTPxCatalogApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringMvcTPxCatalogApplication.class, args);
        System.out.println("=============================0");
        System.out.println("Project Works !!!");
        ApplicationContext ctx = SpringApplication.run(SpringMvcTPxCatalogApplication.class, args);
        ProduitRepository produitRepository = ctx.getBean(ProduitRepository.class);
//        produitRepository.save(new Produit("Dell XPS 15", 15000, 5));
//        produitRepository.save(new Produit("Lenovo 720", 10000, 3));
//        produitRepository.save(new Produit("Macbook Pro 15", 17000, 2));
//        produitRepository.save(new Produit("HP 562", 9000, 5));

        produitRepository.findAll().forEach(p -> System.out.println(p.getDesignation()));


    }

}
