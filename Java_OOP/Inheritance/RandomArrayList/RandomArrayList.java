package RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<T> extends ArrayList<T> {
    private Random random;

    public RandomArrayList(){
        this.random = new Random();
    }

    public T getRandomElement(){
    int indexToRemove = this.random.nextInt(super.size());
                                //generate random index(bounds) to remove from List

    return super.remove(indexToRemove);
    }
}
