package xyz.alexandrit.weapons;

public class Fithger {
    private String name;
    private Gun gun;

    public Fithger(String name) {
        this.name = name;
    }
    public void takeGun(Gun gun) {
        this.gun =gun;
    }
    public Gun dropGun() {
        Gun copy = this.gun;
        this.gun = null;
        return copy;
    }
    public boolean canFight() {
        return haveGun() && gun.isLoad();
    }
    public boolean haveGun() {
        return gun != null;
    }
    public void fight() {
        if (!canFight()) {
            System.out.println("I CANT FIGHT");
            return;
        }
        gun.shoot();
    }
}
