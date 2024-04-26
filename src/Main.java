//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        //сумма кредита в рублях
        int credit = 1_000_000;

        //Годовая процентная ставка
        double creditRate = 9.99;

        //Срок кредита в годах
        int duration = 1;

        //Считаем ежемесячный платёж ануитентный платёж
        double creditPayment = service.calculate(credit, creditRate, duration);

        //округляем
        int creditPaymentInteger = (int) creditPayment;
        System.out.println("Сумма кредита: " + credit + " руб.");
        System.out.println("Годовая процентная ставка: " + creditRate + " %.");
        System.out.println("Срок кредита: " + duration + " лет.");
        System.out.println("Сумма ежемесячного платежа: " + creditPaymentInteger + " руб.");
    }
}
