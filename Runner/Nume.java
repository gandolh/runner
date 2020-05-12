import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nume here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nume extends Actor
{
    int nr=0;
    public void act() 
    {
       nr++;
       if(nr==150)Greenfoot.setWorld(new GameOverWorld(5000));
    }    
}
