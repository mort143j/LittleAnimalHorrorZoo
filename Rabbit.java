public class Rabbit{

    String species = "Rabbit";
    int y = 1;
    int x = 1;

    public void move()
    {
        y = y+1;
        x = x+1;
        speak();
    }    

    public void speak()
    {
        System.out.println("I am the" + species +", i am now standing on square" + tellPosition());
    }

    public String tellPosition()
    {
        return x + "," + y;
    }

    public void beeg()
    {
        System.out.println("Noo please do not eat me!!");
    }

}