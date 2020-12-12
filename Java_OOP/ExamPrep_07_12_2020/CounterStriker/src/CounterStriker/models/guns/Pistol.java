package CounterStriker.models.guns;

public class Pistol extends GunImpl{
    public Pistol(String name, int bulletsCount) {
        super(name, bulletsCount);
    }

    @Override
    public int fire() {
        return super.fire() + 1;
    }
}
