import java.util.Scanner;

public class PemilihanHariDenganIf17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input day: ");
        byte Day = input.nextByte();
        
        if (Day >= 1 && Day <= 5) {
            System.out.println("Weekday");
        } else if (Day == 6 || Day == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid Number");
        }
    }
}