package it.unibo.encapsulation;

import java.util.Arrays;

public class Smartlamp{

    private static final int LEVELS = 3;
    private static final int DELTA = 1;
    private static final String[] COLOR = {"white","red","green", "blue"};
    
    private int intensity;
    private boolean lampOn;
    private String color;

    public Smartlamp(){
        this.lampOn = false;
        this.intensity = 0;
        this.color = COLOR[0];
    }

    public void switchOn(){
        this.lampOn = true;
    }

    public void SwitchOff(){
        this.lampOn = false;
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
            this.color = col;
        }
        else this.color = COLOR[0];
    }

}