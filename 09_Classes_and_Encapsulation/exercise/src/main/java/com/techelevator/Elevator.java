package com.techelevator;

public class Elevator {
private int currentFloor;
private int numberOfFloors;
private boolean doorOpen;

    public int getCurrentFloor() {
        return currentFloor;
    }
    public int getNumberOfFloors() {
        return numberOfFloors;
    }
    public boolean isDoorOpen() {
        if (doorOpen){
            return true;
        }
        return false;
    }

    public Elevator(int numberOfLevels){
        currentFloor=1;
        this.numberOfFloors=numberOfLevels;
    }

    public void openDoor410(){
        if (!doorOpen){
            doorOpen=true;
        }
    }
    public void closeDoor(){
        if (doorOpen){
            doorOpen=false;
        }
    }
    public void goUp(int desiredFloor) {
        if (!doorOpen && desiredFloor <= numberOfFloors && desiredFloor > currentFloor) {
            this.currentFloor = desiredFloor;
        }
    }
    public void goDown(int desiredFloor) {
        if (!doorOpen && desiredFloor>=1 && desiredFloor < currentFloor) {
            this.currentFloor = desiredFloor;
        }
    }
}
