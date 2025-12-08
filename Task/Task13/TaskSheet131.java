package Task13;

import java.util.Arrays;

class Afritada {
  public void showIngredients() {
    String[] ingredients = {"Tomato Sauce", "Meat"};
    System.out.println("Afritada = " + Arrays.toString(ingredients) + "🍲 \n");
  }
}

class Mechado extends Afritada {
  @Override
  public void showIngredients() {
    String[] ingredients = {
      "Tomato Sauce",
      "Meat",
      "Potatoes & Carrots",
      "Soy Sauce",
      "Calamansi"
    };
    System.out.println("Mechado = " + Arrays.toString(ingredients) + "🍲 \n");
  }
}

class Menudo extends Afritada {
  @Override
  public void showIngredients() {
    String[] ingredients = {
      "Tomato Sauce",
      "Meat",
      "Potatoes & Carrots",
      "Liver",
      "Chickpeas",
      "Raisins"
    };
    System.out.println("Menudo = " + Arrays.toString(ingredients) + "🍲 \n");
  }
}

class Caldereta extends Afritada {
  @Override
  public void showIngredients() {
    String[] ingredients =
      {"Tomato Sauce",
       "Meat",
       "Potatoes & Carrots",
       "Tomato Paste",
       "Liver Spread",
       "Raisins",
       "Hotdog",
       "Siling Labuyo",
       "Cheese"};
    System.out.println("Caldereta = " + Arrays.toString(ingredients) + "🍲 \n");
  }
}

public class TaskSheet131 {
    public static void main(String[] args) {

        Afritada meal1 = new Afritada();
        Afritada meal2 = new Mechado();
        Afritada meal3 = new Menudo();
        Afritada meal4 = new Caldereta();

        meal1.showIngredients();
        meal2.showIngredients();
        meal3.showIngredients();
        meal4.showIngredients();
    }
}