import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tepi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tepi extends Obstacole
{
    private int nr;
    public static int activat;
    public tepi(){
    nr=0;activat=0;
    }
    public void deplasare(){
        setLocation(getX()-2,getY());
    }
    public void eliminare(){
        if(getX()<0) getWorld().removeObject(this);
    }
    public void activare(){
        if(activat==0){
        setImage("tepiactivi.png");
        activat=1;
        setLocation(getX(),getY()-20);
        }
        else {
        setImage("tepistandby.png");
        activat=0; 
        setLocation(getX(),getY()+20);
        }
    
    }
    public void act() 
    {
        nr++;
        if(nr==95){
            activare();
            nr=0;
        }
        deplasare();   
        eliminare();
    }    
}
