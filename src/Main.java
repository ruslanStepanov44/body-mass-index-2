
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 98;
        double height = 1.87;
        int bmi = service.calculate(98, 1.87); //должно получится 28
        System.out.println(bmi);
    }
}
