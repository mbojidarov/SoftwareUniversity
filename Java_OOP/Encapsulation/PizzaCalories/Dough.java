package PizzaCalories;

import java.util.Map;

public class Dough {

    private static final Map<String, Double> DOUGH_MODIFIERS =
            Map.of("White", 1.5, "Wholegrain", 1.0,
                    "Crispy", 0.9, "Chewy", 1.1, "Homemade", 1.0);

    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);   //  white or wholegrain
        this.setBakingTechnique(bakingTechnique);   // crispy, chewy or homemade
        this.setWeight(weight);
    }

    private void setFlourType(String flourType) {
        if (!flourType.equals("White") && !flourType.equals("Wholegrain")) {
            throw new IllegalArgumentException(
                    "Invalid type of dough.");
        }
        this.flourType = flourType;
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (!bakingTechnique.equals("Crispy")
                && !bakingTechnique.equals("Chewy")
                && !bakingTechnique.equals("Homemade")) {
            throw new IllegalArgumentException(
                    "Invalid type of dough.");
        }
        this.bakingTechnique = bakingTechnique;
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException(
                    "Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public double calculateCalories() {

        return this.weight * 2 * DOUGH_MODIFIERS.get(this.flourType)
                * DOUGH_MODIFIERS.get(this.bakingTechnique);
    }
}
