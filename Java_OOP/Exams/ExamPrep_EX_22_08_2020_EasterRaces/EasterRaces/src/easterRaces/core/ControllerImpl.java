package easterRaces.core;

import easterRaces.core.interfaces.Controller;
import easterRaces.entities.cars.Car;
import easterRaces.entities.cars.MuscleCar;
import easterRaces.entities.cars.SportsCar;
import easterRaces.entities.drivers.Driver;
import easterRaces.entities.drivers.DriverImpl;
import easterRaces.entities.racers.Race;
import easterRaces.entities.racers.RaceImpl;
import easterRaces.repositories.CarRepository;
import easterRaces.repositories.interfaces.Repository;

import java.util.List;
import java.util.stream.Collectors;

import static easterRaces.common.ExceptionMessages.*;
import static easterRaces.common.OutputMessages.*;

public class ControllerImpl implements Controller {
    private Repository<Driver> driversRepository;
    private Repository<Car> carsRepository;
    private Repository<Race> racesRepository;

    public ControllerImpl(Repository<Driver> driversRepository, Repository<Car> carsRepository, Repository<Race> racesRepository) {
        this.driversRepository = driversRepository;
        this.carsRepository = carsRepository;
        this.racesRepository = racesRepository;
    }

    @Override
    public String createDriver(String driver) {

        Driver driverNew = new DriverImpl(driver);

        if (driversRepository.getAll().contains(driverNew)) {
            throw new IllegalArgumentException(String.format(DRIVER_EXISTS, driver));
        }
        this.driversRepository.add(driverNew);
        return String.format(DRIVER_CREATED, driver);
    }

    @Override
    public String createCar(String type, String model, int horsePower) {
        Car car;
        if ("Muscle".equals(type)) {
            car = new MuscleCar(model, horsePower);

            if (carsRepository.getAll().contains(car)) {
                throw new IllegalArgumentException(String.format(CAR_EXISTS, model));
            }

            this.carsRepository.add(car);
            return String.format(CAR_CREATED, car.getClass().getSimpleName(), model);

        } else if ("Sports".equals(type)) {
            car = new SportsCar(model, horsePower);

            if (carsRepository.getAll().contains(car)) {
                throw new IllegalArgumentException(String.format(CAR_EXISTS, model));
            }

            this.carsRepository.add(car);
            return String.format(CAR_CREATED, car.getClass().getSimpleName(), model);

        }
        return null;
    }

    @Override
    public String addCarToDriver(String driverName, String carModel) {

        Driver driverNew = this.driversRepository.getByName(driverName);

        if (!driversRepository.getAll().contains(driverNew)) {
            throw new IllegalArgumentException(String.format(DRIVER_NOT_FOUND, driverName));
        }

        Car carNew = carsRepository.getByName(carModel);

        if (!carsRepository.getAll().contains(carNew)) {
            throw new IllegalArgumentException(String.format(CAR_NOT_FOUND, carModel));
        }

        driverNew.addCar(carNew);
        return String.format(CAR_ADDED, driverName, carModel);
    }

    @Override
    public String addDriverToRace(String raceName, String driverName) {

        Race raceNew = this.racesRepository.getByName(raceName);
        Driver driverNew = this.driversRepository.getByName(driverName);

        if (!racesRepository.getAll().contains(raceNew)) {
            throw new IllegalArgumentException(String.format(RACE_NOT_FOUND, raceName));
        }
        if (!driversRepository.getAll().contains(driverNew)) {
            throw new IllegalArgumentException(String.format(DRIVER_NOT_FOUND, driverName));
        }

//       todo if raceRepo == null???
//        assert racesRepository != null;

        raceNew.addDriver(driverNew);
        return String.format(DRIVER_ADDED, driverName, raceName);
    }

    @Override
    public String startRace(String raceName) {

        Race race = racesRepository.getByName(raceName);

        if (!racesRepository.getAll().contains(race)) {
            throw new IllegalArgumentException(String.format(RACE_NOT_FOUND, raceName));
        }
        if (race.getDrivers().size() < 3){
            throw new IllegalArgumentException(String.format(RACE_INVALID, raceName, 3));
        }

        List<Driver> sorted = driversRepository.getAll().stream().sorted((d1, d2) -> Double.compare(
                d2.getCar().calculateRacePoints(race.getLaps()),
                d1.getCar().calculateRacePoints(race.getLaps())))
                .collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();
        sb.append(String.format(DRIVER_FIRST_POSITION, sorted.get(0).getName(), raceName))
                .append(System.lineSeparator());
        sb.append(String.format(DRIVER_SECOND_POSITION, sorted.get(1).getName(), raceName))
                .append(System.lineSeparator());
        sb.append(String.format(DRIVER_THIRD_POSITION, sorted.get(2).getName(), raceName))
                .append(System.lineSeparator());

        this.racesRepository.remove(race);

        return sb.toString().trim();
    }

    @Override
    public String createRace(String name, int laps) {

        Race race = new RaceImpl(name, laps);

        if (racesRepository.getAll().contains(race)){
            throw new IllegalArgumentException(String.format(RACE_EXISTS, name));
        }
        this.racesRepository.add(race);

        return String.format(RACE_CREATED, name);
    }
}
