package com.example.demo.init;


import com.example.demo.models.Chef;
import com.example.demo.models.Material;
import com.example.demo.models.FryingPan;


import com.example.demo.services.ChefService;
import com.example.demo.services.MaterialService;
import com.example.demo.services.FryingPanService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class ConsoleRunner implements CommandLineRunner {
    @Autowired
    private FryingPanService fryingPanService;
    @Autowired
    private MaterialService materialService;
    @Autowired
    private ChefService chefService;


    @Override
    public void run(String... args) throws Exception {

        //ДОБАВЛЕНИЕ МАТЕРИАЛОВ
        Material aluminum = new Material("Aluminum");
        materialService.save(aluminum);
        Material steel= new Material("Steel");
        materialService.save(steel);
        Material titanium = new Material("Titanium");
        materialService.save(titanium);

        //ДОБАВЛЕНИЕ ПОВАРОВ
        Chef konstantin = new Chef("Konstantin");
        chefService.add(konstantin);
        Chef alexandr = new Chef("Alexandr");
        chefService.add(alexandr);
        Chef semen = new Chef("Semen");
        chefService.add(semen);

        //ПОИСК МАТЕРИАЛА И ПОВАРА ПО ID
        Material material_1 = materialService.findMaterial(1);
        Chef chef_1 = chefService.findChef(1);
        Material material_2 = materialService.findMaterial(2);
        Chef chef_2 = chefService.findChef(2);
        Material material_3 = materialService.findMaterial(3);
        Chef chef_3 = chefService.findChef(3);


        //ДОБАВЛЕНИЕ СКОВОРОДОК
        FryingPan fryingPan_1 = new FryingPan("Tefal", material_1,chef_1);
        fryingPanService.save(fryingPan_1);
        FryingPan fryingPan_2 = new FryingPan("Gipfel", material_2,chef_2);
        fryingPanService.save(fryingPan_2);
        FryingPan fryingPan_3 = new FryingPan("Rondell", material_3,chef_3);
        fryingPanService.save(fryingPan_3);

        //ПОИСК СКОВОРОДЫ ПО МАТЕРИАЛУ
        fryingPanService.findByMaterial(material_3).forEach(System.out::println);

        //ПОИСК СКОВОРОДЫ ПО ПОВАРУ
        fryingPanService.findByChef(chef_2).forEach(System.out::println);
    }
}
