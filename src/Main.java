public class Main {
    public static void main(String[] args) {
        BmiService serviceCalcBmi = new BmiService();
        double height = 1.87; // рост в метрах
        double weight = 98; // масса тела в килограммах
        int bodyMassIndex = (int)serviceCalcBmi.BmiCalculate(height, weight);
        System.out.println(bodyMassIndex);
    }
}