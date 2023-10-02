public class SamsungPhone extends Phone{

    public SamsungPhone(int number, double weight, String model) {
        super(number, weight, model);
    }


    @Override
    void info() {

    }

    @Override
     public void info(String model) {
        System.out.printf("Model: %s   \n", model);
    }
}
