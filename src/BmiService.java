public class BmiService {
    public int calculate(int weight, double height) {
        int result;
        double bmi = weight / (height * height);
        {
            result = (int) bmi;
        }
        return result;
    }
}



