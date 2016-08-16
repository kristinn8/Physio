package com.mycompany.sport.Domain;

/**
 * Created by KristinnH on 16.8.2016.
 */
public class Activity {
    int rating;
    int lengthMinutes;
    ActivityType activityType;
    ActivityWith activityWith;



    public enum ActivityType{
        practice,match
    }

    public enum ActivityWith{
        team,individual,nationalteam
    }


}
