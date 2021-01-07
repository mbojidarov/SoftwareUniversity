package viceCity.models.guns;

public class Rifle extends BaseGun{

    private static final int bulletsPerBarrel = 50;
    private static final int totalBullets = 500;

    public Rifle(String name) {
        super(name, bulletsPerBarrel, totalBullets);
    }

//    The rifle can shoot with 5 bullets

//    @Override
//    public int fire() {
//        return super.fire();
//    }
}
