public class Main {

    public static void main(String[] args){

        System.out.println("Задание 2");
        int paidAmount = 1200;
        int each_Cashback = 100;

        int Cashback = paidAmount/each_Cashback;
        if (paidAmount > 1_000) {
            System.out.println ("Кэшбэк=" + Cashback);
        } else {
            System.out.println(Cashback = 0);
        }
        int accountBalance = paidAmount + Cashback;

        System.out.println("Сумма пополнения =" + paidAmount);
        System.out.println("Итоговая сумма на счету =" +  accountBalance);

    }

}
