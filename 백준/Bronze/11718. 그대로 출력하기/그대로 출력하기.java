import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<100; i++) {
            if(sc.hasNext()) {
                String a = sc.nextLine();
                if(a.length() < 101) {
                    System.out.println(a.trim());
                }
            }
        }
    }
}