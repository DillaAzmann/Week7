package com.example.user.week7;

/**
 * Created by user on 2/11/2017.
 */

public class Artist {
    String artistId;
    String artistName;

    public Artist(){}

    public String getArtistId() {
        return artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public Artist(String artistId, String artistName) {

        this.artistId = artistId;
        this.artistName = artistName;
    }
}
