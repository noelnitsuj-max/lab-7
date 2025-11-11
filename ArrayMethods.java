import java.util.Arrays;
/**
 * This class creates arrays and uses methods to change them.
 *
 * @author Justin Leon
 * @version v1.0
 * @since 11/10/2025
 */
public class ArrayMethods
{
    
    private int[] myArray;

    /**
     * Constructor for objects of class ArrayMethods
     */
    public ArrayMethods()
    {
        myArray = new int[]{7,8,8,3,4,9,8,7};
        
    }

    /**
     * This methods counts the number of values in the array.
     * @return total The number of values in the array.
     */
    public int count()
    {
        int total = myArray.length;
        return total;
    }
    /**
     * This method returns the sum of the values in the array.
     * @return sum The sum of all the values in the array.
     */
    public int sum()
    {
        int amount = count();
        int sum = 0;
        for(int x = 0; x < amount; x ++){
            sum += myArray[x];
        }
        return sum;
    }
    /**
     * This method returns the average value of all the numbers in the array.
     * @return average The average value of all the numbers in the array.
     */
    public double average()
    {
        int sum = sum();
        int amount = count();
        double average = (double)sum/(double)amount;
        return average;
    }
    
    /**
     * This method returns the value of the largest number.
     * @return max The value of the largest number.
     */
    public int findMax()
    {
        int max = 0;
        int amount = count();
        for(int x = 0; x < amount; x ++){
            if(myArray[x] > max){
                max = myArray[x];
            }
        }
        return max;
    }
    /**
     * This method returns the index of the largest number.
     * @return index The index of the largest number.
     */
    public int findIndexOfMax()
    {
        int max = 0;
        int index = 0;
        int amount = count();
        for(int x = 0; x < amount; x ++){
            if(myArray[x] > max){
                max = myArray[x];
                index = x;
            }
        }
        return index;
    }
    
}
