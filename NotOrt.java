import java.util.Scanner;
public class NotOrt {

    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;
        Scanner inp = new Scanner(System.in);
        System.out.println("Matematik Notunuzu Giriniz");
        matematik = inp.nextInt();
        System.out.println("Fizik Notunuzu Giriniz");
        fizik = inp.nextInt();
        System.out.println("Kimya Notunuzu Giriniz");
        kimya = inp.nextInt();
        System.out.println("Türkçe Notunuzu Giriniz");
        turkce = inp.nextInt();
        System.out.println("Tarih Notunuzu Giriniz");
        tarih = inp.nextInt();
        System.out.println("Müzik Notunuzu Giriniz");
        muzik = inp.nextInt();

        int sonuc = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;
        System.out.println("Not Ortalamanız:" + sonuc);
        String durum = sonuc >= 60 ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız";
        System.out.println(durum);
    }
}