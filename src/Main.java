public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightInMeters = 1.87; // рост человека
        double weightInKilograms = 98.0; // вес человека
        int bodyMassIndex = service.calculate(heightInMeters, weightInKilograms);
        System.out.println("Индекс массы тела равен " + bodyMassIndex);
    }
}