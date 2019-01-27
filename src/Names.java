import java.util.Scanner;

public class Names {
    public void imputNames() {
        String[] name = new String[5];
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Wprowadż 1 imije");
        name[0]= scanner.nextLine ();
        System.out.println ("Wprowadż 2 imije");
        name[1]= scanner.nextLine ();
        System.out.println ("Wprowadż 3 imije");
        name[2]= scanner.nextLine ();
        System.out.println ("Wprowadż 4 imije");
        name[3]= scanner.nextLine ();
        System.out.println ("Wprowadż 5 imije");
        name[4]= scanner.nextLine ();
        System.out.println ("Cześć " + name[4]);
        System.out.println ("Cześć " + name[3]);
        System.out.println ("Cześć " + name[2]);
        System.out.println ("Cześć " + name[2]);
        System.out.println ("Cześć " + name[1]);
    }
}