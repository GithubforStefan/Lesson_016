package com.redi.streaming;

import java.util.Objects;
import java.util.UUID;

public class Artist {
    private final UUID id;
    private String artistName;

    public Artist(UUID id, String artistName) {
        this.id = id;
        this.artistName = artistName;
    }

    public UUID getId() {
        return id;
    }

    public String getArtistName() {

        return artistName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artist artist = (Artist) o;
        return Objects.equals(id, artist.id) &&
                Objects.equals(artistName, artist.artistName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, artistName);
    }
}
