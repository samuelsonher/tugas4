package tugas;

public class Asosiatif {
    int asosiatifa;
    int asosiatifb;
    int asosiatifc;
    int plus1;
    int plus2;
    int kali1;
    int kali2;

    public Asosiatif(int asosiatifa, int asosiatifb, int asosiatifc){
        this.asosiatifa = asosiatifa;
        this.asosiatifb = asosiatifb;
        this.asosiatifc = asosiatifc;
    }

    public int getPlus1(int asosiatifa, int asosiatifb, int asosiatifc){
        plus1 = (asosiatifa+asosiatifb)+asosiatifc;
        return plus1;
    }

    public int getPlus2(int asosiatifa, int asosiatifb, int asosiatifc){
        plus2 = asosiatifa+(asosiatifb+asosiatifc);
        return plus2;
    }

    public int getKali1(int asosiatifa, int asosiatifb, int asosiatifc){
        kali1 = (asosiatifa*asosiatifb)*asosiatifc;
        return kali1;
    }

    public int getKali2(int asosiatifa, int asosiatifb, int asosiatifc){
        kali2 = asosiatifa*(asosiatifb*asosiatifc);
        return kali2;
    }
}
