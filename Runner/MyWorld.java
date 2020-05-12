import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    //Special thanks for the background to:OpenGameArt.org
    public MyWorld()
    {   
        super(1200,600, 1,false);  
        intro intro = new intro();
        Greenfoot.setWorld(intro);

        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {   
        standby standby = new standby();
        addObject(standby,77,96);
        podea podea = new podea();
        addObject(podea,600,563);
        rampe rampe=new rampe();
        addObject(rampe,1200,9000);
        score_counter score_counter = new score_counter();
        addObject(score_counter,63,13);
        rampa05 rampa05=new rampa05();
        rampa10 rampa10=new rampa10();
        rampa15 rampa15=new rampa15();
        rampa17 rampa17=new rampa17();
        rampa20 rampa20=new rampa20();
        rampeManager rampeManager =new rampeManager();
        addObject(rampeManager,9000,9000);
        
    }
}
