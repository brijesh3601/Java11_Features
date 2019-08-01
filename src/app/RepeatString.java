package app;

import java.util.stream.IntStream;

public class RepeatString {
    public static void main(String[] args) throws Exception {
        String numOne = "1"; 

        IntStream.range(0, 10).forEach(i -> System.out.println(numOne.repeat(i)));
        
    }
}