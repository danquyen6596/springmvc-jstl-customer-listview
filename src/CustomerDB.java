import java.util.*;

public class CustomerDB {
    private static final List<Customer> customers = new ArrayList<Customer>();

    static {
        initData();
    }

    private static void initData(){
        Customer customer1 = new  Customer("Lương Thị Hiền", "11/05/1997", "Hà Nội");
        Customer customer2 = new  Customer("Lương Thị Hiền", "11/05/1997", "Hà Nội");
        Customer customer3 = new  Customer("Lương Thị Hiền", "11/05/1997", "Hà Nội");

        customers.add(customer1);
        customers.add(customer3);
        customers.add(customer2);
    }

    public static List<Customer> queryCustomer() {
        return customers;
    }

}
