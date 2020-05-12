import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class runaVrajitor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class runaVrajitor extends magie
{
    /**
     * Act - do whatever the runaVrajitor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void deplasare(){
    setLocation(getX()-2,getY());
    }
    
    public void act() 
    {
        deplasare();
        if(getX()<=0)getWorld().removeObject(this);
    }    
}
