package CounterStriker.repositories;

import CounterStriker.models.players.Player;

import java.util.Collection;

//public class PlayerRepository<T extends Player> implements Repository<T>{
    public class PlayerRepository<T> implements Repository<Player>{


    @Override
    public Collection<Player> getModels() {
        return null;
    }

    @Override
    public void add(Player model) {

    }

    @Override
    public boolean remove(Player model) {
        return false;
    }

    @Override
    public Player findByName(String name) {
        return null;
    }
}
