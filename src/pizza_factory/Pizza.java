package pizza_factory;
//2. Каждый вид пиццы должен уметь: подготавливаться (накладывать ингридиенты напр.), печься и упаковываться.
//   В каждом случае должно быть понятно о какой пицце речь.

import com.sun.tools.javac.Main;

import java.util.List;

public  abstract class Pizza {
    public void prepare(){
        System.out.println("Pizza is being prepared");
    }
    public void bake(){
        System.out.println("Pizza is baked");
    }
    public void cutPizza(){
        System.out.println("We cut the pizza");
    }
    public void box(){
        System.out.println("Your pizza will be packed");
    }
    public String toString() {
        return super.toString() ;
    }


}
