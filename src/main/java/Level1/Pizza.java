package Level1;

import java.util.ArrayList;

public class Pizza {
    private int size;
    private String doughType;
    private ArrayList<Ingredients> ingredients;

    public Pizza(int size, String doughType, ArrayList<Ingredients> ingredients) {
        this.size = size;
        this.doughType = doughType;
        this.ingredients = ingredients;
    }

    public int getSize() {
        return size;
    }

    public String getDoughType() {
        return doughType;
    }

    public ArrayList<Ingredients> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", doughType='" + doughType + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
