package CounterStriker.repositories;

import CounterStriker.models.guns.Gun;

import java.util.Collection;

//public class GunRepository<T extends Gun> implements Repository<T>{
public class GunRepository<T> implements Repository<Gun>{

    private Collection<Gun> models;



    @Override
    public Collection<Gun> getModels() {
        return null;
    }

    @Override
    public void add(Gun model) {

    }

    @Override
    public boolean remove(Gun model) {
        return false;
    }

    @Override
    public Gun findByName(String name) {
        return null;
    }
}
