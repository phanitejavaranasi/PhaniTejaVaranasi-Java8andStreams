import java.util.stream.IntStream;
import java.util.OptionalDouble;


public class Task1 {
    public static void main(String args[])
    {
        IntStream s=IntStream.of(1,3,5,7,9,11,13,15,17,19);
        OptionalDouble obj=s.average();
        if(obj.isPresent())
        {
            System.out.println("The average of numbers is :"+obj.getAsDouble());
        }
        else
        {
            System.out.println("Not available");
        }
    }
}