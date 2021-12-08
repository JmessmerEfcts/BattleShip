public class Location
{
    public static final int UNGUESSED = 0;
    public static final int HIT = 1;
    public static final int MISSED = 2;
    
    private int status = 0;
    private boolean hasShip;
    
    public Location()
    {
        status = 0;
        hasShip = false;
    }
    
    public boolean checkHit()
    {
        if(status == HIT){
            return true;
        }else
            return false;
    }
    
    public boolean checkMiss()
    {
        if(status == MISSED){
            return true;
        }else
            return false;
    }
    
    
    public boolean isUnguessed()
    {
        if(status != HIT && status != MISSED) {
            status = UNGUESSED;
        }
        	return true;
    }
    
    public void markHit()
    {
      status = HIT;
    }
    
    public void markMiss()
    {
        status = MISSED;
    }
    
    public boolean hasShip()
    {
       return hasShip;
    }
    
    public void setShip(boolean myShip)
    {
        hasShip = myShip;
    }
    
    public void setStatus(int status)
    {
        this.status = status;
    }  
    
    public int getStatus()
    {
        return status;
    }
    
}