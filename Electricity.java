import java.util.*;
class Electricity
{
    int cno,pmr,cmr;
    String cname,type;
    float bill,units;
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your details:");
        System.out.println("Enter your name");
        cname = sc.nextLine();
        System.out.println("Enter your consumer number");
        cno = sc.nextInt();
        System.out.println("Enter previous month reading:");
        pmr = sc.nextInt();
        System.out.println("Enter your current month reading:");
        cmr = sc.nextInt();
        System.out.println("Enter the type of connection (Domestic/Commercial)");
        type = sc.next();
    }
    void calc()
    {
        units = cmr-pmr;
    }
    void iftype()
    {
        if(type.equals("Domestic"))
        {
            if(units>501)
            {
                bill = units*6;
            }
            else if(units>=200)
            {
                bill = units*4;
            }
            else if(units>=100)
            {
                bill = units*2.5f;
            }
            else
            {
                bill = units*1;
            }
            if(type.equals("Commercial"))
            {
                if(units>501)
                  bill = units*7;
                else if(units>=200)
                  bill = units*6;
                else if(units>=100)
                  bill = units*4.5f;
                else
                  bill = units*2;
            }
      }
}
    void display()
    {
        System.out.println("CONSUMER DETAILS");
        System.out.println("Name:"+cname);
        System.out.println("Number:"+cno);
        System.out.println("Previous month reading:"+pmr);
        System.out.println("Current month reading:"+cmr);
        System.out.println("The amount to be paid is"+bill);
    }
}
class EB
{
   public static void main(String[] args)
    {

      Electricity e = new Electricity();
        e.getdata();
        e.calc();
        e.iftype();
        e.display();
    }
}



