import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Solution{

    private static List<String> split(String s){
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }
 

    private static List<Integer> twoSum(List<Integer> a, int target){
        var res = new ArrayList<Integer>();
        var l = 0;
        var h = a.size() - 1;
        while( l < h ){
            var sum = a.get(l) + a.get(h);
            if( sum < target ){
                l++;
            } else if( sum > target ){
                h--;
            } else{
                res.add(l+1);
                res.add(h+1);
                return res;
            }
        }
        return res;
    }

    public static void main(String ...s){
        try(Scanner scan = new Scanner(System.in)){
            System.out.println("Enter the elements : ");
            List<Integer> list = split(scan.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
            System.out.println("Enter the target : ");
            int target = Integer.parseInt(scan.nextLine());
            System.out.println("Result : "+twoSum(list, target));
        }
    }
}