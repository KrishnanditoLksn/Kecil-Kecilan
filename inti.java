import java.util.Scanner;
public class NotaAir {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int Nim,Galon,Bbesar,Bkecil,Gelas,hgalon,hbesar,hkecil,hgelas,dgalon,dbbesar,dbkecil,dgelas,hsdgl,hsdbb,hsdbk,hsdg,dtotal;

        System.out.println("Nama : Emmanuel Krishnandito Laksana ");
          System.out.println("NIM = 225314024");

        System.out.println("----------------------------------------");

        System.out.print("Masukkan jumlah galon : ");
         Galon= input.nextInt();
           hgalon=Galon*30000;
            dgalon=(hgalon * 15/100);
                hsdgl=hgalon-dgalon;

        System.out.print("Masukkan jumlah  Botol Besar : ");
         Bbesar= input.nextInt();
           hbesar=Bbesar * 5000;
              dbbesar=(hbesar * 12/100);
                hsdbb=hbesar- dbbesar;

        System.out.print("Masukkan jumlah Botol Kecil : " );
         Bkecil= input.nextInt();
           hkecil=Bkecil * 3000;
             dbkecil=(hkecil * 10/100);
                hsdbk=hkecil-dbkecil;

        System.out.print("Masukkan jumlah Gelas : ");
          Gelas=input.nextInt();
            hgelas=(Gelas * 1000);
                dgelas=(hgelas * 20/100);
                    hsdg=hgelas-dgelas;

         System.out.println("Jumlah : ");
         System.out.println(Galon);
         System.out.println(Bbesar);
         System.out.println(Bkecil);
         System.out.println(Gelas);

        System.out.println("=======================");

        System.out.println("Kemasan : ");
        System.out.println("Galon ");
        System.out.println("Botol Besar ");
        System.out.println("Botol Kecil ");
        System.out.println("Gelas ");

        System.out.println("=======================");

        System.out.println("Harga setiap Barang ");
        System.out.println("30000");
        System.out.println("5000");
        System.out.println("3000");
        System.out.println("1000");

        System.out.println("===================");

        System.out.println("Total yang dibeli : ");
           System.out.println(hgalon);
             System.out.println(hbesar);
            System.out.println(hkecil);
             System.out.println(hgelas);

        System.out.println("====================");
           System.out.println(dgalon);
            System.out.println(dbbesar);
            System.out.println(dbkecil);
             System.out.println(dgelas);

        System.out.println("=====================");
        System.out.println("Total   Diskon   : ");
        System.out.println(dgalon + dbbesar + dbkecil + dgelas);
        System.out.println(dtotal=dgalon + dbbesar + dbkecil + dgelas);

        System.out.println("======================");
        System.out.println("Total Bayar : ");
        System.out.println(hsdgl + hsdbb + hsdbk  + hsdg);

        System.out.println("Dapat diskon yaitu : ");
        System.out.println((hsdgl + hsdbb + hsdbk  + hsdg ) - dtotal);



    }

}
