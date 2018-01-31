import java.util.*;
/**
 * Created by Mia Kimmich Mitchell on 1/31/2018.
 */
public class StringCalc {

    public static int add(String numbers) throws Exception {

        if(numbers.equals("") ){
            return 0;
        }else{

            try {
                int number = Integer.parseInt(numbers);

                return number;

            }catch (Exception e){
                throw new Exception("too many arguments");
            }

        }

    }
}
