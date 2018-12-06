
package touristmanagementandflightbooking;

import java.util.ArrayList;


public class TourPackage {
    int id;
String name;
double price;

    public TourPackage(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

public void Show_Winter_package(ArrayList<WinterPacage>wlist)
{
   for(WinterPacage w:wlist)
   {
       System.out.println(w.id+w.name+w.price);
   }
}
public void Show_Summer_package(ArrayList<SummerPackage>slist)
{
   for(SummerPackage s:slist)
   {
       System.out.println(s.id+s.name+s.price);
   }
}
public void Show_Fall_package(ArrayList<FallPackage>flist)
{
   for(FallPackage f:flist)
   {
       System.out.println(f.id+f.name+f.price);
   }
}
public void Show_Special_package(ArrayList<SpecialPackage>splist)
{
   for(SpecialPackage sp:splist)
   {
       System.out.println(sp.id+sp.name+sp.price);
   }
}


}
