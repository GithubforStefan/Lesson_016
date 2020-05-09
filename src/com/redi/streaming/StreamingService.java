package com.redi.streaming;


import java.util.*;

public class StreamingService {

    public String name = "redi-streaming";




    public ArrayList<Track> tracks = new ArrayList<>();
    static int numberOfStreamsPlayed = 0;

    public static void play(Track track, User user){
        numberOfStreamsPlayed ++;
        System.out.println(numberOfStreamsPlayed);

    }


    public String getName() {
        return name;
    }




}
