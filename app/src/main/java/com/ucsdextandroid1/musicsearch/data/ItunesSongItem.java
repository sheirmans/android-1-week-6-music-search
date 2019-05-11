package com.ucsdextandroid1.musicsearch.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by rjaylward on 2019-05-11
 */
public class ItunesSongItem implements SongItem {

    //TODO add all the members to this class with proper serialized names

    @Override
    public long getTrackId() {
        return 0;
    }

    @Override
    public String getTrackName() {
        return null;
    }

    @Override
    public String getArtistName() {
        return null;
    }

    @Override
    public String getAlbumName() {
        return null;
    }

    @Override
    public String getArtworkUrl() {
        return null;
    }

    @Override
    public String getPreviewUrl() {
        return null;
    }

    @Override
    public long getTrackTime() {
        return 0;
    }

}
