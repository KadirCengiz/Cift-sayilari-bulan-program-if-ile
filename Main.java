import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişkenin girilmesi.

        int k;

        //"k" değerinin girilmesi.

        Scanner inp = new Scanner(System.in);
        System.out.print("k değerini giriniz: ");
        k= inp.nextInt();

        //Döngü oluşturulması.

        for (int i=1; i<=k; i++){
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}