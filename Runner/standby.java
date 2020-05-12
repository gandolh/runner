import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class standby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class standby extends Actor
{
    /**
     * Act - do whatever the standby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
     private static int gravitatie=1,gravitatie2=6;
     private int velocitate,movementSpeed=3,velocitate2;
     int y_podea,y_rampe,x_rampe;
     int cadere_prin_platforma=0;
     int intermediar=700;
     
     public standby(){
        velocitate=0;
        velocitate2=0;
        }
    public void pregatire(){
     y_podea= ((podea) getWorld().getObjects(podea.class).get(0)).getY()-87;
     int n,minn=700,yr=0,arie_acoperire;
     n=getWorld().getObjects(rampe.class).size();
     y_rampe=0;
     for(int i=0;i<n;i++){       
     x_rampe=((rampe) getWorld().getObjects(rampe.class).get(i)).getX();
     arie_acoperire=((rampe) getWorld().getObjects(rampe.class).get(i)).getImage().getWidth();
     if(getX()>x_rampe-arie_acoperire && getX()<x_rampe+arie_acoperire)
     yr=((rampe) getWorld().getObjects(rampe.class).get(i)).getY()-60;
     if(Math.abs(getY()-yr)<minn){minn=Math.abs(getY()-yr);y_rampe=yr;}
    }
    }
    public void act() 
    {   
        pregatire();
        boolean p=(isTouching(rampe.class) || isTouching(podea.class));
        cadere(p);
        if(Greenfoot.isKeyDown("W") || Greenfoot.isKeyDown("up"))
         if(p)sari();
        if(Greenfoot.isKeyDown("D") || Greenfoot.isKeyDown("right")){
            if(isTouching(rampaRapida.class))movementSpeed=12;  
            else if(isTouching(rampaLenta.class))movementSpeed=1;
            else movementSpeed=3;
            setLocation(getX()+movementSpeed,getY());    
        }
        if(Greenfoot.isKeyDown("A") || Greenfoot.isKeyDown("left")){
            if(isTouching(rampaRapida.class))movementSpeed=12;  
            else if(isTouching(rampaLenta.class))movementSpeed=1;
            else movementSpeed=3;
            setLocation(getX()-movementSpeed,getY());
        }
        if(Greenfoot.isKeyDown("S") || Greenfoot.isKeyDown("down"))
            {cadere_prin_platforma=1;intermediar=getY();}
         cadere_libera();
        if(getY()>getWorld().getWidth()){
            Greenfoot.setWorld(new GameOverWorld(score_counter.score));
        }
        if(isTouching(Obstacole.class)){
            if(isTouching(tepi.class) && tepi.activat==1){
                setRotation(-90);
                Greenfoot.delay(65);
                Greenfoot.setWorld(new GameOverWorld(score_counter.score));
            }
            else if(isTouching(butoi.class) || isTouching(runaVrajitor.class)){
                if(Greenfoot.isKeyDown("D") || Greenfoot.isKeyDown("right"))setLocation(getX()-5,getY());
                else setLocation(getX()-2,getY());
                velocitate=0;
                if(Greenfoot.isKeyDown("W")|| Greenfoot.isKeyDown("up"))sari();
            }
            else if(isTouching(bila.class)){
                setRotation(-90);
                setLocation(getX(),getY()+50);
                Greenfoot.delay(65); 
                Greenfoot.setWorld(new GameOverWorld(score_counter.score));
            }
        }
    } 
    void cadere(boolean p){
       
      if(isTouching(podea.class))setLocation(getX(),y_podea);
      if(isTouching(rampe.class))
        if(y_rampe!=0)
            setLocation(getX(),y_rampe);
       setLocation(getX(),getY()+velocitate);
       if(p)velocitate=0;
       else velocitate+=gravitatie;
       
    }
    void sari(){
    velocitate=-20;
    }
    void cadere_libera(){
     if(cadere_prin_platforma==1){
        setLocation(getX(),getY()+velocitate2);
        velocitate2+=gravitatie2;
    }
    if(intermediar+120<getY()){cadere_prin_platforma=0;velocitate2=0;}
}
}
