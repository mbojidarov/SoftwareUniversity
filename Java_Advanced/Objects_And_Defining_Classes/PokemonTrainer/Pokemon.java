package PokemonTrainer;

public class Pokemon {
    private String namePokemon;
    private String element;
    private int health;

    public Pokemon (String namePokemon, String element, int health){
        this.namePokemon = namePokemon;
        this.element = element;
        this.health = health;
    }
    public String getElement(){
        return this.element;
    }
    public int getHealth(){
        return this.health;
    }
    public void setHealth(int health){
        this.health -= health;
    }

}
