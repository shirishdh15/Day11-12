package Day11_12;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Arrays;
public class DeckOfCards {
    
    public class DeckOfCardSort {
        public static void main(String[] args) {
            String[] carddeck = new String[52];
            String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
            String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
                    "10", "Jack", "Queen", "King"};
            LinkedList<String> list = new LinkedList<String>();
            int j2 = 0;
            for (int i = 0; i < suits.length; i++) {
                for (int j = 0; j < ranks.length; j++) {
                    carddeck[j2] = suits[i] + " " + ranks[j];
                    j2++;
                }
            }
            carddeck = Utility.shuffleCardDeck(carddeck);
            String[] arr = new String[9];
            char[] last1 = new char[2];
            char[] last2 = new char[2];
            j2 = 0;
            String temp1, temp2, temp3,temp4;
            for (int p = 0; p < 4; p++) {
                for (int j = 0; j < 9; j++) {
                    arr[j] = carddeck[j2];
                    j2++;

                }
                for (int i = 0; i < arr.length - 1; i++) {
                    for (int j = 0; j < arr.length - i - 1; j++) {
                        temp1 = arr[j];
                        temp2 = arr[j + 1];

                        last1[0] = temp1.charAt(temp1.length() - 2);
                        last1[1] = temp1.charAt(temp1.length() - 1);
                        last2[0] = temp2.charAt(temp2.length() - 2);
                        last2[1] = temp2.charAt(temp2.length() - 1);
                        if (Arrays.compare(last1, last2) > 0) {
                            temp3 = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp3;

                        }

                    }
                }
                System.out.println(Arrays.toString(arr));
                list.equals("For Player " + p + " : \n");
                for (int j = 0; j < 9; j++) {
                    temp4 = arr[j].substring(0, arr[j].length() - 2);
                    // System.out.print(temp4+"-->");
                    list.equals(temp4 + "-->");
                }
                list.equals("\n");
            }
            // printing the queue
            System.out.println(list);

        }

    }
}
