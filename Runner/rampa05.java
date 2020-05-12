import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rampa05 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rampa05 extends rampe
{
    /**
     * Act - do whatever the rampa05 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void deplasare(){
        setLocation(getX()-ms,getY());        
        }
     public void eliminare(){
        if(getX()<0)getWorld().removeObject(this);
        } 
    public void act() 
    {
       deplasare();
       eliminare();
    }    
}
