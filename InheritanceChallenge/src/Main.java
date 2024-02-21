public class Main {
    public static void main(String[] args) {

        Employee tim = new Employee("Tim", "11/07/2002",
                 "11/11/2023");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = "+ tim.collectPay());

        SalariedEmployee lucas = new SalariedEmployee("Lucas", "20/04/1994"
        ,"01/06/2022", 35000.99);
        System.out.println(lucas);
        System.out.println("pagamento do" + lucas + "é de aproximadamente:  "+lucas.collectPay());
        lucas.retire();
        System.out.println("lucas pension check = $" + lucas.collectPay());


        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970"
        ,"03/03/2021", 15);
        System.out.println(mary);
        System.out.println("mary paycheck = $"+ mary.collectPay());
        System.out.println("Mary hollyday pay = $" + mary.getDoublePay());
    }
}