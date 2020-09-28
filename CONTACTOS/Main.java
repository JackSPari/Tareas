import java.util.Scanner;
import entities.Person;
import data.PersonData;

public class Main{
    public static void main(String[] arg) {
       PersonData dat= new PersonData();
        Scanner sc = new Scanner(System.in);
       int opt = 0;
       do{
            System.out.println("***** CRUD PERSON *****");
            System.out.println("1 List ");
            System.out.println("2 New ");
            System.out.println("3 Delete ");
            System.out.println("0 Exit ");
            System.out.println("Choice option: ");
            opt = sc.nextInt();
            System.out.println("You chosed: " + opt);
            sc.nextLine(); // Limpiar el buffer
            switch (opt) {
                case 1:System.out.println("Opcion 1 elejida");
                break;
                case 2:System.out.println("Opcion 2 elejida");
                break;
                case 3:System.out.println("Opcion 3 elejida");
                break;
                default: System.out.println("Opcion no valida");
            }
        }while (opt != 0);

    }
}