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

public  class PizzaFactory {
   /* Pizza salami = new Salami("Salami");

    Pizza hawaii = new Hawaii("Hawaii");
    Pizza mozzarella = new Mozzarela("Mozzarella");*/




     /*  if (order==1){
           Pizza salami = new Salami("Salami", "salami,mozzarella cheese, tomato sauce");
           System.out.println(salami.getName());
       }else if(order ==2){
            Pizza hawaii = new Hawaii("Hawai", "pineaple,mozzarella cheese, tomato sauce");
            System.out.println(hawaii.toString());
       }else if (order==3){
           Pizza mozzarella = new Mozzarela("Mozzarella", "mozzarella cheese, tomato sauce, basilicum");
           System.out.println(mozzarella.toString());
       }return ;*/
    }



