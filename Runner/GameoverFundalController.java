import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameoverFundalController here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameoverFundalController extends Actor
{
    /**
     * Act - do whatever the GameoverFundalController wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int nr=0;
    public void act() 
    {
        schimbareFundal();
        nr++;
    }  
    void schimbareFundal(){
    if(nr==40)getWorld().setBackground("animatieFinal/1.png");
    else if(nr==80)getWorld().setBackground("animatieFinal/2.png");
    else if(nr==120)getWorld().setBackground("animatieFinal/3.png");
    else if(nr==160)getWorld().setBackground("animatieFinal/4.png");
    else if(nr==200)getWorld().setBackground("animatieFinal/5.png");
    else if(nr==240)getWorld().setBackground("animatieFinal/6.png");
    else if(nr==280){getWorld().setBackground("animatieFinal/7.png");nr=-1;}
    }
}
