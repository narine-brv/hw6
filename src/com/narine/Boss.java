package com.narine;

public class Boss extends GameEntity {

    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String info () {
        return super.info () + ", weapon name " + weapon.getNameOfWeapon() +
                ", weapon type " + weapon.getTypeOfWeapon();
    }


}
