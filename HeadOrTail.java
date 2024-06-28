import java.util.Random;

class HeadOrTail
{
    public static void main(String[] args)
    {
        int num;
        int head=0;
        int tail=0;
        Random r = new Random();
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