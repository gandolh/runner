import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class butoi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class butoi extends Obstacole
{
    /**
     * Act - do whatever the butoi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void deplasare(){
        setLocation(getX()-2,getY());
        
    }
    public void eliminare(){
        if(getX()<0) getWorld().removeObject(this);
    }
    public void act() 
    {
       deplasare();
       eliminare();
    }    
}
