import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class endingWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class endingWorld extends World
{

    /**
     * Constructor for objects of class endingWorld.
     * 
     */
    public endingWorld()
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

        test test = new test();
        addObject(test,76,441);
        vrajitorCopie vrajitorCopie = new vrajitorCopie();
        addObject(vrajitorCopie,1029,433);

        dialog dialog = new dialog();
        addObject(dialog,1027,341);
    }
}
