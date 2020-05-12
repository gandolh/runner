import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class principal extends Actor
{
    private int worldWidth;
    private int worldHeight;
    protected void addedToWorld(World world)
    {
        worldHeight= world.getHeight();
        worldWidth = world.getWidth();
        setLocation(worldWidth/2,worldHeight/2+10);
    }
    public void act() 
    {
        
    }    
}
