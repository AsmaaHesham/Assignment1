
package question.pkg2;


public class Question2 {

    
    public static void main(String[] args) {
        
      Account acc1 = new Account(1122,20000,4.5);
       
         acc1.withdraw(2500);
         acc1.deposit(3000);
         acc1.getBalance();
         acc1.getInterestRate();
  acc1.getMonthlyInterestRate();
    }
    
}
