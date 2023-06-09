package pizza_factory;
import java.util.Scanner;
 /*
   1. Cоздать фабрику по производству пиццы. Фабрика должна уметь готовить следующие виды пиццы:
    Гавайи, Моцарелла,Салями.
   2. Каждый вид пиццы должен уметь: подготавливаться (накладывать ингридиенты напр.), печься и упаковываться.
         В каждом случае должно быть понятно о какой пицце речь.
   3. В классе Main не должен создаваться новый обьект пиццы, а из него должен поступать "заказ"  на изготовление
      требуемого вида пиццы (обьекта) в класс PizzaFactory, который и должен выбрать нужную пиццу для изготовления
      Пример: заказана пицца Hawaii.
      На выходе:
      Preparing pizza with ananas and cheese
      Baking Pizza Hawaii
      Packing pizza Hawaii
     */
        /*
        1- должны быть создан родительский класс и дочерние классы , в которых переопределяются методы\метод изготовления
        пиццы.
        2- должен быть создан класс , который в зависимости от выбора вида пиццы "изготавливает" новый обьект этого класса
        . Скорее всего этот класс PizzaFactory  может быть реализован в  виде switch. В свитче использовать энум?
         */

public class Main {
    public static void main(String[] args) {
        System.out.println("Which pizza would you like to order ? ");
        System.out.println("Enter 1 for Salami; 2 for Hawaii ; 3 for Mozzarella");
        Scanner sc = new Scanner(System.in);
        int order = sc.nextInt();
        PizzaFactory.getOrder(order);

        /*
        Which pizza would you like to order ?
        Enter 1 for Salami; 2 for Hawaii ; 3 for Mozzarella
        2
        Pizza Hawaii with topping : pineapple, mozzarella cheese, tomato sauce
        Pizza is being prepared
        Pizza is baked
        We cut the pizza
        Your pizza will be packed */
    }
}