
package touristmanagementandflightbooking;

import java.util.Scanner;

public class Students extends Tourist {
    String institution_id;
    String institution;
    public Students(int id, String name, String address, String contact_no, String email,String institution_id,String institution) {
        super(id, name, address, contact_no, email);
        this.institution_id=institution_id;
        this.institution=institution;
    }
    public void Student_Tourist()
    {
        System.out.println("Please enter your id and institution:");
        Scanner sc= new Scanner(System.in);
        String a= sc.nextLine();
        String b= sc.nextLine();
        System.out.println("You get Special discounts and offer for any package.");
    }
    
}
