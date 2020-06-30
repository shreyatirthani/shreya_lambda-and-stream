import java.util.*;
import java.util.stream.IntStream;

public class Q3 {
    public static void main(String args[])
    {
        List<String> list=new ArrayList<String>();
        list.add("abcba");
        list.add("add");
        list.add("minnie");
        list=palin(list);
        for(String i:list)
            System.out.println(i);
    }
    static List<String> palin(List<String> list)
    {
        List<String> l=new ArrayList<String>();
           for(String i:list)
           {String t = i.replaceAll("\\s+", "").toLowerCase();
            if( IntStream.range(0,t.length()/2).noneMatch(j -> t.charAt(j)!= t.charAt(t.length()-j-1)))
                l.add(i);}
            return l;
    }
}
