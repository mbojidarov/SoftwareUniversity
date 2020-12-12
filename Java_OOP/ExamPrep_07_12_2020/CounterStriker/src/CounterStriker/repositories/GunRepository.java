package CounterStriker.repositories;

import CounterStriker.models.guns.Gun;

import java.util.Collection;

//      Priema vsqkakav Generic koito extends GUN

public class GunRepository<T extends Gun> implements Repository<T> {
//public class GunRepository<T> implements Repository<Gun>{

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
                .filter(m -> m.getName().equals(name))
                .findFirst().orElse(null);
    }
}
