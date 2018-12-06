
package touristmanagementandflightbooking;

public class Foreign_tourist extends Tourist {
    String country;
    public Foreign_tourist(int id, String name, String address, String contact_no, String email,String country) {
        super(id, name, address, contact_no, email);
        this.country=country;
    }
    public void getDiscount(WinterPacage wp)
    {
      if(wp.price>10000)
      {
         double a =wp.price-500;
          System.out.println(a);
      }
    }
    public void check_country(SummerPackage sp)
    {
        if(country.equals("Brazil"))
        {
            double a= sp.price+1000;
            System.out.println(a);
        }
    }
    public void check_promo(WinterPacage wp)
    {
        if(wp.promo.equals("DIU"))
        {
            System.out.println("Your promo is activated");
        }
    }
}
