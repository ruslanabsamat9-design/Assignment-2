public class Student extends Person implements Payable {
    private double gpa;
    private static final double Step=53000.0;
    public Student(){
        super();
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    public Student(int age,String name,String surname,double gpa){
        super(age,name,surname);
        this.gpa=gpa;

        
    }
    @Override
    public double getPaymentAmount() {
       
        if (gpa>2.33){return Step;}
        else  {return 0;}
    }

    @Override
    public String toString() {
       
        return super.toString()+" Student "+" Gpa: "+gpa;
    }
}
