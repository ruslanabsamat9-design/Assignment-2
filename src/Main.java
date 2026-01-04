import java.util.*;
public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("John", "Lennon", "Manager", 27045.78);
        Employee e2 = new Employee("George", "Harrison", "Developer", 50000);
        Student s1 = new Student("Ringo", "Starr", 2.2);
        Student s2 = new Student("Paul", "McCartney", 3.5);
        ArrayList<Person> p=new ArrayList<>();
        p.add(e1);
        p.add(e2);
        p.add(s1);
        p.add(s2);
        Collections.sort(p);
        printData(p);
    }
    public static void printData(Iterable<Person> p){
        for(Person P:p){
            System.out.println(P.toString()+" earns " +String.format("%.2f",P.getPaymentAmount())+" tenge ");

        }
    }
}
