import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class score_counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class score_counter extends Actor
{
    public score_counter(){
    score=0;
    }
    public void update(){
setImage(new GreenfootImage("Score : " + score, 24, Color.BLACK, null)); 
}
    public static int score=0,scoreEnding=5000;
    public int getScore(){
    return score;
    }
    public void act() 
    {
       score++;
       update();
       if(score==scoreEnding){
           getWorld().removeObjects(getWorld().getObjects(rampeManager.class));
           getWorld().addObject(new podea1(),1900,563);
           getWorld().addObject(new semn(),1900,455);
        }
       if(score>scoreEnding && ((standby) getWorld().getObjects(standby.class).get(0)).getX()>=1250)Greenfoot.setWorld(new endingWorld());
    }    
}
