import java.util.*;

class JavaAtm{
    float balance=50000;
    float dep,with;
    Scanner sc= new Scanner(System.in);
    void balance(){
        System.out.println("Your current balance is :"+balance);
    }
    void deposit(){
        System.out.print("Enter Deposit Amount :");
        dep=sc.nextFloat();
        balance=dep+balance;
        System.out.println("Your Updated Balance is :"+balance);
    }
    void withdraw(){
        System.out.println("Enter Withdraw Amount :");
        with=sc.nextFloat();
        balance=balance-with;
        System.out.println("Your updated balance is :"+balance);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        JavaAtm obj =new JavaAtm();
        
        try{
            System.out.println("======Welcome to DP bank Atm======");
            System.out.println("***********************************");
            System.out.println("Please Enter Your card :");
            System.out.println("***********************************");
            int pin=123;
            System.out.print("Enter your pin :");
            int psw=sc.nextInt();
            if(psw==pin){
                while(true){
                    System.out.println("1 for balance \n2 for deposit\n3 for withdraw\n4 for Exit");
                    System.out.print("Please select a option :");
                    int op=sc.nextInt();
                    if(op==1){
                        obj.balance();
                    }
                    else if(op==2){
                        obj.deposit();
                    }
                    else if(op==3){
                        obj.withdraw();
                    }
                    else if(op==4){
                        System.out.println("***********************************");
                        Thread.sleep(2000);
                        System.out.println("Thanks for using DP bank atm \n");
                        break;
                    }
                    else{
                        System.out.println("***********************************");
                        Thread.sleep(100);
                        System.out.println("Please Select Right Option");
                        Thread.sleep(100);
                        System.out.println("***********************************");
                        Thread.sleep(100);
                        System.out.println(" Please Try Again !!!!!!\n");
                        break;
                    }
                }
            }
            else{
                System.out.println("***********************************");
                Thread.sleep(2000);
                System.out.println("Wrong Password......");
                System.out.println("***********************************");
                Thread.sleep(2000);
                System.out.println("Please Try Again !!!!!");
                System.out.println("***********************************");
                Thread.sleep(2000);
                System.out.println("\t Thank You for Using DP bank Atm");
                Thread.sleep(2000);
                System.out.println("***********************************\n");

            }
            
            
        }
        catch(InterruptedException e){
            System.out.println("Interrupted Exception is "+e);
        }
    }
}
