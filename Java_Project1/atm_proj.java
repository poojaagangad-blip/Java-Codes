package Java_Project1;



import java.util.Scanner;

public class atm_proj {
    private static int balance = 10000;
    private static int pin = 1234;
    private static String lastTransaction = "None";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PIN: ");
        int enteredPin = sc.nextInt();
        
        if (enteredPin != pin) {
            System.out.println("❌ Wrong PIN! Access Denied.");
            return;
        }
        
        System.out.println("✅ Welcome to ATM!");
        showMenu(sc);
        sc.close();
    }
    
    private static void showMenu(Scanner sc) {
        int choice;
        do {
            System.out.println("\n=== ATM MENU ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Last Transaction");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            
            choice = sc.nextInt();
            
            switch(choice) {
                case 1: checkBalance(); break;
                case 2: deposit(sc); break;
                case 3: withdraw(sc); break;
                case 4: showLastTransaction(); break;
                case 5: System.out.println("Thank you! Goodbye."); return;
                default: System.out.println("Invalid option!");
            }
        } while(choice != 5);
    }
    
    private static void checkBalance() {
        System.out.println("💰 Current Balance: Rs." + balance);
        lastTransaction = "Balance checked";
    }
    
    private static void deposit(Scanner sc) {
        System.out.print("Enter deposit amount: Rs.");
        int amount = sc.nextInt();
        if(amount > 0) {
            balance += amount;
            lastTransaction = "Deposited: Rs." + amount;
            System.out.println("✅ Deposited Rs." + amount);
        } else {
            System.out.println("❌ Invalid amount!");
        }
    }
    
    private static void withdraw(Scanner sc) {
        System.out.print("Enter withdraw amount: Rs.");
        int amount = sc.nextInt();
        if(amount > balance) {
            System.out.println("❌ Insufficient balance!");
        } else if(amount <= 0) {
            System.out.println("❌ Invalid amount!");
        } else {
            balance -= amount;
            lastTransaction = "Withdrew: Rs." + amount;
            System.out.println("✅ Please collect Rs." + amount);
        }
    }
    
    private static void showLastTransaction() {
        System.out.println("📄 Last Transaction: " + lastTransaction);
    }
}