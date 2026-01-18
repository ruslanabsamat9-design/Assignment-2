package Entities;

public class User {
    private int id;
    private String name;
    private String surname;
    private boolean gender;
    public User(){};
    public User(String name,String surname,boolean gender){
        setName(surname);

        setSurname(surname);
        setGender(gender);
    }
    public User(int id,String name,String surname,boolean gender){
       this( name,surname, gender);
       setId(id);
       
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }public String getSurname() {
        return surname;
    }public void setGender(boolean gender) {
        this.gender = gender;
    }public void setId(int id) {
        this.id = id;
    }public void setName(String name) {
        this.name = name;
    }public void setSurname(String surname) {
        this.surname = surname;
    }
    



}
