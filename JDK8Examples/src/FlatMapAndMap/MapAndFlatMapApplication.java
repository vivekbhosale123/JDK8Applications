package FlatMapAndMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Customer{

    private int custId;

    private String custName;

    private List<Long> custContactNumber;

    public Customer(int custId, String custName, List<Long> custContactNumber) {
        this.custId = custId;
        this.custName = custName;
        this.custContactNumber = custContactNumber;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public List<Long> getCustContactNumber() {
        return custContactNumber;
    }

    public void setCustContactNumber(List<Long> custContactNumber) {
        this.custContactNumber = custContactNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                ", custContactNumber=" + custContactNumber +
                '}';
    }
}

public class MapAndFlatMapApplication {

    static void main(String[] args) {

        List<Customer> customerList= Stream.of(new Customer(1,"vivek", Arrays.asList(89898389L,4793874834L)),
                new Customer(2,"sachin", Arrays.asList(89898389L,4793874834L)),
        new Customer(3,"ganesh", Arrays.asList(89898389L,4793874834L))).collect(Collectors.toList());

        List<List<Long>> contactList=customerList.stream().map(customer -> customer.getCustContactNumber()).collect(Collectors.toList());


        IO.println(contactList);


        List<Long> contactFlatMap=customerList.stream().flatMap(customer -> customer.getCustContactNumber().stream()).collect(Collectors.toList());

        IO.println(contactFlatMap);

    }

}
