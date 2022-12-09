
import java.util.Scanner;

public class Person {
    private String DDname;
    private String DDsurname;
    private String DDstreet;
    private String DDcode;
    private String DDcity;

    public Person() {
    }

    public void inicjuj() {

        Scanner in = new Scanner(System.in);
        System.out.println("Wpisz swoje imię: ");
        this.DDname = in.next();
        System.out.println("Wpisz swoje nazwisko: ");
        this.DDsurname =in.next();
        System.out.println("Wprowadź swoją ulicę: ");
        this.DDstreet = in.next();
        System.out.println("Wpisz swój kod pocztowye: ");
        this.DDcode = in.next();
        System.out.println("Wprowadź swoje miasto: ");
        this.DDcity = in.next();
    }

    public void print(){
        System.out.println("___________________________");
        System.out.println();
        System.out.println("Twoje imie: " + this.DDname);
        System.out.println("Twoje nazwisko: " + this.DDsurname);
        System.out.println("Twoja ulica: " + this.DDstreet);
        System.out.println("Twoj kod pocztowy: " + this.DDcode);
        System.out.println("Twoje miasto: " + this.DDcity);
    }
}