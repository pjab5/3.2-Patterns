package Level1;

import java.util.ArrayList;
import java.util.Arrays;



public class Pizzaiolo {

    public void Pepperoni(PepperoniBuilder builder){
        builder.setSize(30);
        builder.setDoughType("Neapolitan");
        builder.setIngredients(new ArrayList<Ingredients>(Arrays.asList( Ingredients.FLOUR,Ingredients.YEAST,Ingredients.WATER,Ingredients.OIL,Ingredients.SALT,Ingredients.MOZZARELLA, Ingredients.TOMATO,
                Ingredients.PEPPERONI, Ingredients.PEPPER, Ingredients.ONION)));
        builder.setSpiciness(2);
    }

    public void Margherita(MargheritaBuilder builder){
        builder.setSize(20);
        builder.setDoughType("Canotto");
        builder.setIngredients(new ArrayList<Ingredients>(Arrays.asList( Ingredients.FLOUR,Ingredients.YEAST,Ingredients.WATER,Ingredients.OIL,Ingredients.SALT,Ingredients.MOZZARELLA, Ingredients.TOMATO, Ingredients.BASIL)));
    }

}
