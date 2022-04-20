package abstraction.abstract_classes;

import java.util.ArrayList;
import java.util.List;

public class TestAbstraction {
    public static void main(String[] args) {


    /*
    Create an object of Samsung called as s1
    info it will have is as below

    Samsung
    Black
    64
    700
     */

        Samsung s1 = new Samsung("Samsung", "Black", 64, 700);
        Nokia n1 = new Nokia("Nokia", "Blue", 4, 100);
        IPhone i1 = new IPhone("IPhone", "Silver", 128, 1000);

        List<Phone> phones = new ArrayList<>();
        phones.add(s1);
        phones.add(n1);
        phones.add(i1);


        /*
        Print all objects
        Find and print the most expensive one with the message -> "The most expensive phone is = IPhone"
        Find and print how many phones are convertible -> 2
        */

        int countConvertibles = 0;
        int max = Integer.MIN_VALUE;
        Phone mostExpensivePhone = null;

        for (Phone phone: phones) {
            System.out.println(phone);
            if (phone.isConvertible()) countConvertibles++;
            if (phone.price > max) mostExpensivePhone = phone;
        }
        System.out.println(countConvertibles);
        System.out.println("The most expensive phone is " + mostExpensivePhone.getClass().getSimpleName());
        System.out.println("The color of the most expensive phone is " + mostExpensivePhone.color);

        //Prints out OS type
        System.out.println("\n" + IPhone.OS);
        System.out.println(Samsung.OS);
        System.out.println(Nokia.OS);

    }
}