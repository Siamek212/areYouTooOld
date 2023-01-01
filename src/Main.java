import java.time.Year;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            int dzis = Year.now().getValue();
            Scanner scanner=new Scanner(System.in);
        System.out.println("podaj rok urodzenia");
            int rok= scanner.nextInt();
        System.out.println("podaj imie");
        String imie= scanner.next();

        int wiek = (dzis-rok);

            if (wiek <= 25) {
                System.out.println("Ale ci dobrze " + imie + " masz tylko " + wiek + " lat");
            } else if (wiek > 26) {
                System.out.println(imie + " stara dupa jestes masz az " + wiek + " lat");
            }

            }
    }




