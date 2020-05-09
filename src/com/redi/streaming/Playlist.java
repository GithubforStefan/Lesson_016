package com.redi.streaming;

import java.util.*;

public class Playlist {
    private final UUID id;
    private final String name;
    public ArrayList<Track> songsPerUser;



    public Playlist(UUID id, String name,ArrayList<Track> songsPerUser) {
        this.id = id;
        this.name = name;
        this.songsPerUser = songsPerUser;




    }




    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Track> getsongsPerUser() {
        return songsPerUser;
    }

    public void setSongsPerUser() {
        this.songsPerUser = songsPerUser;
    }

    public Playlist(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Playlist playlist = (Playlist) o;
        return Objects.equals(id, playlist.id) &&
                Objects.equals(name, playlist.name) &&
                Objects.equals(songsPerUser, playlist.songsPerUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, songsPerUser);
    }
}
