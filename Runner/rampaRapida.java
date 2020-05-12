import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rampaRapida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rampaRapida extends rampe
{
    /**
     * Act - do whatever the rampaRapida wants to do. This method is called whenever
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
