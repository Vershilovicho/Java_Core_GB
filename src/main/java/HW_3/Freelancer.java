package HW_3;

/**
 * Класс Freelancer , описывающий некоторых работников с почасовой оплатой
 */
public class Freelancer extends BaseWorker{
    protected double hourlyRate;

    // region Конструкторы
    public Freelancer(String name, int salary, String position , double hourlyRate) {
        super(name, salary, position);
        this.hourlyRate = hourlyRate;
    }

    public static Freelancer create(String name, int salary, String position, double hourlyRate){
        return new Freelancer(name, salary, position, hourlyRate);
    }

    @Override
    public String toString() {
        return "Freelancer{" +
                "hourlyRate=" + hourlyRate +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }
    // endregion
    @Override
    public double calculateSalary() {
        // Для «повременщиков» формула для расчета такова:
        // «среднемесячная заработная плата = 20.8 * 8 * почасовая ставка»
        return 20.8 * 8 * hourlyRate;

    }

    // region Свойства

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

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


