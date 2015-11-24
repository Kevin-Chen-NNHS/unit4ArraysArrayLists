

public class disArray
{
    /** description of instance variable x (add comment for each instance variable) */
    private int[] values;

    /**
     * Default constructor for objects of class disArray
     */
    public void disArray()
    {
        
        double[] values = {8, 4, 5, 21, 7, 9, 18, 2, 100};
        System.out.println((values.length));
    }

    public void printfirst()
    {
        System.out.println(values[0]);
        
    }
    public void printlast()
    {
        System.out.println(values[values.length]);
    }
    public void printgiven()
    {
        System.out.println(values[values.length-1]);
    }
}
