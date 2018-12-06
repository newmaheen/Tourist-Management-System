
package touristmanagementandflightbooking;

import java.util.ArrayList;


public class TouristManagementAndFlightBooking {

  
    public static void main(String[] args) {
        
       Student s1=new Student(101, "maheen", "sylhet", "000120", "mm@gmail.com", 2000, "171-35-1961", "diu");
       s1.check_fare();
       s1.buy_ticket();
       s1.check_price("student");
      
       
       
      
       
       Local l1=new Local(102, "gfdg", "gfggfds", "sfsf", "srtfsf", 2000);
       l1.check_price("local");
       l1.buy_ticket();
       l1.cancel_ticket();
       
       
       Foreign f1=new Foreign(103, "ghfssf", "dsbhf", "hufas", 30000, "dhfuada", "uae");
       f1.check_price("foreigner");
       
       f1.buy_ticket();
       f1.cancel_ticket();
       f1.check_country();
       
       
       ArrayList<SummerPackage> a1 =new ArrayList<SummerPackage>();
       SummerPackage sm1= new SummerPackage(101, "sylhet", 10000, "ac");
       SummerPackage sm2= new SummerPackage(102, "sylhet", 10000, "ac");
       SummerPackage sm3= new SummerPackage(103, "sylhet", 10000, "ac");
       
       a1.add(sm1);
       a1.add(sm2);
       a1.add(sm3);
       sm1.Show_Summer_package(a1);
       sm2.Tour_Location();
       
        ArrayList<WinterPacage> a2 =new ArrayList<WinterPacage>();
        WinterPacage wp1= new WinterPacage(105, "BD", 100000, "DIU");
        WinterPacage wp2= new WinterPacage(106, "BD", 100000, "DIU");
        WinterPacage wp3= new WinterPacage(107, "BD", 100000, "DIU");
        WinterPacage wp4= new WinterPacage(108, "BD", 100000, "DIU");
        
        a2.add(wp1);
        a2.add(wp2);
        a2.add(wp3);
        a2.add(wp4);
        wp1.Show_Winter_package(a2);
        wp1.Tour_Location();
        
        Diamond d1= new Diamond(150, "gfsf", "sffss", "sfef", "sfdfs", "wife");
        d1.Check_partner();
        d1.statement();
        
        ArrayList<FallPackage> a3 =new ArrayList<FallPackage>();
        FallPackage fp1= new FallPackage(109, "Chattagram", 1000000, "Dhaka");
        FallPackage fp2= new FallPackage(110, "Chattagram", 1000000, "Dhaka");
        FallPackage fp3= new FallPackage(111, "Chattagram", 1000000, "Dhaka");
        FallPackage fp4= new FallPackage(112, "Chattagram", 1000000, "Dhaka");
        
        a3.add(fp1);
        a3.add(fp2);
        a3.add(fp3);
        a3.add(fp4);
        fp1.Show_Fall_package(a3);
        fp1.Tour_Location();
        fp3.check_destination(d1);
        
        
       ArrayList<SpecialPackage> a4 =new ArrayList<SpecialPackage>();
       SpecialPackage sp1= new SpecialPackage(113, "Eid", 10000, "Yes");
       SpecialPackage sp2= new SpecialPackage(114, "Eid", 10000, "Yes");
       SpecialPackage sp3= new SpecialPackage(115, "Puja", 10000, "Yes");
       SpecialPackage sp4= new SpecialPackage(116, "Eid", 10000, "NO");
        
       a4.add(sp1);
       a4.add(sp2);
       a4.add(sp3);
       a4.add(sp4);
       sp1.Show_Special_package(a4);
       sp1.make_tour();
       
       sp3.Tour_Location();
       
       
       
       Silver sr1= new Silver(118, "fdsf", "sdfdfs", "dsf", " rvste");
       sr1.statement();
       
       
       Golden g1= new Golden(119, "cewe", "cwrew", "rcer", "rcer", 6);
       g1.check_number();
       
       Students st1= new Students(120, "gdfgg", "gdfg", "saer", "gdsr", "171-35-1961", "DIU");
        Students st2= new Students(120, "gdfgg", "gdfg", "saer", "gdsr", "171-35-1961", "DU");
        st1.Student_Tourist();
        
       
       Local_tourist lt1= new Local_tourist(122, "svrtre", "ecrer", "cerrc", "crewre", "Dhaka");
       lt1.check_divition();
       
       Foreign_tourist ft1= new Foreign_tourist(123, "erver", "crer4e", "crewre", "cf ere", "Brazil");
       ft1.check_country(sm3);
       ft1.check_promo(wp4);
       ft1.getDiscount(wp4);
       
       Company_tourist cm1= new Company_tourist(124 , "fsf", "sfdaesas", "fdsf", "fdsf", "Manager");
       Company_tourist cm2= new Company_tourist(125 , "fsf", "sfdaesas", "fdsf", "fdsf", "Stuff");
       Company_tourist cm3= new Company_tourist(126 , "fsf", "sfdaesas", "fdsf", "fdsf", "Admin");
       cm1.company_offer();
       cm2.company_offer();
       cm3.company_offer();
    }
    
}
