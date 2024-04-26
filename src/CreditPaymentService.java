public class CreditPaymentService {
    public double calculate(int credit, double creditRate, int duration) {
        // Формула для расчёта месячной ставки по заму в долях
        double crm = creditRate / 100 / 12;

        // Расчёт срока кредита из лет в месяцы
        int dm = duration * 12;

        //вычислим переплату, умножаем полученную сумму на число платежей
        double degree = Math.pow(1 + crm, dm);

        //размер ежемесячного платежа
        double creditPayment = credit * crm * degree / (degree - 1);

        //Возвращаем сумму месячного платежа
        return creditPayment;
    }
}
