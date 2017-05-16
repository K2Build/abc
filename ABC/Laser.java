import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Laser extends Actor
{
    private int speed = 10;
    /**
     * Act - do whatever the Laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(!isAtEdge())
        {
            setLocation(getX()+speed,getY());
        }
        else
        {
            getWorld().removeObject(this);
        }
    }
    
    public void shoot()
    {

    }
}