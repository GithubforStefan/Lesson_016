package com.redi.streaming;

import java.util.*;

public class Playlist {
    private final UUID id;
    private final String name;
    private final ArrayList<Track> tracklist;

    public Playlist(UUID id, String name, ArrayList<Track> tracklist) {
        this.id = id;
        this.name = name;
        this.tracklist = tracklist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Playlist playlist = (Playlist) o;
        return Objects.equals(id, playlist.id) &&
                Objects.equals(name, playlist.name) &&
                Objects.equals(tracklist, playlist.tracklist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, tracklist);
    }
}
