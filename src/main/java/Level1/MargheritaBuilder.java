package Level1;

import java.util.ArrayList;

public class MargheritaBuilder implements PizzaBuilder{
    private int size;
    private String doughType;
    private ArrayList<Ingredients> ingredients;

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

    public Pizza getPizza(){
        return new Pizza(size,doughType,ingredients);
    }
}
