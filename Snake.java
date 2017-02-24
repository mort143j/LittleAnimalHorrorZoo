public class Snake{

    String species = "snake";
    int y = 10;
    int x = 10;

    public void move()
    {
        y = y-1;
        x = x-1;
        speak();
    }

    public void speak()
    {
        System.out.println("I am the" + species + ", i am now standing on square" + tellPosition());
    }

    public String tellPosition()
    {
        return x + "," + y;
    }

    public void kill()
    {
        System.out.println("Muahaha I am going to eat you");
    }       
}