package tugas;

public class Distributif {
    int distributifa;
    int distributifb;
    int distributifc;
    int plus1;
    int plus2;
    int min1;
    int min2;

    public Distributif(int distributifa, int distributifb, int distributifc){

        try{
            this.distributifa = distributifa;
            this.distributifb = distributifb;
            this.distributifc = distributifc;
        }
        catch (NumberFormatException nfe){
            System.out.println("Bukan angka. Harus menggunakan angka");
        }
        catch (ArithmeticException ae) {
            System.out.println("Harus menggunakan bilangan bulat");
        }
    }

    public int getPlus1(int distributifa, int distributifb, int distributifc){
        plus1 = distributifa*(distributifb+distributifc);
        return plus1;
    }

    public int getPlus2(int distributifa, int distributifb, int distributifc){
        plus2 = (distributifa*distributifb)+(distributifa*distributifc);
        return plus2;
    }

    public int getMin1(int distributifa, int distributifb, int distributifc){
        min1 = distributifa*(distributifb-distributifc);
        return min1;
    }

    public int getMin2(int distributifa, int distributifb, int distributifc){
        min2 = (distributifa*distributifb)-(distributifa*distributifc);
        return min2;
    }
}
