
public class Grid
{
    private Location[][] grid;

    // Constants for number of rows and columns.
    public static final int NUM_ROWS = 10;
    public static final int NUM_COLS = 10;
    
    public Grid()
    {
        //make a 2D array Location object with 10 rows, and 10 columns
        grid = new Location[NUM_ROWS][NUM_COLS];
    }
    
    public void markHit(int row, int col)
    {
        grid[row][col].markHit();
    }
    
    public void markMiss(int row, int col)
    {
         grid[row][col].markMiss();
    }
    
    public void setStatus(int row, int col, int status)
    {
        grid[row][col].setStatus(status);
    }
    
    public int getStatus(int row, int col)
    {
        return grid[row][col].getStatus();
    }
    
    public boolean alreadyGuessed(int row, int col)
    {
        return grid[row][col].isUnguessed();
    }
    
    
    public boolean hasShip(int row, int col)
    {
    	return grid[row][col].hasShip();   	
    }
     
    
    public Location get(int row, int col)
    {
        return grid[row][col];
    }
    
    //return the number of rows in the grid
    public int numRows(){
        return grid.length; // row
    }

    // Return the number of columns in the grid
    public int numCols(){
        return grid[0].length; // col
        }
    
}
