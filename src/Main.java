public class Main {

    public static void main(String[] args) {

        int paidAmount = 1200;
        int eachCashback = 100;

        int Cashback = paidAmount / eachCashback;
        if (paidAmount > 1_000) {
            System.out.println("Кэшбэк=" + Cashback);
        } else {
            System.out.println(Cashback = 0);
        }
        int accountBalance = paidAmount + Cashback;

        System.out.println("Сумма пополнения =" + paidAmount);
        System.out.println("Итоговая сумма на счету =" + accountBalance);

    }

}
