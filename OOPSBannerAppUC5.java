public class OOPSBannerAppUC5 {

    public static void main(String[] args) {

        
        String[] banner = {
            String.join("", "*","*","*","*","*","*","*","*","*","*","*","*","*","*","*"),
            String.join("", "*","   OOPS APP   ","*"),
            String.join("", "*","             ","*"),
            String.join("", "*","   WELCOME   ","*"),
            String.join("", "*","             ","*"),
            String.join("", "*","   TO JAVA   ","*"),
            String.join("", "*","*","*","*","*","*","*","*","*","*","*","*","*","*","*")
        };

        for(String line : banner) {
            System.out.println(line);
        }
    }
}