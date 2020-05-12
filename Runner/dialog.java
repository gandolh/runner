import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dialog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dialog extends test
{
     int numarReplici=0,startDialog=0,cooldown=5;
    public void act() 
    {
        cooldown++;
       if(((test) getWorld().getObjects(test.class).get(0)).nr>=150 && startDialog==0)
       setLocation(1400,1400);
        if(((test) getWorld().getObjects(test.class).get(0)).getX()==936)
        startDialog=1;
       if(startDialog==1){
         if(Greenfoot.isKeyDown("space") && cooldown>10){numarReplici++;
            cooldown=0;}
        if(numarReplici==0){
            
            setImage("animatieEnding/Dialog1.PNG");
            setLocation(1027,341);
        }
        else if(numarReplici==1){
            
         setImage("animatieEnding/Dialog2.PNG");
         setLocation(936,341);
        }
        else if(numarReplici==2){
         
        setImage("animatieEnding/Dialog3.PNG");
        
        }
        else if(numarReplici==3){
           setImage("animatieEnding/Dialog4.PNG");
           setLocation(1027,341);
        }
        else if(numarReplici==4){
           setImage("animatieEnding/Dialog5.PNG");
           setLocation(1027,341);
        }
        else if(numarReplici==5){
           setImage("animatieEnding/Dialog6.PNG");
           setLocation(1027,341);
        }
        else if(numarReplici==6);//imaginea cu coroana;
        
        else if(numarReplici==7){
           setImage("animatieEnding/Dialog7.png");
           setLocation(936,341);
        }
        else if(numarReplici==8){
           setImage("animatieEnding/Dialog8.png");
           setLocation(1027,341);
        }
        else if(numarReplici==9)Greenfoot.setWorld(new ToBecContinued());
        }
    }    
}
