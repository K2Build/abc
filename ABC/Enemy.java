import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

abstract class Enemy extends Actor
{
    private int speed;
    private boolean up = Math.random() > .5;
    
    public Enemy(int sp)
    {
        speed = sp;
    }
    
    public void act() 
    {
        if(up)
        {
            moveUp();
        }
        if(!up)
        {
            moveDown();
        }
        if(getY() <= 5 && up)
        {
            up = false;
        }
        if(getY() >= 415 && !up)
        {
            up = true;
        }
        if(isTouching(Laser.class))
        {
            getWorld().removeObject(this);
        }
    }
    
    public abstract void moveUp();
    
    public abstract void moveDown();
    
    public int getSpeed()
    {
        return(speed);
    }
}