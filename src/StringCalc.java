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

                List<String> stringList = Arrays.asList(numbers.split(","));

                int sum =0;

                for(String num: stringList){
                    int number = Integer.parseInt(num);

                    sum += number;
                }


                return sum;

            }catch (Exception e){
                throw new Exception("too many arguments");
            }

        }

    }
}
