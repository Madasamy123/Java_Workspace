import java.util.Scanner;

public class Second {

    public void print(int noOfBuildings, int noOfFloor) {
        for (int i = 0; i < noOfBuildings; i++) {
            System.out.println("Building Number: " + i);
            for (int j = 0; j < noOfFloor; j++) {
                System.out.println("  Floor Number: " + j);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter number of buildings: ");
        int noOfBuildings = scn.nextInt();

        System.out.print("Enter number of floors: ");
        int noOfFloor = scn.nextInt();

        Second second = new Second();
        second.print(noOfBuildings, noOfFloor);

        scn.close();
    }
}
