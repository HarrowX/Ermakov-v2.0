package xyz.alexandrit.weapons;


import xyz.alexandrit.weapons.exceptions.GunException;

public final class Magazine {
    private int currentAmmo;
    private final int maxAmmo;
    public static final Magazine MAGAZINE_9AMMO = new Magazine(9, 9);
    static Magazine getDefaultMagazine() {
        return new Magazine(MAGAZINE_9AMMO);
    }
    public boolean decrease() {
        if (!isLoad()) return false;
        --currentAmmo;
        return true;
    }
    public Magazine(int currentAmmo, int maxAmmo) {
        if (maxAmmo < currentAmmo) throw new GunException();
        this.currentAmmo = currentAmmo;
        this.maxAmmo = maxAmmo;
    }
    public Magazine(Magazine magazine) {
        this.currentAmmo = magazine.currentAmmo;
        this.maxAmmo = magazine.maxAmmo;
    }
    public boolean load(int totalAmmo) {
        if (totalAmmo < 0) throw new GunException();
        if (totalAmmo == 0) return false;
        currentAmmo = Math.min(totalAmmo, maxAmmo);
        return true;
    }
    public boolean isLoad() {
        return currentAmmo != 0;
    }
}
