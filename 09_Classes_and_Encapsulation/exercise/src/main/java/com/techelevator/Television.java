package com.techelevator;

public class Television {
    public boolean isOn;
    private int currentChannel = 3;
    private int currentVolume = 2;

    public int getCurrentChannel() {
        return currentChannel;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }
    private boolean getisOn() {
        if (isOn) {
            return true;
        }
        return false;
    }

    public boolean isOn(){
        if (isOn) {
            return true;
        }
        return false;
    }
    public void turnOff(){
        if (this.isOn){
            this.isOn = false;
        }
    }
    public void turnOn(){
        if (!this.isOn) {
            this.isOn = true;
            this.currentVolume = 2;
            this.currentChannel = 3;
        }
    }
    public void changeChannel(int newChannel){
        if (this.isOn) {
            if (newChannel >= 3 && newChannel <= 18){
                this.currentChannel = newChannel;}
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
        if(isOn){
        this.currentVolume = currentVolume + 1;
        if(currentVolume>10){
        currentVolume=10;
        }
        }
    }
    public void lowerVolume(){
        if(isOn){
        this.currentVolume = currentVolume - 1;
        if(currentVolume <0){
        currentVolume=0;}
        }
    }
}
