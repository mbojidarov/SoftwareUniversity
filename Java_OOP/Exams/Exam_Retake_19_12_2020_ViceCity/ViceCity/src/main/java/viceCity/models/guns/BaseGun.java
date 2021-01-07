package viceCity.models.guns;

import static viceCity.common.ExceptionMessages.*;

public abstract class BaseGun implements Gun{
    private String name;
    private int bulletsPerBarrel;
    private int totalBullets;
    private boolean canFire;

    protected BaseGun(String name, int bulletsPerBarrel, int totalBullets) {
        this.setName(name);
        this.setBulletsPerBarrel(bulletsPerBarrel);
        this.setTotalBullets(totalBullets);
        this.canFire();
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            throw new NullPointerException(NAME_NULL);
        }
        this.name = name;
    }

    public void setBulletsPerBarrel(int bulletsPerBarrel) {
//        o	The initial BulletsInBarrel count is the actual capacity of the barrel!
        if (bulletsPerBarrel < 0){
            throw new IllegalArgumentException(BULLETS_LESS_THAN_ZERO);
        }
        this.bulletsPerBarrel = bulletsPerBarrel;
    }

    public void setTotalBullets(int totalBullets) {
        if (totalBullets < 0){
            throw new IllegalArgumentException(TOTAL_BULLETS_LESS_THAN_ZERO);
        }
        this.totalBullets = totalBullets;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getBulletsPerBarrel() {
        return this.bulletsPerBarrel;
    }

    @Override
    public boolean canFire() {

        return false;
    }

    @Override
    public int getTotalBullets() {
        return this.totalBullets;
    }

//    The Fire method acts different in all child classes.
//    It shoots bullets and returns the number of bullets that were shot.
//    Here is how it works:
//•	Your guns have a barrel, which have a certain capacity for bullets and you shoot a different count of bullets when you pull the trigger.
//•	If your barrel becomes empty, you need to reload before you can shoot again.
//•	Reloading is done by refilling the whole barrel of the gun (Keep in mind, that every barrel has capacity).
//•	The bullets you take for reloading are taken from the gun's total bullets stock.
//Keep in mind, that every type of gun shoots different count of bullets, when you pull the trigger!

    @Override
    public int fire() {

        return 0;
    }
}
