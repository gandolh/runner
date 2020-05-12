import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScorFinalAfisat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScorFinalAfisat extends Actor
{
     public void display(int score){
        setImage(new GreenfootImage("Your Score : " + score, 36, Color.BLUE,null)); 
    }
    public  ScorFinalAfisat(int score){
        display(score);
    }
    public void act() 
    {
        
    }    
}
