package com.ucsdextandroid1.musicsearch.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by rjaylward on 2019-05-11
 */
public class ItunesSongItem implements SongItem {

    //TODO add all the members to this class with proper serialized names
    @SerializedName("trackId")
    private long trackId;

    @SerializedName("trackName")
    private String trackName;

    @SerializedName("artistId")
    private String artistId;

    @SerializedName("artistName")
    private String artistName;

    @SerializedName("collectionName")
    private String  collectionName;

    @SerializedName("artworkUrl100")
    private String  artworkUrl100;

    @SerializedName("previewUrl")
    private String  previewUrl;

    @SerializedName("trackTimeMillis")
    private long trackTimeMillis;

    @Override
    public long getTrackId() {
        return trackId;
    }

    @Override
    public String getTrackName() {
        return trackName;
    }

    @Override
    public String getArtistName() {
        return artistName;
    }

    @Override
    public String getAlbumName() {
        return collectionName;
    }

    @Override
    public String getArtworkUrl() {
        return artworkUrl100;
    }

    @Override
    public String getPreviewUrl() {
        return previewUrl;
    }

    @Override
    public long getTrackTime() {
        return trackTimeMillis;
    }

}
