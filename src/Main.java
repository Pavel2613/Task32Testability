public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double h = 1.87; // рост человека
        double m = 98.0; // вес человека
        double bodyMassIndex = service.calculate(h, m);
        int f = (int) (bodyMassIndex);
        System.out.println("Индекс массы тела равен " + f);
    }
}