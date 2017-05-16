import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wizard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wizard extends Enemy
{
    public Wizard()
    {
        super(2);
    }
    
    public void act() 
    {
        super.act();
    }
    
    public void moveUp()
    {
        setLocation(getX(),getY()-getSpeed());        
    }
    
    public void moveDown()
    {
        setLocation(getX(),getY()+getSpeed());
    }
}