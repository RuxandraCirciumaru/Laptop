package org.example;

import componente.MemorieRam;
import componente.MemorieSSd;
import electronice.laptop;

public class Main {
    public static void main(String[] args) {
        MemorieRam Ram = new MemorieRam("DDR3", 16, "GB");
        MemorieSSd memorie = new MemorieSSd(256, "GB");
        laptop laptop = new laptop("Asus","Negru",15.5,memorie,Ram);


        System.out.println("Detalii laptop:");
        System.out.println("Marca: " + laptop.getMarca());
        System.out.println("Culoare: " + laptop.getCuloare());
        System.out.println("Dimensiune ecran: " + laptop.getDimensiuneEcran());
        System.out.println();
        System.out.println("Memorie RAM:");
        System.out.println("Tip memorie RAM: " + laptop.getMemorieRam().getTipMemorie());
        System.out.println("Unitatea de masura Memorie RAM: " + laptop.getMemorieRam().getUnitateDeMasura());
        System.out.println("Capacitate memorie RAM: " + laptop.getMemorieRam().getCapacitate());
        System.out.println();
        System.out.println("Spatiu de stocare SSD:");
        System.out.println("Capacitate stocare SSD: " + laptop.getMemorieSSd().getCapacitateStocare());
        System.out.println("Unitate de masura stocare SSD: " + laptop.getMemorieSSd().getUnitMasura());

        System.out.println();
        System.out.println("Detalii laptop nou:");
        laptop.setCuloare("Rosu");
        System.out.println("Culoare laptop noua: " + laptop.getCuloare());
        laptop.setMarca("HP");
        System.out.println("Marca noua laptop: " + laptop.getMarca());
        laptop.setDimensiuneEcran(17.50);
        System.out.println("Dimensiune ecran HP: " + laptop.getDimensiuneEcran());

        System.out.println();
        System.out.println("Memorie RAM modificata:");
        laptop.setMemorieRam(new MemorieRam("DDR", 32, "GB"));
        System.out.println("Unitate masura RAM: " + laptop.getMemorieRam().getTipMemorie());
        System.out.println("Unitare masura: " + laptop.getMemorieRam().getUnitateDeMasura());
        System.out.println("Capacitate memorie noua: " + laptop.getMemorieRam().getCapacitate());

        System.out.println();
        System.out.println("Spatiu de stocare SSD nou:");
        laptop.setMemorieSSd(new MemorieSSd(350, "GB"));
        System.out.println("Unitare masura: " + laptop.getMemorieSSd().getUnitMasura());
        System.out.println("Capacitate stocare SSD nou: " + laptop.getMemorieSSd().getCapacitateStocare());

    }
}