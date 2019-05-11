package com.ucsdextandroid1.musicsearch.data;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

/**
 * Created by rjaylward on 2019-05-11
 */
public class ItunesSearchResultsDeserialzer implements JsonDeserializer<ItunesSearchResults> {

    @Override
    public ItunesSearchResults deserialize(JsonElement json, Type typeOfT,
                                           JsonDeserializationContext context) throws JsonParseException {

        //TODO create a ItunesSearchResults to return and a list of ItunesSongItem

        //TODO loop through all the elements in the results JsonArray and add them to the list

        return null;
    }

}
