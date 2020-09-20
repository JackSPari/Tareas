import compras.Productos;
import entities.Person;

public class Main{
    public static void main(String[] arg) {
        Person p= new Person();
        p.setName("Diego");
        p.laugh();
        Person p2= new Person();
        p2.setName("Sandra");
        p2.laugh();
        Productos pro= new Productos();
        pro.setRopa("Diego");
        pro.laugh();
        Productos pro2= new Productos();
        pro2.setDress("Sandra");
        pro2.laugh();
    }
}