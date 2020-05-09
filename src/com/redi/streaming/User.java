package com.redi.streaming;


import java.util.*;


public class User {
    private UUID id;
    private String name;
    //private ArrayList<Playlist>playlists;

    public User(UUID id, String name) {
        this.id = id;
        this.name = name;
        //this.playlists = playlists;
    }



    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

  /*  public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }*/

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

   /* public void setPlaylists(ArrayList<Playlist> playlists) {
        this.playlists = playlists;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(name, user.name) //&&
                //Objects.equals(playlists, user.playlists)
        ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name );
    }
}
