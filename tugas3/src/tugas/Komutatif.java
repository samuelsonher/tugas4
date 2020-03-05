package tugas;

public class Komutatif {
    int komutatifa;
    int komutatifb;
    int plus1;
    int plus2;
    int kali1;
    int kali2;

    public Komutatif(int komutatifa, int komutatifb){
        this.komutatifa = komutatifa;
        this.komutatifb = komutatifb;
    }

    public int getPlus1(int komutatifa, int komutatifb){
        plus1 = komutatifa+komutatifb;
        return plus1;
    }

    public int getPlus2(int komutatifa, int komutatifb){
        plus2 = komutatifb+komutatifa;
        return plus2;
    }

    public int getKali1(int komutatifa, int komutatifb){
        kali1 = komutatifa*komutatifb;
        return kali1;
    }

    public int getKali2(int komutatifa, int komutatifb){
        kali2 = komutatifb*komutatifa;
        return kali2;
    }
}
