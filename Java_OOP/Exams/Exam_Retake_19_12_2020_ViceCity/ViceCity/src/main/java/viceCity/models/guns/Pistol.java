package viceCity.models.guns;

public class Pistol extends BaseGun{

    private static final int bulletsPerBarrel = 10;
    private static final int totalBullets = 100;

    public Pistol(String name) {
        super(name, bulletsPerBarrel, totalBullets);
    }


// The pistol shoots only one bullet.

//    @Override
//    public int fire() {
//        return super.fire();
//    }
}
