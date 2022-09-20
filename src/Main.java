import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Introduceti numele: ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        System.out.println("Introduceti prenumele: ");
        Scanner in2 = new Scanner(System.in);
        String surname = in2.nextLine();

        System.out.println("Introduceti numarul de produse: ");
        Scanner in3 = new Scanner(System.in);
        int noOfProducts = in3.nextInt();
        String[] products = new String[noOfProducts];
        for (int i = 0; i < noOfProducts; i++) {
            System.out.println("Introduceti urmatorul produs: ");
            Scanner in4 = new Scanner(System.in);
            String product = in4.nextLine();
            products[i] = product;
        }

        System.out.println("Introduceti bugetul disponibil (in lei):");
        Scanner in5 = new Scanner(System.in);
        int budget = in5.nextInt();

        System.out.println("Numele dumneavoastra complet este: ");
        System.out.println(fullName(name,surname));

        System.out.println("Numarul caracterelor din lista este: ");
        System.out.println(noOfChars(products));

        System.out.println("Bugetul dumneavoastra in EURO este de: ");
        System.out.println(budgetInEuro(budget) + " EURO");

    }
    public static String fullName (String name, String surname){
        return name + " " + surname;
    }
    public static int noOfChars (String[] products){
        StringBuilder finalString = new StringBuilder();
        for (String product : products) {
            finalString.append(product);
        }
        return finalString.length();
    }

    public static double budgetInEuro (int budgetInLei){
        return budgetInLei / 4.96;
    }

}

























/*
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int time = in.nextInt();
        if (time < 10) {
            System.out.println("Good morning.");
        }
        else if (time < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
    }
}

 */