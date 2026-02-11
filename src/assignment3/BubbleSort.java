import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

    System.out.print("How big would you like the array to be?");
    int size = in.nextInt();

    int[]numbers = new int[size];

    System.out.println("Enter " + size + " integer values:");

    for (int i=0; i<size; i++) {
        numbers[i] = in.nextInt();
    }

    for (int round = 0; round < size - 1; round++) {
        for (int i = 0; i< size - 1 - round; i++) {
            if (numbers[i] > numbers [i+1]) {
                int hold = numbers [i];
                numbers[i] = numbers [i+1];
                numbers[i+1] = hold;
            }
        }
    }

    System.out.print("Bubble sorted values:");
    for (int i=0; i< numbers.length; i++) {
        System.out.print(numbers[i]+ ", ");
    }
    
    
    
in.close();

}
}
