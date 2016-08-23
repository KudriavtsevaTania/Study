package fooCorporation;

public class FooCorporation {
    static final double STANDARD_HOURS = 40;
    static final double OVER_BASE_PAY = 1.5;
    static final double WORKING_HORSE_HOURS = 60;
    static final double STANDARD_PAY = 8;


    private static void calcPay(String employee, double salary, int hours) {

        if (salary < STANDARD_PAY) {
            System.out.println("Achtung! Your employees are not chinese! They should be highly paid!");
        } else if (hours > WORKING_HORSE_HOURS)  {
            System.out.println("Achtung! Your employees are not animals! They should have a rest!");
        } else if (hours <= STANDARD_HOURS) {
            double finalSalary = salary * hours;
            System.out.println(employee + " has worked " + hours + "hrs for a pay amount of " + finalSalary);
        } else {
            double overHours = hours - STANDARD_HOURS;
            double overSalary = overHours * (salary * OVER_BASE_PAY);
            double finalSalary = salary * STANDARD_HOURS + overSalary;
            System.out.println(employee + " has worked " + hours + "hrs for a pay amount of " + finalSalary);
        }
    }

    public static void main(String[] args) {

        calcPay("Kaz",7.50,35);
        calcPay("Amanda",8.20,47);
        calcPay("Mike",10.00,73);
    }
}
