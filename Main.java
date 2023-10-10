//KooroshJamalpoor
//1402/4/10
package Manategh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myscan=new Scanner(System.in);

       Manateghdata Mdata = new Manateghdata(100);

       String file1="G:\\ManateghR.txt";
       String file2="G:\\ManateghW.txt";
        Mdata.reader(file1);

        int num,num1,goone,goone1,num2,num3,num4;
        String name,name1;

        System.out.println("Hello,Type your number for Find : ");
        num=myscan.nextInt();
        Mdata.findnumber(num);

        System.out.println("Hello,Type your name for Find : ");
        name=myscan.next();
        Mdata.findname(name);

        System.out.println("Please type your name for New Area : ");
        name=myscan.next();
        System.out.println("Please type your number for New Area : ");
        num=myscan.nextInt();
        System.out.println("Please type your number of goone for New Area : ");
        goone=myscan.nextInt();
        Manategh ManataheN = new Manategh(name, num, goone);
       Mdata.plusmantaghe(ManataheN);

        Manategh Maxmanategh = Mdata.Mfindgoone();
        System.out.println("Bishtarin Goone : " + Maxmanategh.getName());

        System.out.println("Which area do you want to change(Goone)?");
        num1=myscan.nextInt();
        System.out.println("Type your number of Gooneh for Change : ");
        goone1=myscan.nextInt();
        Mdata.upmanategh(num1, goone1);

        System.out.println("Which area do you want to change(Name)?");
        num2=myscan.nextInt();
        System.out.println("Type your Name for Change : ");
        name1=myscan.next();
        Mdata.upname(num2,name1);

        System.out.println("Which area do you want to change(Number)?");
        num3=myscan.nextInt();
        System.out.println("Type your Number for Change : ");
        num4=myscan.nextInt();
        Mdata.upnum(num3,num4);

        Mdata.t_name();

       Mdata.write(file2);

    }
}