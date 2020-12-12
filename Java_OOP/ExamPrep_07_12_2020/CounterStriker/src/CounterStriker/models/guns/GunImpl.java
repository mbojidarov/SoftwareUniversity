package CounterStriker.models.guns;

public abstract class GunImpl implements Gun {
    private String name;
    private int bulletsCount;

    protected GunImpl(String name, int bulletsCount) {
        this.setName(name);
        this.setBulletsCount(bulletsCount);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setBulletsCount(int bulletsCount) {
        this.bulletsCount = bulletsCount;
    }
    protected void decreaseBullets(int amount){
        this.bulletsCount -= amount;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getBulletsCount() {
        return this.bulletsCount;
    }

    @Override
    public int fire() {
        return 0;
    }
}
