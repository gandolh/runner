import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rampa17 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rampa17 extends rampe
{
    int contorGenerareButoi;
    public rampa17(){
        contorGenerareButoi=getRandomNumber(1,6);
       
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
        if(contorGenerareButoi==1){
            getWorld().addObject(new butoi(),getX()-86,getY()-55);
            getWorld().addObject(new butoi(),getX()+86,getY()-55);
            contorGenerareButoi=0;
        }
    }     
}
