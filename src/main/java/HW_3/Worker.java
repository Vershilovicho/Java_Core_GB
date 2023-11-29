package HW_3;

/**
 * Класс Worker, описывающий некоторых работников с фиксированной оплатой.
 */
public class Worker extends BaseWorker{

    // region Конструкторы
    public Worker(String name, int salary, String position) {
        super(name, salary, position);
    }
    public static Worker create(String name, int salary, String position){
        return new Worker(name, salary, position);
    }
    // endregion
    @Override
    public double calculateSalary() {
        //для работников с фиксированной оплатой
        // «среднемесячная заработная плата
        // = фиксированная месячная оплата».
            return salary;
        }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }
    // region Свойства
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }

    @Override
    public String getPosition() {
        return super.getPosition();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
    }

    @Override
    public void setPosition(String position) {
        super.setPosition(position);
    }
    // endregion
}
