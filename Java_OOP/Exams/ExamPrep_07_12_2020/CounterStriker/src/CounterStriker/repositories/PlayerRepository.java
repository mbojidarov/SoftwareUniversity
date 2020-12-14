package CounterStriker.repositories;

import CounterStriker.models.players.Player;

import java.util.Collection;

//        Priema vsqkakav Generic koito extends Player

public class PlayerRepository<T extends Player> implements Repository<T> {
    //public class PlayerRepository<T> implements Repository<Player>{

    private Collection<T> models;


    @Override
    public Collection<T> getModels() {
        return models;
    }

    @Override
    public void add(T model) {
        models.add(model);
    }

    @Override
    public boolean remove(T model) {
        return models.remove(model);
    }

    @Override
    public T findByName(String name) {
        return this.models
                .stream()
                .filter(m -> m.getUsername().equals(name))
                .findFirst().orElse(null);
    }
}
