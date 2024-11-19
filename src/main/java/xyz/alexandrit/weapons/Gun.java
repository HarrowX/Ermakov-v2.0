package xyz.alexandrit.weapons;

import lombok.Getter;

public class Gun extends Weapon{
    @Getter
    private final int maxTotalAmmo;
    private Magazine magazine;

    private static final int DEFAULT_TOTAL_AMMO = 27;
    private static final int DEFAULT_MAX_TOTAL_AMMO = 9;

    private static final Gun DESERT_EAGLE = new Gun(DEFAULT_TOTAL_AMMO, DEFAULT_MAX_TOTAL_AMMO, Magazine.getDefaultMagazine());

    public Gun(int totalAmmo, int maxTotalAmmo, int currentAmmoMagazine, int maxAmmoMagazine) {
        this(totalAmmo, maxTotalAmmo, new Magazine(currentAmmoMagazine, maxAmmoMagazine));
    }

    public Gun(int totalAmmo, int maxTotalAmmo, Magazine magazine) {
        super(totalAmmo);
        this.maxTotalAmmo = maxTotalAmmo;
        this.magazine = magazine;
    }

    public Gun(int totalAmmo, int maxTotalAmmo) {
        this(totalAmmo, maxTotalAmmo, Magazine.getDefaultMagazine());
    }

    public Gun() {
        this(DEFAULT_TOTAL_AMMO, DEFAULT_MAX_TOTAL_AMMO);
    }


    public boolean isLoad() {
        return magazine.isLoad();
    }

    public void shoot() {
        if (magazine.decrease()) {
            System.out.println("бах");
            return;
        }
        System.out.println("клац");
    }


    public boolean reload() {
        return magazine.load(super.ammo());
    }

    public void changeMagazine(Magazine magazine) {
        this.magazine = magazine;
    }

}
