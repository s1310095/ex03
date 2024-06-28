import java.util.Random;
import java.util.Scanner;

class HeadOrTail
{
    public static void main(String[] args)
    {
        int num;
        int head=0;
        int tail=0;
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        String name = new String();

        System.out.println("Who are you?");
        name = sc.nextLine();
        System.out.println("Hello, "+name+"!");


        System.out.println("Tossing a coin...");
        for(int i=1; i<4; i++)
        {
            System.out.print("Round "+i+": ");
            num = r.nextInt(2);
            if(num == 0)
            {
                head++;
                System.out.println("Heads");
            }
            if(num == 1)
            {
                tail++;
                System.out.println("Tails");
            }
        }
        
        System.out.println("Heads: "+head+", Tails: "+tail);
    }
}