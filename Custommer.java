
package touristmanagementandflightbooking;

public abstract class Custommer {
 private int id;
 String name;
 String address;
 String contact_no;
 String email;
 
 public Custommer(int id,String name,String address,String contact_no,String email)
 {
     this.id=id;
     this.name=name;
     this.address=address;
     this.contact_no=contact_no;
     this.email=email;
     
 }
 public int getID()
 {
     return id;
 }
 public abstract void statement();
 public void maternity(String a)
 {
    if(a.equals("yes"))
    {
        System.out.println("You have to show doctors permition");
    }
 }
 public void check_gender(String s)
         
 {
   if(s.equals("Male"))
   {
       System.out.println("You have no extra room facilities");
   }
    if(s.equals("Female"))
   {
       System.out.println("You have get room choosing facilities");
   }
   
 }

         
 
 
}
