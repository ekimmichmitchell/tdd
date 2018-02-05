import java.util.*;
/**
 * Created by Mia Kimmich Mitchell on 1/31/2018.
 */
public class StringCalc {

    public static int add(String numbers) throws Exception {

        if(numbers.equals("") ){
            return 0;
    // adding comment to Line 11 on string calc - DMF
        }
        else{

            List<String> stringList = Arrays.asList(numbers.split(","));

            int sum =0;
            int size = stringList.size();
            int count = 0;

            for(String num: stringList){
                if(Character.isDigit(num.charAt(count))) {
                    int number = Integer.parseInt(num);
                    sum += number;
                }
            }
            return sum;
        }
    }
}
