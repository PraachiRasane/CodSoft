import java.util.*;
import java.util.Random;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        System.out.println("Welcome to Guess the Number Game!!");
        System.out.println("Enter the number of rounds with the number of attempts per round : ");
        int n=sc.nextInt();
        int atmpt=sc.nextInt();
        int a,score=0,flag=0;
        int num,unum;
        for(int i=0;i<n;i++)
        {
            num=rand.nextInt(1,100);
            //System.out.println(num);
            a=0;
            while(a<atmpt)
            {
                System.out.println("Guess the random number generated between 1 to 100");
                unum=sc.nextInt();
                score=(atmpt*10);
                if(num==unum)
                {
                    score+=(atmpt*100);
                    flag++;
                    System.out.println("Congratulations!!Great Guess!!");
                    break;
                }
                else if(unum<num)  
                {
                    
                    System.out.println("OOPS !! Too low!!");
                }   
                else{
                    
                    System.out.println("OOPS !! Too high!!");
                }
                a+=1;    
            
            if(a==atmpt)
            {
                System.out.println("Sorry!!Reached maximum number of Attempts");
                System.out.println("Next Round Begins!! Get Ready !!");
            }
            }
        if(i==n-1)
        {
            System.out.println("Game Over!!");
            System.out.println("Score:"+score);
            System.out.println("Rounds won="+flag);
        }
        }
        
        
    }
}