import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class podea1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class podea1 extends podea
{
    /**
     * Act - do whatever the podea1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(getX()>=600)setLocation(getX()-2,getY());
    }    
}
