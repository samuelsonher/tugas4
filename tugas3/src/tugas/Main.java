package tugas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        char back;
        do{
            System.out.println("SIFAT OPERASI HITUNG");
            System.out.println("-----Pilihan-----");
            System.out.println("1. Komutatif");
            System.out.println("2. Asosiatif");
            System.out.println("3. Distributif");
            System.out.println("Pilih menu : ");
            char pilih;
            pilih = input.next().charAt(0);
            switch (pilih){
                case '1':
                    System.out.println("Sifat komutatif");
                    System.out.println("Hanya berlaku untuk penjumlahan dan perkalian");
                    try {
                        System.out.print("Masukkan bil a = ");
                        int komutatifa = input.nextInt();
                        System.out.print("Masukkan bil b = ");
                        int komutatifb = input.nextInt();
                        Komutatif komutatif = new Komutatif(komutatifa,komutatifb);
                        System.out.println("Penjumlahan");
                        System.out.println("a + b = " + komutatifa + " + " + komutatifb + " = " + komutatif.getPlus1(komutatifa,komutatifb));
                        System.out.println("b + a = " + komutatifb + " + " + komutatifa + " = " + komutatif.getPlus2(komutatifa,komutatifb));
                        System.out.println("Perkalian");
                        System.out.println("a * b = " + komutatifa + " * " + komutatifb + " = " + komutatif.getKali1(komutatifa,komutatifb));
                        System.out.println("b * a = " + komutatifb + " * " + komutatifa + " = " + komutatif.getKali2(komutatifa,komutatifb));
                    }
                    catch (InputMismatchException err) {
                        System.err.println("Errornya" + " " + err.getMessage());
                        System.out.println("Input integer aja yaa");
                    }
                    finally {
                        System.out.println("Perhitungan selesai...");
                    }
                    break;
                case '2':
                    System.out.println("Sifat asosiatif");
                    System.out.println("Hanya berlaku untuk penjumlahan dan perkalian");
                    try{
                        System.out.print("Masukkan bil a = ");
                        int asosiatifa = input.nextInt();
                        System.out.print("Masukkan bil b = ");
                        int asosiatifb = input.nextInt();
                        System.out.print("Masukkan bil c = ");
                        int asosiatifc = input.nextInt();

                        Asosiatif asosiatif = new Asosiatif(asosiatifa,asosiatifb,asosiatifc);

                        System.out.println("Penjumlahan");
                        System.out.println("(a + b) + c = (" + asosiatifa + " + " + asosiatifb + ") + " + asosiatifc);
                        System.out.println("            = " + (asosiatifa+asosiatifb) + " + " + asosiatifc + " = " + asosiatif.getPlus1(asosiatifa,asosiatifb,asosiatifc));
                        System.out.println("a + (b + c) = " + asosiatifa + " + (" + asosiatifb + " + " + asosiatifc + ")");
                        System.out.println("            = " + asosiatifa + " + " + (asosiatifb+asosiatifc) + " = " + asosiatif.getPlus2(asosiatifa,asosiatifb,asosiatifc));
                        System.out.println("Perkalian");
                        System.out.println("(a * b) * c = (" + asosiatifa + " * " + asosiatifb + ") * " + asosiatifc + " = " + asosiatif.getKali1(asosiatifa,asosiatifb,asosiatifc));
                        System.out.println("            = " + (asosiatifa*asosiatifb) + " * " + asosiatifc + " = " + asosiatif.getKali1(asosiatifa,asosiatifb,asosiatifc));
                        System.out.println("a * (b * c) = " + asosiatifa + " * (" + asosiatifb + " * " + asosiatifc + ")");
                        System.out.println("            = " + asosiatifa + " * " + (asosiatifb*asosiatifc) + " = " + asosiatif.getKali2(asosiatifa,asosiatifb,asosiatifc));
                    }
                    catch(InputMismatchException err){
                        System.err.println("Errornya" + " " + err.getMessage());
                        System.out.println("Input integer aja yaa");
                    }
                    finally{
                        System.out.println("Perhitungan selesai...");
                    }
                    break;
                case '3':
                    System.out.println("Sifat distributif");
                    try{
                        System.out.print("Masukkan bil a = ");
                        int distributifa = input.nextInt();
                        System.out.print("Masukkan bil b = ");
                        int distributifb = input.nextInt();
                        System.out.print("Masukkan bil c = ");
                        int distributifc = input.nextInt();

                        Distributif distributif = new Distributif(distributifa, distributifb, distributifc);

                        System.out.println("Perkalian dan Penjumlahan");
                        System.out.println("a * (b + c) = " + distributifa + " * (" + distributifb + " + " + distributifc + ")");
                        System.out.println("            = " + distributifa + " * " + (distributifb+distributifc));
                        System.out.println("            = " + distributif.getPlus1(distributifa, distributifb, distributifc));
                        System.out.println("(a*b) + (a*c) = (" + distributifa + " * " + distributifb + ") + (" + distributifa + " * " + distributifc + ")"  );
                        System.out.println("              = " + (distributifa*distributifb) + " + " + (distributifa*distributifc) );
                        System.out.println("              = " + distributif.getPlus2(distributifa, distributifb, distributifc));
                        System.out.println("Perkalian dan Pengurangan");
                        System.out.println("a * (b - c) = " + distributifa + " * (" + distributifb + " - " + distributifc + ")");
                        System.out.println("            = " + distributifa + " * " + (distributifb-distributifc));
                        System.out.println("            = " + distributif.getMin1(distributifa, distributifb, distributifc));
                        System.out.println("(a*b) - (a*c) = (" + distributifa + " * " + distributifb + ") - (" + distributifa + " * " + distributifc + ")");
                        System.out.println("              = " + (distributifa*distributifb) + " - " + (distributifa*distributifc));
                        System.out.println("              = " + distributif.getMin2(distributifa, distributifb, distributifc));
                    }
                    catch(InputMismatchException err){
                        System.err.println("Errornya" + " " + err.getMessage());
                        System.out.println("Input integer aja yaa");
                    }
                    finally{
                        System.out.println("Perhitungan selesai...");
                    }
                    break;
                default:
                    System.out.println("Salah memasukkan pilihan!");
                    break;
            }
            System.out.println("Kembali ke menu (y/t) : ");
            back = input.next().charAt(0);
        }while (back == 'y');

    }
}
