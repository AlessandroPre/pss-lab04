package it.unibo.encapsulation;

public class Smartlamp{

    private static final int LEVELS = 3;
    private static final int DELTA = 1;
    private static final String[] COLOR = {"white","red","green", "blue"};
    
    private int intensity;
    private boolean LampOn;

    public Smartlamp(){
        this.LampOn = false;
        this.intensity = 0;
    }

    public void switchOn(){
        this.LampOn = true;
    }

    public void SwitchOff(){
        this.LampOn = false;
    }

    private void checkIntensity(){
        
    }

    public void setIntensity(final int val){
        this.intensity = val-DELTA;
    }

}