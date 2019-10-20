public class SavingsAccount {
    static double annualInterestRate;
    private double savingsBalance;

    public void calculateMonthlyInterest(){
        savingsBalance += (savingsBalance * annualInterestRate) / 12;
    }

    public static void modifyInterestRate(double intRate) {
        annualInterestRate = intRate;
    }

    public static void main(String[] args) {
        int i;
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        saver1.savingsBalance = 2000;
        saver2.savingsBalance = 3000;

        saver1.modifyInterestRate(0.04);
        System.out.println("Saver One            Saver Two");
        for(i = 0; i < 12; ++i) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.printf("$%.02f                $%.02f\n", saver1.savingsBalance, saver2.savingsBalance);
        }
        saver1.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("$%.02f                $%.02f    <---- Balance for the next month", saver1.savingsBalance, saver2.savingsBalance);
    }

}
