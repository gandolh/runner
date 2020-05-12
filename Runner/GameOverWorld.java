import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOverWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverWorld extends World
{

    /**
     * Constructor for objects of class GameOverWorld.
     * 
     */
   
    
    public GameOverWorld(int score)
    {    
       super(1200, 600, 1);
       prepare();
       addObject(new ScorFinalAfisat(score),828,467);
    }
    public void prepare(){
    GameoverFundalController GameoverFundalController=new GameoverFundalController();
    addObject(GameoverFundalController,2000,2000);
    }
    
}
    