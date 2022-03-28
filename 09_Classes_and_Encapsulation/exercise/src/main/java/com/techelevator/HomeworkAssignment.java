package com.techelevator;

public class HomeworkAssignment {

private int earnedMarks;
private int possibleMarks;
private String submitterName;
private String letterGrade;

public int getPossibleMarks(){
    return possibleMarks;
    }
public String getSubmitterName(){
    return submitterName;
}
public int getEarnedMarks() {
    return earnedMarks;
    }
public void setEarnedMarks(int earnedMarks) {
    this.earnedMarks = earnedMarks;
    }

public String getLetterGrade(){

double theGrade = (double) earnedMarks/possibleMarks;

if (theGrade >= .90){ letterGrade = "A";}
else if (theGrade >= .80){ letterGrade = "B";}
else if (theGrade >= .70){ letterGrade = "C";}
else if (theGrade >= .60){ letterGrade = "D";}
else if (theGrade < .60){letterGrade = "F";}

return letterGrade;
}

public HomeworkAssignment(int possibleMarks, String submitterName){
    this.possibleMarks = possibleMarks;
    this.submitterName = submitterName;
}
}