public class Main {
    public static void main(String[] args) {

        System.out.println(" --------- " );
        SamsungPhone samsung =  new SamsungPhone(3434,1.0f, "Galaxy" );
        samsung.info("Galaxy");
        System.out.println(" --------- " );
        XiaomiPhone xiaomi = new XiaomiPhone();
        xiaomi.info("redmi 12T");
        System.out.println(" --------- " );
        ApplePhone apple = new ApplePhone();
        apple.info("Iphone 3s");

       // ----------------



    }
}