package com.narine;

public class Main {

    public static void main(String[] args) {

        Weapon flamingSword = new Weapon();
        flamingSword.setNameOfWeapon("Flaming sword");
        flamingSword.setTypeOfWeapon("Divine");


        Boss lucifer = new Boss ();
        lucifer.setHealth(1000);
        lucifer.setDamage(100);
        lucifer.setWeapon(flamingSword);


        System.out.println("Boss: health " + lucifer.getHealth() + ", damage " + lucifer.getDamage()
                + ", weapon name: " + lucifer.getWeapon().getNameOfWeapon()
                + ", weapon type: " + lucifer.getWeapon().getTypeOfWeapon());

        System.out.println("Boss name: Samael (Lucifer) => " + lucifer.info ());

        Skeletons mazikeen = new Skeletons();
        mazikeen.setHealth(200);
        mazikeen.setDamage(20);

        Weapon arrow = new Weapon();
        arrow.setNameOfWeapon("Arrow");
        arrow.setTypeOfWeapon("Fiery");

        mazikeen.setWeapon(arrow);
        mazikeen.setNumberOfArrows(20);

        System.out.println("Skeleton name: Mazikeen => " + mazikeen.info());

    }

}
