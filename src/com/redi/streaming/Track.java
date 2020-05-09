package com.redi.streaming;

import java.time.*;
import java.util.*;

public class Track {
    private final UUID id;
    private final String name;
    private final Duration duration;
    private final String artist;
    private final Year year;
    private Artist ;


    public Track(UUID id, String name, Duration duration, String artist, Year year) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.artist = artist;
        this.year = year;

    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Track track = (Track) o;
        return Objects.equals(id, track.id) &&
                Objects.equals(name, track.name) &&
                Objects.equals(duration, track.duration) &&
                Objects.equals(artist, track.artist) &&
                Objects.equals(year, track.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, duration, artist, year);
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Duration getDuration() {
        return duration;
    }

    public String getArtist() {

        return new Artist(UUID.randomUUID(),"name");
    }

    public Year getYear() {
        return year;
    }
    public void getTrack(){
        System.out.println("Track ID: " + this.getId());
        System.out.println("Title : " + this.getName());
        System.out.println("Artist: " + this.getArtist());
        System.out.println("Duration in minutes: " + this.getDuration().toMinutes());
        System.out.println("Year :" + this.getYear());
        System.out.println("HashCode : " + this.hashCode());
        System.out.println("-----------------------");
        return ;
    }

}
