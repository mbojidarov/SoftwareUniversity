package CounterStriker.models.players;

import CounterStriker.models.guns.Gun;

public abstract class PlayerImpl implements Player{
    private String username;
    private int health;
    private int armor;
    private boolean isLive;
    private Gun gun;

    protected PlayerImpl(String username, int health, int armor, Gun gun) {
        this.setUsername(username);
        this.setHealth(health);
        this.setArmor(armor);
        this.setGun(gun);
        this.setLive(isLive);
    }

    protected void setUsername(String username) {
        this.username = username;
    }

    protected void setHealth(int health) {
        this.health = health;
    }

    protected void setArmor(int armor) {
        this.armor = armor;
    }

    protected void setLive(boolean live) {
        isLive = live;
    }

    protected void setGun(Gun gun) {
        this.gun = gun;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public int getHealth() {
        return 0;
    }

    @Override
    public int getArmor() {
        return 0;
    }

    @Override
    public Gun getGun() {
        return null;
    }

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }

    @Override
    public void takeDamage(int points) {
        int damage = points;
        if (damage >= this.getArmor()){
            damage -= this.getArmor();
            this.armor = 0;
            this.health -= damage;
        }else{
            this.armor -= damage;
        }
    }
}
