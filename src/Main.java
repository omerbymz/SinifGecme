import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        double ort;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();

        ort = (mat+fizik+turkce+kimya+muzik) /5  ;

        if (ort <55){
            System.out.print("Sınıfta kaldınız :(");
            System.out.print("Ortalamanız: "+ ort);
        }else {
            System.out.print("Tebrikler sınıfı geçtiniz :)");
            System.out.print("Ortalamanız: "+ ort);

        }

    }
}
