import java.util.*;

public class Task3
{
    public static void main(String[] args)
    {
        user_acc u_acc=new user_acc(5000.00);
        ATM atm=new ATM(u_acc);
        atm.Transaction();
    }
}

class user_acc
{
    Scanner usc=new Scanner(System.in);
    public double bal;
    public user_acc(double ini_bal)
    {
        this.bal=ini_bal;
    }
    public void getdetails()
    {
        String name,sex;
        int age;
        name=usc.nextLine();
        sex=usc.nextLine();
        usc.nextLine();
        age=usc.nextInt();
    }
}

class ATM 
{
    private user_acc u_acc;
    Scanner asc=new Scanner(System.in);
    public ATM(user_acc acc)
    {
        this.u_acc=acc;
    }
    public void Menu()
    {
        System.out.println("Welcome to the ATM!!"+"\n"+"1.Check Balance"+"\n"+"2.Deposit"+"\n"+"3. Withdraw"+"\n"+"4.Exit");
    }
    public void Transaction()
    {
        int ch;
        double amt;
        for(int i=0;i<4;i++)
        {
            Menu();
            System.out.println("Enter your choices :");
            ch=asc.nextInt();
            switch(ch)
            {
                case 1:
                    check_bal();
                    break;
                case 2:
                    System.out.println("Enter the amount to deposit");
                    amt=asc.nextDouble();
                    deposit(amt);
                    break;
                case 3:
                    System.out.println("Enter the amount to withdraw");
                    amt=asc.nextDouble();
                    withdraw(amt);
                    break;
                case 4:
                    System.out.println("Thank you !! Please visit Again!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice!! Try Again!!");
            }
        }
    }
    public void check_bal()
    {
        System.out.println("Current Balance"+u_acc.bal);
    }
    public void deposit(double amt)
    {
        u_acc.bal+=amt;
        System.out.println("Deposit successful!! New Balance:"+u_acc.bal);
    }
    public void withdraw(double amt)
    {
        if(u_acc.bal>amt)
        {
            u_acc.bal-=amt;
            System.out.println("Withdrawal successful!! New Balance:"+u_acc.bal);
        }
        else
        {
            System.out.println("ALERT!!! Insufficient Balance!!");
        }
    }
}

