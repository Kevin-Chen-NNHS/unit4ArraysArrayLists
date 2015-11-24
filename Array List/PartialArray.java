

/**
 * Write a description of class newArray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PartialArray
{
    /** description of instance variable x (add comment for each instance variable) */
    private int[] values;
    private int currentSize;
    /**
     * Default constructor for objects of class newArray
     */
    public PartialArray()
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
        if (currentSize < this.values.length)
        {
            if ((this.currentSize) == this.values.length)
            {
                this.growArray();
            }
            currentSize++;
            for( int i = currentSize - 1; i > pos; i--)
            {
                this.values[1] = this.values[i-1];
            }
            
            this.values[pos] = value;
            
            
        }
    }    
    public void swap (int posA, int posB)
    {
        int temp = this.values[ posA ];
        this.values[ posA ] = this.values[ posB ];
        this.values[ posB ] = temp;
    }
    public void growArray()
    {
        int[] newArray = new int [ this.currentSize * 2 ];
        
        for (int i = 0; i < this.currentSize;i++)
        {
            newArray[ i ] = this.values[ i ];
        }
    }   
}