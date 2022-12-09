public interface Salary {
    double salaryToPay (double DDhours, double DDrate);
    default double salaryForOverTime(double DDhours, double DDrate)
    {
        return  DDhours * DDrate;
    }
    static int isBonus(int DDYearOfExperience){
        if (DDYearOfExperience > 5) return 100;
        else return 0;
    }



}