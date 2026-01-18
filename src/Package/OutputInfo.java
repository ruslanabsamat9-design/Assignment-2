import java.util.*;
public class OutputInfo  {
    public static void main(String[] args) {
         ArrayList<Payable> person=new ArrayList<>();
      try{  person.add(new Student(18,"Ruslan","Absamat",3.11));
        person.add(new Worker(20,"Ruslan","Absamat",3));
        person.add(new Worker(-25, "Aza", "Mat", 5));}
        catch(Exception e){
            System.out.println(e.getMessage());

        }
            for (Payable m:person){
                System.out.println(m.toString()+" Pay:"+m.getPaymentAmount());
            }
        
    
        
    }

}
