import java.io.IOException;
import java.text.ParseException;

public class Exceptions4 {
    public static void main(String[] args) {


        try {
            run();
        } catch (IOException e) { // можно мульти записать catch (IOException e | ParseException e){
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        // Можно сослаться на класс от которго все унаследованы catch (Exceptions e)




    }
    public static void run() throws IOException, ParseException, IllegalArgumentException {

    }
}
