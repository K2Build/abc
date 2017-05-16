import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Blob extends Enemy
{
    public Blob()
    {
        super(1);
    }
    
    public void act() 
    {
        super.act();
    }
    
    public void moveUp()
    {
        setLocation(getX()-getSpeed(),getY()-getSpeed());        
    }
    
    public void moveDown()
    {
        setLocation(getX()-getSpeed(),getY()+getSpeed());
    }
}
