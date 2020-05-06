package com.redi.streaming;

import java.time.*;
import java.util.*;

public class Album {
    private final String title;
    private final Year year;
    private final ArrayList<Track>tracklists;

    public Album(String title, Year year, ArrayList<Track> tracklists) {
        this.title = title;
        this.year = year;
        this.tracklists = tracklists;
    }

    public String getTitle() {
        return title;
    }

    public Year getYear() {
        return year;
    }

    public ArrayList<Track> getTracklists() {
        return tracklists;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return Objects.equals(title, album.title) &&
                Objects.equals(year, album.year) &&
                Objects.equals(tracklists, album.tracklists);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, year, tracklists);
    }
}
