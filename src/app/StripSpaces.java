package app;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StripSpaces {
    public static void main(String[] args) throws Exception {
        String oneSpace = " "; 
        //
        String spaceSlash = oneSpace.repeat(4) + "/";
        String slashSpace =  "/" + oneSpace.repeat(4);

        String folderStructure = "C:,program files,java";

        List<String> list = Stream.of(folderStructure.split(","))
                            .map (elem -> new String(elem))
                            .collect(Collectors.toList());
        
        //folder path with leading & trailing spaces
        System.out.println("\nFolder Path with spaces");
        list.forEach(w -> System.out.print(slashSpace + w + spaceSlash));

        System.out.println("\n\nFolder Path without spaces using stripTrailing/stripLeading ");
        list.forEach(w -> System.out.print(slashSpace.stripTrailing() + w + spaceSlash.stripLeading()));

        
    }
}