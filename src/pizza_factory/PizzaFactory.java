package pizza_factory;

import java.util.Scanner;
 /*
   1. Cоздать фабрику по производству пиццы. Фабрика должна уметь готовить следующие виды пиццы:
    Гавайи, Моцарелла,Салями.

   2. Каждый вид пиццы должен уметь: подготавливаться (накладывать ингридиенты напр.),
    печься и упаковываться.
         В каждом случае должно быть понятно о какой пицце речь.
   3. В классе Main не должен создаваться новый обьект пиццы, а из него должен поступать "заказ"
    на изготовление
      требуемого вида пиццы (обьекта) в класс PizzaFactory, который и должен выбрать нужную пиццу
       для изготовления

      Пример: заказана пицца Hawaii.
      На выходе:
      Preparing pizza with ananas and cheese
      Baking Pizza Hawaii
      Packing pizza Hawaii
     */
        /*
        1- должны быть создан родительский класс и дочерние классы ,
        в которых переопределяются методы\метод изготовления
        пиццы.
        2- должен быть создан класс , который в зависимости от
        выбора вида пиццы "изготавливает" новый обьект этого класса
        . Скорее всего этот класс PizzaFactory  может быть реализован в
         виде switch. В свитче использовать энум?
         */

public class PizzaFactory extends Main {
    int newOrder;

    public static int getOrder(int order) {
        int newOrder = order;
        System.out.println(newOrder);

        switch (order) {
            case (1):
                Pizza salami = new Salami();
                System.out.println(salami.toString());
                salami.prepare();
                salami.bake();
                salami.cutPizza();
                salami.box();
                break;
            case 2:
                Pizza hawaii = new Hawaii();
                System.out.println(hawaii.toString());
                hawaii.prepare();
                hawaii.bake();
                hawaii.cutPizza();
                hawaii.box();
                break;
            case 3:
                Pizza mozzarella = new Mozzarela();
                System.out.println(mozzarella.toString());
                mozzarella.prepare();
                mozzarella.bake();
                mozzarella.cutPizza();
                mozzarella.box();
                break;
            default:
                System.out.println("Please make your choice! ");
        }
        return order;
    }
}



