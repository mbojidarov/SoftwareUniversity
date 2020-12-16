package bakery.repositories;

import bakery.entities.drinks.Tea;
import bakery.entities.drinks.Water;
import bakery.entities.drinks.interfaces.Drink;
import bakery.repositories.interfaces.DrinkRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DrinkRepositoryImpl<T> implements DrinkRepository<Drink> {
    private Collection<Drink> models;

    public DrinkRepositoryImpl() {
        this.models = new ArrayList<>();
    }


    @Override
    public Drink getByNameAndBrand(String drinkName, String drinkBrand) {

        for (Drink drink : models) {
            if (drink.getName().equals(drinkName) && drink.getBrand().equals(drinkBrand)){
                return drink;
            }
        }

//        for (Drink drink : models) {
//            if (drink instanceof Tea) {
//                if (((Tea) drink).getName().equals(drinkName) && ((Tea) drink).getBrand().equals(drinkBrand)) {
//                    return drink;
//                }
//            }
//            if (drink instanceof Water) {
//                if (((Water) drink).getName().equals(drinkName) && ((Water) drink).getBrand().equals(drinkBrand)) {
//                    return drink;
//                }
//            }
//        }
        return null;
    }

    @Override
    public Collection<Drink> getAll() {

        return this.models;

//        return Collections.unmodifiableCollection(models);

    }

    @Override
    public void add(Drink drink) {
        this.models.add(drink);
    }
}
