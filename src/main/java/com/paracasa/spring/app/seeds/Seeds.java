package com.paracasa.spring.app.seeds;

import com.paracasa.spring.app.model.Menu;
import com.paracasa.spring.app.model.Product;
import com.paracasa.spring.app.repository.MenuRepository;
import com.paracasa.spring.app.repository.ProductRepository;


public class Seeds {
    private MenuRepository menuRepository;
    private ProductRepository productRepository;

    public Seeds(MenuRepository menuRepository, ProductRepository productRepository)  {
        this.menuRepository = menuRepository;
        this.productRepository = productRepository;
    }

    public void generateSeeds(){
        Menu menuMixto = new Menu("Mixto", 30.5);
        Menu menuVegano = new Menu("Vegano", 20);
        Menu menuCarnivoro = new Menu("Carnivoro", 25);
        menuRepository.save(menuMixto);
        menuRepository.save(menuVegano);
        menuRepository.save(menuCarnivoro);

        Product productPollo = new Product("Pollo",2.00);
        Product productVacuno = new Product("Vacuno",4.00);
        Product productGarbanzos = new Product("Garbanzos",3.50);
        Product productTernera = new Product("Ternera",5.50);
        Product productGamabas = new Product("Gambas",2.00);
        productRepository.save(productPollo);
        productRepository.save(productVacuno);
        productRepository.save(productGarbanzos);
        productRepository.save(productTernera);
        productRepository.save(productGamabas);



    }
}




