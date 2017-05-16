import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class MyWorld extends World
{
    private Guy player;
    private Laser shot;
    private Enemy[] ens = new Enemy[10];
    public MyWorld()
    {
        super(800, 420, 1);
        shot = new Laser();
        player = new Guy(shot);
        ens[0] = new Wizard();
        addObject(player,44,380);
        addObject(ens[0], 800,200);
    }
    
    public void act()
    {
        
    }
    
    public Guy getPlayer()
    {
        return(player);
    }
}