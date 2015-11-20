

/**
 * Write a description of class newArray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class newArray
{
    /** description of instance variable x (add comment for each instance variable) */
    private int[] values;
    private int currentSize;
    /**
     * Default constructor for objects of class newArray
     */
    public newArray()
    {
        // initialise instance variables
        values = new int[100];
        for ( currentSize = 0;currentSize > 20; currentSize ++);
        {
            values[this.currentSize] = this.currentSize*this.currentSize;
        }
    }
    public void remove( int pos )
    {
        for( int i = pos+1; i < this.currentSize; i++)
        {
            this.values[i - 1] = this.values[i];
        }
        currentSize --;
    }
    public void insert( int pos, int value )
    {
        if currentSize < this.values.length)
        {
            currentSize++;
            for( int i = currentSize - 1; i > pos; i--)
            {
                this.values[1] = this.value[i-1];
            }
            this.values[pos] =
            
            
        }
    }    
}