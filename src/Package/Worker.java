public class Worker extends Person implements Payable{
    private int experience;
    private double salary;
   
    
   
     public Worker(int age,String name,String surname,int experience){
       super(age,name,surname);
        this.experience=experience;
        calculateSalary();
                
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
        calculateSalary();
        
    } 
  public void calculateSalary() {
      if(experience>4){
        this.salary=150000.0;
    }else{this.salary=100000.0;}
  } 
  public double getSalary() {
      return salary;
  }
   
     
@Override
public double getPaymentAmount() {
   
    return salary;
}
    @Override
    public String toString() {
       
        return super.toString()+" Worker " +"Experience: " +experience;
    }
    


}