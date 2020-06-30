import java.util.*;
import java.util.stream.Collectors;

public class Q2 {
    public static void main(String args[]) {
        List<String> list = new ArrayList<String>();
        list.add("abd");
        list.add("abc");
        list.add("bcda");
        list=search(list);
        for(String i:list)
            System.out.println(i);
    }
    static List<String> search(List<String> list)
    {
        return list.stream().filter(s -> s.startsWith("a")).filter(s -> s.length()==3).collect(Collectors.toList());
    }
}