package com.redi.streaming;

import java.time.*;
import java.util.*;

public class Album {
    private final String title;
    private final Year year;

    public static ArrayList<Track>songs;


    public Album(String title, Year year, ArrayList<Track> tracklist) {
        this.title = title;
        this.year = year;
        this.songs = tracklist;



    }


    Album bestOfItalianOpera = new Album("Best of Italian Opera", Year.of(2019), songs );

    public String getTitle() {
        return title;
    }

    public Year getYear() {
        return year;
    }

    public ArrayList<Track> getTracklist() {

        return songs;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return Objects.equals(title, album.title) &&
                Objects.equals(year, album.year) &&
                Objects.equals(songs, album.songs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, year, songs);
    }


}
