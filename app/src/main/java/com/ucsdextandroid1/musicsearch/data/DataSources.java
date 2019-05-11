package com.ucsdextandroid1.musicsearch.data;

import java.util.List;

/**
 * Created by rjaylward on 2019-05-10
 */
public class DataSources {

    private static DataSources instance;

    private DataSources() {

        //TODO create a custom gson

        //TODO use retrofit to create an instance of the itunesApi
    }

    public static DataSources getInstance() {
        if(instance == null)
            instance = new DataSources();

        return instance;
    }

    public void search(String searchTerm, Callback<List<? extends SongItem>> callback) {
        //TODO call the itunesApi and return an empty list on any failures
    }

    public interface Callback<T> {
        void onDataFetched(T data);
    }

    public interface ItunesApi {
        //TODO add a method that corresponds to the search method on the iTunesApi
    }
}
