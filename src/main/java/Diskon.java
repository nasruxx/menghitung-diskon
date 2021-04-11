import java.util.Scanner;
public class Diskon{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
	
		int price; // Harga
		int amount; // jumlah
		int discount; //diskon
		int total; //jumlah*harga

	System.out.print("Masukan Harga barang disini : ");
        price=input.nextInt();
        System.out.print("Masukan Jumlah barang disini : ");
        amount=input.nextInt();
        total=amount*price;

	if(total>300000){
            discount=total*30/100;
            total=total-discount;
            System.out.println("Selamat anda mendapatkan diskon 30%" );
            System.out.println ("jadi totalnya : "+total);
        }
        else if(total>= 2000000){
            discount=total*20/100;
            total=total-discount;
            System.out.println("Selamat anda mendapatkan diskon 20%" );
            System.out.println ("jadi totalnya : "+total);
        }
        else if(total>=1000000){
            discount=total*10/100;
            total=total-discount;
            System.out.println("Selamat anda mendapatkan diskon 10%" );
            System.out.println ("jadi totalnya : "+total);
        }
        else if (total<1000000){
            discount=total*0/100;
            total=total-discount;
            System.out.println("Maaf anda tidak mendapatkan diskon" );
            System.out.println ("jadi totalnya : "+total);
	}
    }
    
}
