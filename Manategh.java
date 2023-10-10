//KooroshJamalpoor
//1402/4/10

package Manategh;

public class Manategh {
    private String name;
    private int num;
    private int goone;

    public Manategh(String name, int num, int goone) {
        this.num = num;
        this.name = name;
        this.goone = goone;
    }

    public String getName() {

        return name;
    }

    public int getNumber() {

        return num;
    }

    public int getGoone() {

        return goone;
    }

    public void setGoone(int goone) {

        this.goone = goone;
    }
    public void setName(String name) {

        this.name = name;
    }
    public void setNumber(int num) {

        this.num = num;
    }
}
