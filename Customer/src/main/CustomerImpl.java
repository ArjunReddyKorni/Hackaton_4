package main;

import data.Customer;

public class CustomerImpl {
    public static void main(String[] args) {
        Customer obj1 = new Customer();
        Customer obj2 = new Customer("arjun","abc",345667,"arjun@",true);
        System.out.println("obj1 = " + obj1);
        System.out.println("obj2 = " + obj2);
        
        obj1.setName("abc");
        obj1.setAddress("xyz");
        obj1.setEmail("@");
        obj1.setMobileNumber(785);
        obj1.setMemberShip(false);

         Customer tempObj = obj1;
         obj1=obj2;
         obj2=tempObj;


         obj1.display();
         obj2.display();


    }
}
