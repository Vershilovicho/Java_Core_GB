package HW_3;

//1. Построить три класса (базовый и 2 потомка), описывающих некоторых работников с почасовой оплатой
// (один из потомков - Freelancer) и фиксированной оплатой (второй потомок -Worker).
//        а) Описать в базовом классе абстрактный метод для расчёта среднемесячной заработной платы.
//        Для «повременщиков» формула для расчета такова:
//        «среднемесячная заработная плата = 20.8 * 8 * почасовая ставка»,
//        для работников с фиксированной оплатой «среднемесячная заработная плата = фиксированная месячная оплата».
//        б) Создать на базе абстрактного класса массив/коллекцию сотрудников и заполнить его.
public abstract class BaseWorker {

    // region Поля
    protected String name;
    protected int salary;
    protected String position;

    // endregion

    // region Конструктор
    public BaseWorker(String name, int salary, String position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }
    // endregion

    // region Метод
    public abstract double calculateSalary();
    /* абстрактный метод для расчёта среднемесячной заработной платы */

    // endregion

    // region Свойства

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    // endregion

}
