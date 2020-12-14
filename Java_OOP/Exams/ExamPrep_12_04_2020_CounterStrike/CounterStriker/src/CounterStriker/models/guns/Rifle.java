package CounterStriker.models.guns;

public class Rifle extends GunImpl{
    public static final int BULLETS = 10;

    public Rifle(String name, int bulletsCount) {
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
