import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
   public static void main(String[] args) {
       ArrayList<Person> people=new ArrayList<>();
       Employee e1 = new Employee("John", "Lennon", "Manager", 27045.78);
       Employee e2 = new Employee("George", "Harrison", "Developer", 50000.00);
       Student s1 = new Student("Ringo", "Starr", 2.0); // GPA төмен (0 тг)
       Student s2 = new Student("Paul", "McCartney", 3.5); // GPA жоғары (36660 тг)
       people.add(e1);
       people.add(e2);
       people.add(s1);
       people.add(s2);
       Collections.sort(people);
       printData(people);

    }

    public static void printData(Iterable<Person> peopleList){
        for(Person p:peopleList){
            System.out.println(p.toString()+" earns " +String.format("%.2f",p.getPaymentAmount())+" tenge ");

        }
    }
}
