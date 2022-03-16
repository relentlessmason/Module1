package com.techelevator;

public class Television {
    private boolean isOn;
    private int currentChannel;
    private int currentVolume;
    private boolean isNew;

    public int getCurrentChannel() {
        return currentChannel;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }
    public boolean getisOn(){
        return isOn;
    }
    public Television(){
        if (isNew) {
            isOn = false;
            currentChannel = 3;
            currentVolume=2;
        }
    }
    public void turnOff(boolean isOn){
        this.isOn = false;
    }
    public void turnOn(boolean isOn){
        this.isOn = true;
        this.currentVolume = 2;
        this.currentChannel = 3;
    }
    public void changeChannel(int newChannel){
        if (isOn) {
            if (newChannel >= 3 && newChannel <= 18){
                this.currentChannel = newChannel;
            }
        }
    }
    public void channelUp(){
        if (isOn){
            this.currentChannel= currentChannel + 1;
            if (currentChannel >18){
                this.currentChannel = 3;
            }
        }
    }
    public void channelDown(){
        if(isOn){
            this.currentChannel = currentChannel - 1;
            if (currentChannel<3){
                this.currentChannel = 18;
            }
        }
    }
    public void raiseVolume(){
        this.currentVolume = currentVolume + 1;
    }
    public void lowerVolume(){
        this.currentVolume = currentVolume - 1;
    }
}
