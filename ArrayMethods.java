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
    /**
     * This method accesses the instance field myArray
     * @return myArray The instance field array.
     */
    public int[] getArray(){
        return myArray;
    }
    /**
     * This method creates a copy of myArray
     * @return copy A copy of myArray.
     */
    public int[] copyArray(){
        int[] copy = Arrays.copyOf(myArray, myArray.length);
        return copy;
    }
    /**
     * Returns the index of the rightmost value that is equal to the key.
     * @return index the index of the value.
     * @param key The value chosen.
     */
    public int findLast(int key){
        int index = 0;
        int amount = count();
        for(int x = amount - 1; x >= 0; x --){
            if(myArray[x] == key){
                index = x;
                return index;
            }
        }
        index = -1;
        return index;
    }
     /**
     * Returns the index of all values that equal the key.
     * @return indexes An array with all the indexes of the values equal to the key.
     * @param key The value chosen.
     */
    public int[] findAll(int key){
        int amount = count();
        int count = 0;
        for(int x = 0; x <amount; x ++){
            if(myArray[x] == key){
                count ++;
            }
        }
        int[] indexes = new int[count];
        count = 0;
        for(int x = 0; x <amount; x ++){
            if(myArray[x] == key){
                indexes[count] = x;
                count ++;
            }
        }
        return indexes;
    }
    /**
     * This method returns an array with reversed values from the inputted array.
     * @return retArray The reversed array.
     * @param inArray The array that is being changed.
     */
    public int[] reverseArray(int[] inArray){
        int index = 0;
        int[] retArray = new int[inArray.length];
        int amount = inArray.length;
        for(int x = 0; x < amount; x ++){
            retArray[x] = inArray[amount - x - 1];
        }
        return retArray;
    }
    /**
    prints an int array, nicely formatted
    @param inArray int array to print
    */
    public void print(int[ ] inArray)
    {
    System.out.print("{");
    int i;
    // print elements before the last, separated by commas
    for (i = 0; i < inArray.length - 1; i++)
    System.out.print(inArray[i] + ", ");
    // print last element. Careful here to handle length 0
    if (inArray.length > 0)
    System.out.print(inArray[i]);
    System.out.println("}");
}
    
    
}
