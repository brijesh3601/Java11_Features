package app;

import java.util.List;
import java.util.stream.Collectors;

public class LinesAsCollection {
    public static void main(String[] args) throws Exception {
        String str = "Line1\nLine2\nLine3"; 
        
        //Collect lines as list
        List<String> list = str 
                            .lines() 
                            .collect(Collectors.toList()); 

        //print list
        list.stream().forEach(System.out::println);

    }
}