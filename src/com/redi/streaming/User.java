package com.redi.streaming;

import java.util.*;

public class User {
    private final UUID id;
    private final String name;
    private final ArrayList<Playlist>playlists;

    public User(UUID id, String name, ArrayList<Playlist> playlists) {
        this.id = id;
        this.name = name;
        this.playlists = playlists;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(name, user.name) &&
                Objects.equals(playlists, user.playlists);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, playlists);
    }
}
