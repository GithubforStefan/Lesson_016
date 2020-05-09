package com.redi.streaming;


import java.time.Duration;
import java.time.Year;
import java.util.ArrayList;
import java.util.UUID;



//this is only for testing some concepts:
public class Main {
    public static void main(String[] args) {

        StreamingService reDiStreaming = new StreamingService();
        System.out.println("This is radio " + reDiStreaming.name);
        Artist caruso = new Artist(UUID.randomUUID(),"Enrico Caruso");
        Artist reDiChoir = new Artist(UUID.randomUUID(),"ReDi Choir");


        Track oSoleMio = new Track(UUID.randomUUID(),"O sole mio", Duration.ofSeconds(350),caruso, Year.of(1904));
        oSoleMio.getTrack();

        ArrayList<Track> songsPerUser = null;
        Playlist newPlaylist = new Playlist(UUID.randomUUID(),"New Playlist",  songsPerUser);
        newPlaylist.setSongsPerUser();



        Track vaPensiero = new Track(UUID.randomUUID(),"Va, pensiero", Duration.ofSeconds(600),reDiChoir, Year.of(2020));
        vaPensiero.getTrack();
        newPlaylist.setSongsPerUser();
        ArrayList<Playlist> playListUser2 = new ArrayList<>();
        System.out.println(newPlaylist);
        User stefan = new User(UUID.randomUUID(), "Stefan");


        StreamingService player = new StreamingService();
        StreamingService.play(oSoleMio,stefan);
        StreamingService.play(vaPensiero,stefan);











    }


}
