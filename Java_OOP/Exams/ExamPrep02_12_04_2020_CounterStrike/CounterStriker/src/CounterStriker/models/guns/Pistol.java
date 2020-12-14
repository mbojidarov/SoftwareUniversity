package CounterStriker.models.guns;

public class Pistol extends GunImpl{
    public static final int BULLETS = 1;

    public Pistol(String name, int bulletsCount) {
        super(name, bulletsCount);
    }

    @Override
    public int fire() {
        if (super.getBulletsCount() < BULLETS){
            return 0;
        }
        super.decreaseBullets(BULLETS);
        return BULLETS;
    }
}
