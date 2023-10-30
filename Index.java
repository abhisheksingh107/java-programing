import java.util.*;

class Index {
    public static String reverse(String Name) {
        String rev = "";
        for (int i = Name.length() - 1; i >= 0; i--) {
            rev = rev + Name.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Enter the Nane");
            String string = sc.nextLine();
            System.out.println(reverse(string));
        }
    }
}

