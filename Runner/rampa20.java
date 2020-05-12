import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rampa20 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rampa20 extends rampe
{
    int contorGenerareVrajitor;
    public rampa20(){
        contorGenerareVrajitor=getRandomNumber(1,6);
        }
    public int getRandomNumber(int start,int end){
        int normal=Greenfoot.getRandomNumber(end-start+1);
        return start+normal;
    }
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
        if(contorGenerareVrajitor==1){
            getWorld().addObject(new vrajitor(),getX()+150,getY()-64);
            getWorld().addObject(new runaVrajitor(),getX()-150,getY()-55);
            contorGenerareVrajitor=0;
        }
    }    
}
