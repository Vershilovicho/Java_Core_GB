package HW_3;

//1. Построить три класса (базовый и 2 потомка), описывающих некоторых работников с почасовой оплатой
// (один из потомков - Freelancer) и фиксированной оплатой (второй потомок -Worker).
//        а) Описать в базовом классе абстрактный метод для расчёта среднемесячной заработной платы.
//        Для «повременщиков» формула для расчета такова:
//        «среднемесячная заработная плата = 20.8 * 8 * почасовая ставка»,
//        для работников с фиксированной оплатой «среднемесячная заработная плата = фиксированная месячная оплата».
//        б) Создать на базе абстрактного класса массив/коллекцию сотрудников и заполнить его.
import java.util.ArrayList;
import java.util.List;

public class Main {
   public static void main (String[] args){
       BaseWorker freelancer1;
       freelancer1 = Freelancer.create("Мария", 100_000, "programmer", 1);
       BaseWorker worker1 = Worker.create("Андрей", 80_000, "tester");
       BaseWorker freelancer2 = Freelancer.create("Богдан", 70_000, "analyst", 1.5);
       BaseWorker worker2 = Worker.create("Сергей", 60_000, "engineer");
       BaseWorker worker3 = Worker.create("Ольга", 65_000, "designer");


       List<BaseWorker> list = new ArrayList();
       list.add(freelancer1);
       list.add(worker1);
       list.add(freelancer2);
       list.add(worker2);
       list.add(worker3);
       System.out.println(list);

    }
}
