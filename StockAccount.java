package Day11_12;
import java.util.Scanner;
public class StockAccount {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter share name: ");
            String name=sc.nextLine();
            System.out.println("Enter no of stock: ");
            int no_stock=sc.nextInt();
            System.out.println("Enter no of share: ");
            int no_share=sc.nextInt();
            System.out.println("Enter one share price: ");
            int share_price=sc.nextInt();
            System.out.println("Share name: " +name);
            System.out.println("Number of stock: " +no_stock);
            System.out.println("Number of share: " +no_share);
            System.out.println("Share price: " +share_price);

            StockAccount s = new StockAccount();
            s.stockreport(share_price,no_share,no_stock);
            //System.out.println();
        }
        public void stockreport(int share_price,int no_share,int no_stock){
            int each_stock_value=share_price*no_share;
            int total_stock=each_stock_value+no_stock;
            System.out.println("Total value of each stock: " +each_stock_value);
            System.out.println("Total value of stock: " +total_stock);


        }
    }
