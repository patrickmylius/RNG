import org.w3c.dom.ls.LSOutput;

public class FejlTest {

    static String stringAdd(String x , String y) {

return x+y;
    }

    public static void main(String[] args) {
        String x = "Anders";
        String y = "Er lærer";
        String z = (x + y);

        System.out.println(stringAdd("Anders" , "er lærer"));
    }
}
