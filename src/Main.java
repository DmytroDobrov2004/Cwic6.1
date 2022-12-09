
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.inicjuj();
        person.print();
        Staff staff = new Staff();
        staff.inicjuj();
        staff.print1();

        double DDexampleTP = staff.salaryToPay(12, 2.5);
        double DDexampleFOT = staff.salaryForOverTime(8, 3);
        int DDexampleIsBonus = Salary.isBonus(50);

        System.out.println("Wynagrodzenie pracownika: "+ DDexampleTP);
        System.out.println("Wynagrodzenie pracownika: " + DDexampleFOT);
        System.out.println("Wynagrodzenie pracownika: "+ DDexampleIsBonus);
    }
}