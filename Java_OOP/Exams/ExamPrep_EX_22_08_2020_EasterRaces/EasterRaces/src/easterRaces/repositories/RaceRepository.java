package easterRaces.repositories;

import easterRaces.entities.racers.Race;
import easterRaces.repositories.interfaces.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class RaceRepository<T> implements Repository<Race> {
private Collection<Race> models;

    public RaceRepository() {
        this.models = new ArrayList<>();
    }

    @Override
    public Race getByName(String name) {
        for (Race race : models) {
            if (race.getName().equals(name)){
                return race;
            }
        }

        return null;
    }

    @Override
    public Collection<Race> getAll() {

        return Collections.unmodifiableCollection(models);

//        return this.models;
    }

    @Override
    public void add(Race model) {
    this.models.add(model);
    }

    @Override
    public boolean remove(Race model) {
        return models.remove(model);
    }
}
