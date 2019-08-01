package app;

public class IsBlank {
    public static void main(String[] args) throws Exception {
        String emptyString = "", plentyAString ="AAAAAAAA";

        System.out.println("emptyString is Blank: " + emptyString.isBlank());
        System.out.println("plentyAString is Non-Blank: " + plentyAString.isBlank());

      
    }
}