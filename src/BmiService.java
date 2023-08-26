public class BmiService {
    public double BmiCalculate(double height, double weight) {
        double bmi;
        bmi = weight / (height * height);
        return bmi;

    }
}
