import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Welcome to Student Grade Calculator!!");
        System.out.println("Please enter the number of subjects:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the marks in each subject out of 100");
        double sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("Total marks="+sum);
        double avg=(sum/n);
        System.out.println("The Average Percentage="+ String.format("%.2f",avg));
        char grade;
        if(avg>=90)
            grade='S';
        else if((avg>=80)&&(avg<90))
            grade='A';
        else if((avg>=70)&&(avg<80))
            grade='B';
        else if((avg>=60)&&(avg<70))
            grade='C';
        else if((avg>=50)&&(avg<60))
            grade='D';
        else
            grade='F';
        System.out.println("Grade="+grade);
        
    }
}