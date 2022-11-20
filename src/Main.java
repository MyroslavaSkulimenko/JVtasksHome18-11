import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        //Есть класс Employee  с полями  id, name, age, salary.
        // Сделать его comparable по id
        // сделать дополнительные возможности сортировки по: salary, age, name,
        // ageAndThenName если возраст одинаковый
        //то по имени
        // Создать лист таких сотрудников и вывести его на э
        // кран отсортированный всеми способами
        //Collections.sort

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Ann",22,2000));
        employees.add(new Employee(6,"Vit",30,3000));
        employees.add(new Employee(3,"Olga",22,2300));
        employees.add(new Employee(4,"John",31,5000));
        employees.add(new Employee(8,"Boris",22,3500));
        System.out.println(Arrays.toString(new ArrayList[]{employees}));
        System.out.println("________________Id__________________");
        Collections.sort(employees);
        print(employees);
        System.out.println("+++++++++++++++Salary+++++++++++++++");
        Collections.sort(employees,new CamparatorBySalary());
        print(employees);
        System.out.println("+++++++++++++++++Name++++++++++++");
        Collections.sort(employees,new CamparatorByName());
        print(employees);
        System.out.println("+++++++++++++++++Age+++++++++++++++");

        Collections.sort(employees,new CamparatorByAge());
        print(employees);
        System.out.println("+++++++++++++++++++++++++++++++++++");
    }
    public static void print(ArrayList<Employee>employees){
        for (int i = 0; i <employees.size(); i++) {
            System.out.println(""+ employees.get(i).toString());
            System.out.println(" ----------------------      ");
        }

    }
  /*  public static void ageAndThenName(ArrayList<Employee>employees){
        Collections.sort(employees,new CamparatorByAge());
    }*/
}