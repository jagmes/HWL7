public class Main {
    public static void main(String[] args) {
        System.out.println(" Телефоны.\n ---------" );
        Phone phone = new Phone(); // экземпляр 1
        phone.print();
        phone.model ="Siemens"; // обращение к полю класса phone
        phone.number = 75;
      //  phone.weight =0.6f;
        phone.print();
        System.out.println(" --------- " );
        Phone phone1 = new Phone("Sonya"); // экземпляр 2
        phone1.print();
        Phone phone2 = new Phone(4567, 0.76, "Sony"); // экземпляр 3
        phone2.print();
        System.out.println(" --------- " );
        phone.receiveCall("Зина");
        phone.getNumber(5455);
        phone1.receiveCall("Соня");
        phone1.getNumber(phone1.number);
        phone2.receiveCall("Олег");
        phone2.getNumber(phone2.number);

       // ----------------



    }
}