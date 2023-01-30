public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long bonus = service.calculate(10000, true);
        System.out.println(bonus);
    }
}
