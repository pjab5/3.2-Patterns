package Level1;

import java.util.ArrayList;

public interface PizzaBuilder {
    void setSize(int size);
    void setDoughType(String doughType);
    void setIngredients(ArrayList<Ingredients> ingredients);
}
