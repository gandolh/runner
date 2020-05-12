import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bila here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bila extends magie
{
    /**
     * Act - do whatever the bila wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void deplasare(){
    setLocation(getX()-12,getY());
    }
    public void stergere(){
       getWorld().removeObject(this);
    }
    public void act() 
    {
       
        deplasare();
        if(getX()<=0 || isTouching(runaVrajitor.class))stergere();
        
    }    
}
