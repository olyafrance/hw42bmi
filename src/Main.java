public class Main {
    public static void main(String[] args) {
        BmiService servise = new BmiService();
        double heightm = 1.87;
        int weightkg = 98;
        int bmi = servise.calculate(heightm, weightkg);
        System.out.println("Индекс массы тела:" + bmi);

    }
}
