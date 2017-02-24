public class Game{

    public static void main(String[] args)
    {

        Rabbit r = new Rabbit();
        Snake s = new Snake();

        for(int i = 1; i <= 4; i++)
        {

            r.move();
            s.move();
        }

     r.speak();
     r.beeg();
     r.move();
     s.kill();   
    }
}
