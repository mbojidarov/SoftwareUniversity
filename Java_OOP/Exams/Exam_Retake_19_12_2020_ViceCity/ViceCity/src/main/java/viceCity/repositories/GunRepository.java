package viceCity.repositories;

import viceCity.models.guns.Gun;
import viceCity.repositories.interfaces.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class GunRepository<T> implements Repository<Gun> {
private Collection<Gun> models;

    public GunRepository() {
        this.models = new ArrayList<>();
    }

    @Override
    public Collection<Gun> getModels() {
        return Collections.unmodifiableCollection(models);
    }

    @Override
    public void add(Gun model) {
        if (models.contains(model)){

            //todo return???
        }
        this.models.add(model);
    }

    @Override
    public boolean remove(Gun model) {

        return this.models.remove(model);
    }

    @Override
    public Gun find(String name) {
        return  models.stream().filter(gun -> gun.getName().equals(name)).findFirst().orElse(null);
    }
}
