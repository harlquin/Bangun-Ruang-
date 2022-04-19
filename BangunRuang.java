import java.util.Scanner;
public class BangunRuang{
    public static void main(String[] args) {
  

       Scanner masukan = new Scanner(System.in);
        int pilihan=9;
        do {
            System.out.println("Aplikasi Penghitungan Volume & Luas");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Tabung");
            System.out.println("0. EXIT");
            System.out.println("Masukan Pilihan Anda : ");
            System.out.print("press '0' for exit !!!");
            pilihan=masukan.nextInt();
            switch(pilihan){
                case 1 : kubus();break;
                case 2 : balok();break;
                case 3 : tabung();break;
            }
        }while(pilihan !=0);
    }
    
    private static void kubus(){
        Scanner masukan = new Scanner(System.in);
        float s1 , v, pl;
        System.out.print("Masukkan sisi (cm) : ");
        s1 = masukan.nextFloat();  
        pl= 6* (s1*s1);
        v=s1*s1*s1;
        System.out.println("Luas Permukaan Kubus (cm2) : "+ pl);
        System.out.println("Volume Kubus (cm3) : "+ v + "\n");
    }
    private static void balok(){
        Scanner masukan = new Scanner(System.in);
        float p, l, t, v, pl;
        System.out.print("Masukkan panjang (cm) : ");
        p = masukan.nextFloat();  
       System.out.print("Masukkan lebar (cm) : ");
       l = masukan.nextFloat(); 
       System.out.print("Masukkan tinggi (cm) : ");
        t = masukan.nextFloat(); 
        pl = 2*((p*l)+(p*t)+(l*t));
        v=p*l*t;
        System.out.println("Luas Permukaan balok (cm2) : "+ pl);
        System.out.println("Volume balok (cm3) : "+ v + "\n");
    }
	    private static void tabung(){
	     Scanner masukan = new Scanner(System.in);
	     float jari2, l, t, v, pl;
	     System.out.print("Masukkan jari-jari (cm) : ");
	     jari2 = masukan.nextFloat();     
	     System.out.print("Masukkan Tinggi (cm) : ");
	     t = masukan.nextFloat();
	     pl = 2* 3.14f * jari2 * (jari2 + t);
	     v= 3.14f * (jari2 * jari2)* t;
	     System.out.println("Luas Permukaan Tabung (cm2): " + pl);
	     System.out.println("Volume Tabung (cm2) : " + v + "\n");
	   }
	}
