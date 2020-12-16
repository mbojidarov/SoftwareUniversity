package bakery.repositories;

import bakery.entities.bakedFoods.Bread;
import bakery.entities.bakedFoods.Cake;
import bakery.entities.bakedFoods.interfaces.BakedFood;
import bakery.repositories.interfaces.FoodRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class FoodRepositoryImpl<T> implements FoodRepository <BakedFood>{
private Collection<BakedFood> models;

    public FoodRepositoryImpl() {
        this.models = new ArrayList<>();
    }

    @Override
    public BakedFood getByName(String name) {

        for (BakedFood food : models) {
            if (food.getName().equals(name)){
                return food;
            }
        }

//        for (BakedFood food : models) {
//            if (food instanceof Bread) {
//                if (((Bread) food).getName().equals(name)) {
//                    return food;
//                }
//            }
//            if (food instanceof Cake) {
//                if (((Cake) food).getName().equals(name)) {
//                    return food;
//                }
//            }
//        }

        return null;
    }

    @Override
    public Collection<BakedFood> getAll() {

        return this.models;

//        return Collections.unmodifiableCollection(models);
    }

    @Override
    public void add(BakedFood bakedFood) {
    this.models.add(bakedFood);
    }
}
