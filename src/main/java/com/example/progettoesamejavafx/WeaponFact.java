package com.example.progettoesamejavafx;


public class WeaponFact {

    private static WeaponFact instance = null;

    private WeaponFact() {}

    public static synchronized WeaponFact getInstance() {
        if (WeaponFact.instance == null) {
            WeaponFact.instance = new WeaponFact();
        }
        return WeaponFact.instance;
    }

    public Weapon createAWeapon(String rarity, String calibre, String mimetic){
        Weapon weapon = new Weapon();
        weapon.setCalibre(calibre);
        weapon.setMimetic(mimetic);
        weapon.setRarity(rarity);
        return weapon;
    }
}