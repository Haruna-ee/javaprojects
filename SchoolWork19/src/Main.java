public class Main {
    public static void main(String[] args) {

        System.out.println("Hello");
//         Customer customer = new Customer();
//         customer.name = "John"; ALT + INSERT to generate getters and setters, MAC-Right Click
//         customer.customerID = Long.valueOf(1);
//         customer.setName("Test");
//
//         System.out.println("Name:  " + customer.getName() ) ;
//
//         System.out.println("Name:  " + customer.getcustomerID() ) ;
//
//         System.out.println("Name:  " + customer.getPhonenumber() ) ;

        Customer customer1 = new Customer(Long.valueOf(1), "Tes1", "3567734", "ena.gmail.com");
        Customer customer2 = new Customer(Long.valueOf(2), "Tes2", "35677341", "ett.gmail.com");
        Customer customer3 = new Customer(Long.valueOf(3), "Tes1", "356773433", "enanas.gmail.com");
//
        Customer[] customers = {customer2, customer3, customer1};
        int[] ages = {5, 6, 12, 14, 18};
//
        for (int i = 0; i < customers.length; i++) {
            System.out.println((i + 1) + " " + customers[i].getName());

//show customers without phone numbers
//            i = 0;

//create 2 objects -- motorcycle and car

        }
        Vehicle motorcycle = new Vehicle(2, 2);
        Vehicle car = new Vehicle(2, 2);
        Vehicle bigcar= new Vehicle(2, 2);

//        array of vehicles

        Vehicle [] parking = {motorcycle, car, bigcar};

//        drive all cars one by one

        for (Vehicle v : parking){
            v.drive();
        }
    }
}
