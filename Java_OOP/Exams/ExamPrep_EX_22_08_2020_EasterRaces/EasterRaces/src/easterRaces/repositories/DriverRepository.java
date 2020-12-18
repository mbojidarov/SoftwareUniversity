package easterRaces.repositories;

import easterRaces.entities.drivers.Driver;
import easterRaces.repositories.interfaces.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DriverRepository<T> implements Repository<Driver> {
private Collection<Driver> models;

    public DriverRepository() {
        this.models = new ArrayList<>();
    }

    @Override
    public Driver getByName(String name) {
        for (Driver driver : models) {
            if (driver.getName().equals(name)){
                return driver;
            }
        }
        return null;
    }

    @Override
    public Collection<Driver> getAll() {

        return Collections.unmodifiableCollection(models);

//        return this.models;
    }

    @Override
    public void add(Driver model) {
        this.models.add(model);
    }

    @Override
    public boolean remove(Driver model) {

        return models.remove(model);
    }
}
