/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ITMD466;

import controllers.CustomerList;
import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import model.Customer;


@WebService(name = "CustomerList", serviceName = "CustomerListService")
public class CustomerListService {

    
    @WebMethod(operationName = "listCustomers")
    public ArrayList<Customer> listCustomers(@WebParam(name = "city") String city) throws Exception {

        CustomerList cl = new CustomerList();
        System.out.println(cl.getCustomers(city));
        return cl.getCustomers(city);
    }

}


