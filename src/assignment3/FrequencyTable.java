import java.util.Scanner;
public class FrequencyTable {
      public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("How many dice?");
        int dice = in.nextInt();

        int min=dice;
        int max = 6 * dice;
        
        int [] frequency = new int[max+1];

        for (int roll=0; roll < 10000; roll++) {
            int total=0;
            for(int d = 0; d< dice; d++) {
                total += (int)(Math.random()*6) + 1;
            }
            frequency[total]++;
        }
        System.out.println("Times each value was rolled with " + dice + "dice over 10000 rolls" );

        for (int value = min; value <= max; value++) {
            System.out.println(value + ": "+frequency[value]);
        }
in.close();

}
}