import java.util.Scanner;

public class ElectricityBill {
    public void printElectricityBill(int units){
        int unit = units;
        double amount = 100.00;
        if(unit <= 200){
            amount += unit*0.8;
        }
        else if(unit <= 300){
            amount += (200*0.8) + ((unit - 200)*0.9);
        }
        else{
            amount += (200*0.8) + (100*0.9) + ((unit-300)*1);
        }
        
        if(amount > 300){
            amount += amount*0.1236;
        }
        System.out.println("Total amount : " + amount);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units : ");
        int unit = sc.nextInt();
        sc.close();
        ElectricityBill bill = new ElectricityBill();
        bill.printElectricityBill(unit);
    }
}
