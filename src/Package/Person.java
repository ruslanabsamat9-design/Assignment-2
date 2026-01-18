public  class Person {
    private int age ;
    private int id;
    private static int id_gen=1;
    private String name ;
    private String surname;
    public Person(){
        this.id=id_gen++;

    }
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        try {if(age<0){
            throw new Exception("Years cant be mius number!");
            
        }this.age=age;;
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public Person(int age,String name,String surname){
        this();
        this.name=name;
      setAge(age);
        this.surname=surname;
        
    }
    @Override
    public String toString() {
        
        return id+" "+name +" "+surname +" " +age;
    }

}
