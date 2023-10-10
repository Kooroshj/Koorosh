//KooroshJamalpoor
//1402/4/10

package Manategh;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Manateghdata implements Tavabeh  {
    private Manategh[] nahie;
    private int size;

    public Manateghdata(int zarfiat) {
        nahie = new Manategh[zarfiat];
        size = 0;
    }

    public void reader(String file1) {
      try {
          BufferedReader reader = new BufferedReader(new FileReader(file1));
          String line;
          while ((line = reader.readLine()) != null) {
              String[] a1 = line.split(",");
              String name = a1[0];
              int num = Integer.parseInt(a1[1]);
              int goone = Integer.parseInt(a1[2]);
              Manategh area = new Manategh(name, num, goone);
              plusmantaghe(area);
          }
          reader.close();
      }
      catch (IOException e)
      {
          System.out.println("EROR!!!");
      }
    }

    public void write(String file2)  {
       try {
           FileWriter writer = new FileWriter(file2);
           for (int i = 0; i < size; i++) {
               Manategh area = nahie[i];
               writer.write(area.getName() + "," + area.getNumber() + "," + area.getGoone() + "\n");
           }
           writer.close();
       }
       catch (IOException e)
       {
           System.out.println("EROR!!!");
       }
    }

    public void plusmantaghe(Manategh area) {
        nahie[size] = area;
        size++;
    }

    public Manategh findname(String name) {
        int count1=0;
        for (int i = 0; i < size; i++) {
            Manategh area = nahie[i];
            if (area.getName().equals(name)) {
                System.out.println("Your Name Existed! :");
                System.out.println(area.getName() + "," + area.getNumber() + "," + area.getGoone());
                count1++;
            }

        }
        if(count1==0)
            System.out.println("Not Found!!!");
        return null;
    }

    public Manategh findnumber(int number) {
        int count=0;
        for (int i = 0; i < size; i++) {
            Manategh area = nahie[i];
            if (area.getNumber() == number) {
                System.out.println("Your Number Existed! :");
                System.out.println(area.getName() + "," + area.getNumber() + "," + area.getGoone());
                count++;
                return area;
            }
        }
        if(count==0)
        System.out.println("Not Found!!!");
        return null;
    }

    public Manategh Mfindgoone() {
        Manategh max = null;
        int maximumg = 0;
        for (int i = 0; i < size; i++) {
            Manategh area = nahie[i];
            if (area.getGoone() > maximumg) {
                max = area;
                maximumg = area.getGoone();
            }

        }
        return max;
    }

    public void t_name() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
               Manategh nahie1 = nahie[i];
                Manategh nahie2 = nahie[j];
                if (nahie1.getName().compareTo(nahie2.getName()) > 0) {
                    nahie[i] = nahie2;
                    nahie[j] = nahie1;
                }
                }
            }
        }
    public void upmanategh(int num, int gooneN) {

            Manategh area = findnumber(num);
            if (area != null) {
                area.setGoone(gooneN);
            }
    }
    public void upname(int num,String name)
    {
        Manategh area = findnumber(num);
        if (area != null) {
            area.setName(name);
        }

    }
    public void upnum(int num,int num4)
    {
        Manategh area = findnumber(num);
        if (area != null) {
            area.setNumber(num4);
        }

    }


}

