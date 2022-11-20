import java.util.ArrayList;
import java.util.Comparator;

public class CamparatorByAge implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int flag=o1.getAge()-o2.getAge();
        if (flag==0){
            flag=o1.getName().compareTo(o2.getName());
        }
        return flag;
    }
    public int ageAndThenName(Employee o1, Employee o2) {
        int flag=o1.getAge()-o2.getAge();
        if (flag==0){
            flag=o1.getName().compareTo(o2.getName());
        }
        return flag;
    }
}
