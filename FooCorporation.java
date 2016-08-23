package fooCorporation;

public class FooCorporation {
    public static void main(String[] args) {

        String emp1 = "Kaz", emp2 = "Amanda", emp3 = "Mike";
        double emp1Pay = 7.50, emp2Pay = 8.20, emp3Pay = 10.00;
        double emp1Hrs = 35, emp2Hrs = 47, emp3Hrs = 73;

        calcPay(emp1,emp1Pay,emp1Hrs);
        calcPay(emp2,emp2Pay,emp2Hrs);
        calcPay(emp3,emp3Pay,emp3Hrs);
    }

    private static void calcPay(String emp, double pay, double hrs) {

        final double STANDARD_HOURS = 40;
        final double OVER_BASE_PAY = 1.5;
        final double WORKING_HORSE_HOURS = 60;
        final double STANDARD_PAY = 8;
        if (pay < STANDARD_PAY || hrs > WORKING_HORSE_HOURS) {
            System.out.println("Achtung! Your employees are not chinese or animals! They should be highly paid! And have a rest!");
        } else if (hrs <= STANDARD_HOURS) {
            double empPay = pay * hrs;
            System.out.println(emp + " has worked " + hrs + "hrs for a pay amount of " + empPay);
        } else if (hrs > STANDARD_HOURS) {
            double overHours = hrs - STANDARD_HOURS;
            double overPay = overHours * (pay * OVER_BASE_PAY);
            double empPay = pay * STANDARD_HOURS + overPay;
            System.out.println(emp + " has worked " + hrs + "hrs for a pay amount of " + empPay);
        }
    }
}
