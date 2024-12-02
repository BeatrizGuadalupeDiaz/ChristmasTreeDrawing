import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tree = scanner.nextInt();
        for(int y= 1; y <= tree; y++ ){

            for(int j=1; j<=tree-y; j++){
                System.out.print(" ");
            }
            for(int x=1; x<=y; x++){
                System.out.print("*");
            }
            for(int x1=1; x1<=y-1; x1++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}