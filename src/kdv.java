import java.util.Scanner;
public class kdv {
    public static void main(String[] args){
        double fiyat,kdvOran=0.18;
        Scanner inp = new Scanner(System.in);

        System.out.print("Ürün Fiyat Bilgisi Giriniz :");
        fiyat = inp.nextDouble();
        System.out.print("Ürün Fiaytı :" + fiyat);
        System.out.print("\nKdv Oranı :" + kdvOran);
        double kdvTutar = fiyat * kdvOran ;
        System.out.print("\nKdv tutarı :" + kdvTutar );
        double kdvliTutar = fiyat + kdvTutar ;
        System.out.print("\nKdv'li Tutar :" + kdvliTutar);
    }
}
