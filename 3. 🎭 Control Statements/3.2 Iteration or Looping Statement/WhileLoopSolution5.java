import java.util.Scanner;
public class WhileLoopSolution5 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number N");

        int n =sc.nextInt();
        int sum=0;
        int num=1;



        while (num<=n) {

            System.out.println(num);
            sum=sum+num;
            num++;
        }

        System.out.println(sum);

    }
    

}
