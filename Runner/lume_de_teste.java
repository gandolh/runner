import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lume_de_teste here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lume_de_teste extends World
{

    /**
     * Constructor for objects of class lume_de_teste.
     * 
     */
    public lume_de_teste()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 600, 1,false); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        standby standby = new standby();
        addObject(standby,99,82);
        podea podea = new podea();
        addObject(podea,603,554);
        
    }
}
