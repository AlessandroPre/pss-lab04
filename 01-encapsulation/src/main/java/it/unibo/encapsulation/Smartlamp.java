package it.unibo.encapsulation;

import java.util.Arrays;

public class Smartlamp{

    private static final int LEVELS = 3;
    private static final int DELTA = 1;
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
        if(this.lampOn){
            this.lampOn = !this.lampOn;
        }
    }

    private void checkIntensity(){
        if(this.intensity < 0){
            intensity = 0;
        }
        else if (this.intensity > LEVELS) {
            this.intensity = LEVELS;
        }
    }

    public void setIntensity(final int val){
        this.intensity = val-DELTA;
        this.checkIntensity();
    }

    public void setColor(String col){
        if(Arrays.asList(COLOR).contains(col)){
            this.colour = col;
        }
        else this.colour = COLOUR[0];
    }

    public void printLampInfo(){
        System.out.println("Status: "+ lampOn);
        System.out.println("Intensity: "+ intensity);
        System.out.println("Colour: "+ colour);
    }
    public static void main(final String[] args) {
        Smartlamp lamp = new Smartlamp();
        lamp.setColor("Blue");
        lamp.setIntensity(2);
    }
}