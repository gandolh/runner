import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class semn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class semn extends Obstacole
{
    /**
     * Act - do whatever the semn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(getX()>=1125)setLocation(getX()-2,getY());
    }
}
