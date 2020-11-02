package PokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String nameTrainer;
    private int badges;
    private List<Pokemon> data;

    public Trainer(String nameTrainer){
        this.nameTrainer = nameTrainer;
        this.badges = 0;
        this.data = new ArrayList<>();
    }

    public List<Pokemon> getData() {
        return this.data;
    }

    public void addPokemon(Pokemon pokemon){
        this.data.add(pokemon);
    }
    //remove pokemon
    public void removePokemon(){
        for (Pokemon pokemon : data) {
           if (pokemon.getHealth() <= 0){
               this.data.remove(pokemon);
           }
        }
    }
    public boolean pokemonHasElement(String element){
        for (Pokemon pokemon : data) {
            if (pokemon.getElement().equals(element)){
                return true;
            }
        }
        return false;
    }

    public int getBadges() {
        return badges;
    }

    public void setBadges(int value) {
        this.badges += value;
    }

    public void removeHealth() {
        for (Pokemon pokemon : data) {
            pokemon.setHealth(10);
        }
    }
}

