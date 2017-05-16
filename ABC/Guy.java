import greenfoot.*;
//78 tall 86 wide
/**
 * Write a description of class Guy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Guy extends Actor
{
    private Laser shot;
    private int speed = 1;
    public Guy(Laser x)
    {
        shot = x;
    }
    
    /**
     * Act - do whatever the Guy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("SPACE"))
        {
            getWorld().addObject(shot,getX()+26,getY()+4);
        }

        if(Greenfoot.isKeyDown("W"))
        {
            up();
        }
        
        if(Greenfoot.isKeyDown("D"))
        {
            right();
        }
        
        if(Greenfoot.isKeyDown("S"))
        {
            down();
        }
        
        if(Greenfoot.isKeyDown("A"))
        {
            left();
        }
    }
    
    public void up()
    {
        setLocation(getX(), getY()-speed);
    }
    
    public void right()
    {
        setLocation(getX()+speed, getY());
    }
    
    public void left()
    {
        setLocation(getX()-speed, getY());
    }
    
    public void down()
    {
        setLocation(getX(), getY()+speed);
    }
    
    public Laser getShot()
    {
        return(shot);
    }
}