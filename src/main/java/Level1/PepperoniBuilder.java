package Level1;

import java.util.ArrayList;

public class PepperoniBuilder implements PizzaBuilder{
    private int size;
    private String doughType;
    private ArrayList<Ingredients> ingredients;
    private int spiciness;

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void setDoughType(String doughType) {
        this.doughType = doughType;
    }

    @Override
    public void setIngredients(ArrayList<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }

    public void setSpiciness(int spiciness){
        this.spiciness = spiciness;
    }

    public Pizza getPizza(){
        return new Pizza(size,doughType,ingredients);
    }
}
