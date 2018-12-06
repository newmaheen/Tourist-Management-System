
package touristmanagementandflightbooking;

import java.util.Scanner;


public class SpecialPackage extends TourPackage implements TourLocation {
    String group;
    String occasion;
    public SpecialPackage(int id, String name, double price,String group) {
        super(id, name, price);
        this.group=group;
    }
    public void make_tour()
    {
        System.out.println("How many people you have?");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        if( a>10&& group.equals("Yes"))
        {
            System.out.println("You can make a tour by our management");
        }
        else{
            System.out.println("You cant.!!!");
        }
    }
    public void occeasion_tour()
    {
        if(occasion.equals("Eid"))
        {
            System.out.println("Tour package avaiable!!");
        }
        else
        {
            System.out.println("Not available!!");
        }
    }

    @Override
    public void Tour_Location() {
        System.out.println("Special tour directed by authority.");
    }
    
}
