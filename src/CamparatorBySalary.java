import java.util.Comparator;

public class CamparatorBySalary implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSalary()-o2.getSalary();
    }
}
