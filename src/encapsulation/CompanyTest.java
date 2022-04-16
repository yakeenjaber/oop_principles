package encapsulation;

public class CompanyTest {
     /*
        Create a company1 object
        set all of its information

        Create a company2 object
        set all of its information

        Print object

        Company1 is -> Apple - California - (123) 312-2345
        Company2 is -> Google - California - (000) 055-5555

        Print company names together with below message
        Company 1 is = "Apple" and company 2 is = "Google"
      */

    public static void main(String[] args) {
        Company company1 = new Company();
        company1.setName("Apple");
        company1.setAddress("California");
        company1.setPhone("(123) 312-2345");

        Company company2 = new Company();
        company2.setName("Google");
        company2.setAddress("California");
        company2.setPhone("(000) 055-5555");

        System.out.println(company1);
        System.out.println(company2);

        System.out.println("Company 1 is = \"" + company1.getName() + "\" and company 2 is = \"" + company2.getName() + "\"");
    }
}