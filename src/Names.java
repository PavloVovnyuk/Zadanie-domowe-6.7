import java.util.Arrays;
        import java.util.Scanner;

public class Names {
    public void imputNames() {
        String[] tabela = new String[5];
        Scanner scanner = new Scanner (System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println ("Wprowadz imie");
            tabela[i] = scanner.nextLine ();


        }
        for (String i : tabela) {
            System.out.println (tabela[4] + " \n" + tabela[3] + "\n" + tabela[2] + "\n" + tabela[1] + "\n" + tabela[0] + "\n");

            break;
        }
    }
}