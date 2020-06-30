import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Q1 {
    public static void main(String args[])
    {
        IntStream stream=IntStream.of(10,20,30,40,50,60,70,80,90,100);
        OptionalDouble obj=stream.average();
        if(obj.isPresent())
        {
            System.out.println(obj.getAsDouble());
        }
        else
        {
            System.out.println(-1);
        }
    }
}
