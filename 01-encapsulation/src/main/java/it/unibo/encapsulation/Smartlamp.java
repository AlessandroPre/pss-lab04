package it.unibo.encapsulation;

import java.util.Arrays;

public class Smartlamp{

    private static final int LEVELS = 3;
    //private static final int DELTA = 1;
    private static final String[] COLOUR = {"white","red","green", "blue"};
    
    private int intensity;
    private boolean lampOn;
    private String colour;

    public Smartlamp(){
        this.lampOn = false;
        this.intensity = 0;
        this.colour = COLOUR[0];
    }

    public void switchOnOff(){
            this.lampOn = !this.lampOn;
    }

    private void checkIntensity(){
        if(this.intensity < 0){
            this.intensity = 0;
        }
        else if (this.intensity > LEVELS) {
            this.intensity = LEVELS;
        }
    }

    public void setIntensity(final int val){
        this.intensity = val;
        this.checkIntensity();
    }

    public void setColor(String col){
        if(Arrays.asList(COLOUR).contains(col)){
            this.colour = col;
        }
        else this.colour = COLOUR[0];
    }

    public void getStatus(){
        if(this.lampOn == true) System.out.println("The lamp is on");
        else System.out.println("The lamp is off");
    }

    public int getIntensity(){
        return this.intensity;
    }
    
    public String getColour(){
        return this.colour;
    }


}