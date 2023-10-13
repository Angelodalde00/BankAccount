
package bankaccount;


public class BankAccount {

   private String name;
   private int age;
   private double Balance;
   private int accNum;
   
   public String getName(){
       return name;
   }
   public int getAge(){
       return age;
   }
    public double getBalance(){
        return Balance;
    }
    public long getaccNum(){
        return accNum;
    }
    public void setName(String l){
        this.name = l;
    }
    public void setAge(int v){
        this.age = v;
    }
    public void setBalance(double b , double c){
        this.Balance = b = c;
    }
    public void setaccNum(int e){
        this.accNum = e;
    }
}
    class Main{
        public static void main(String [] args){
            BankAccount l = new BankAccount();
            l.setName("Lester Angelo 0. Dalde");
            l.setAge(20);
            l.setBalance(89899.93,  3425.11);
            l.setaccNum(2003);
            System.out.println("TARABANKO!" + "\n" + "Name: " + l.getName() + "\n" + "Age: " + l.getAge() + "\n" + "Balance: " + l.getBalance() + "\n" + "AccountNumber: " + l.getaccNum());
        }
    }
    
    
    
    
  