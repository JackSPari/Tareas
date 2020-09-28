package data;

import java.util.ArrayList;
import java.util.List;
import entities.Person;

public class PersonData {
    List<Person> lis=new ArrayList<Person>();
    
    Person p = new Person();
    public void create(Person p){
        System.out.println("Create");

    }
    public List<Person> list(String cad){
        
        System.out.println("List");
        return lis;
    }
    public Person get(int id){
        Person d= new Person();
        System.out.println("Get");
        return d;
    } 
}