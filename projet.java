import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class projet{
    public static void main(String[] args) {
        System.out.println("quelle table souhaitez-apprendre ?");
        Scanner scanner = new Scanner(System.in);
        int table = scanner.nextInt();
        List<Integer> multiplicateurs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            multiplicateurs.add(i);
        }
        Collections.shuffle(multiplicateurs);

        for (int i : multiplicateurs) {
            System.out.println("Combien font " + table + " x " + i + " ?");
            int reponse = scanner.nextInt();

            while (reponse != table * i) {
                System.out.println("Mauvaise réponse, recommence :");
                reponse = scanner.nextInt();
            }

            System.out.println("Bonne réponse !");
        }
    scanner.close();

    }
}