package package5;

import inheritance.Person;

public class Singer extends Person {
    public Singer(){

    }

    public Singer(String fName, String lName, int age, String gender) {
        super(fName, lName, age, gender);
    }

    public void sings(){
        System.out.println("Singer sings");
    }
}