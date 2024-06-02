import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Tree tree = new Tree();

        Scanner sc = new Scanner(System.in);
        int command = 0;

        do {
            System.out.println("\nSelect a Command: ");
            System.out.println("[1] - Insert Data");
            System.out.println("[2] - Display Data");
            System.out.println("[3] - Exit");
            System.out.println("\nType number 1 to start: ");
            command = sc.nextInt();
            sc.nextLine();
            try {
                switch (command) {
                    case 1:
                        System.out.println("Enter pin to proceed: ");
                        int key = sc.nextInt();
                        System.out.println("Enter Brand: ");
                        sc.nextLine();
                        String trustBrand = sc.nextLine();
                        System.out.println("Enter Flavour: ");
                        String trustFlavour = sc.nextLine();
                        System.out.println("Pila mani ka rounds gamiton?: ");
                        String trustRounds = sc.nextLine();
                

                        tree.insert(key, new Trust(trustBrand, trustFlavour, trustRounds));
                        System.out.println("\nAyaw ni gamita sa Pamayot ha!.");
                        break;
                    case 2:
                        System.out.println("Your bought item: ");
                        tree.inorder();
                        System.out.println();
                        break;

                }
            } catch (Exception ex) {
                System.out.println("\nError: " + ex.getMessage());
            }
        } while (command != 3);

        sc.close();
    }

}
