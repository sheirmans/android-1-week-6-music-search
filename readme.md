Week 6 - Music Search
===================
### MusicSearch assignment:

The goal of this assignment is to review using Retrofit and Gson...

 1. Make a class representing an object from the server [Example from week 5](https://github.com/ucsd-ext-android-rja/android-1-week-4-map/blob/master/app/src/main/java/com/ucsdextandroid1/snapmap/UserLocationData.java)
 2. Create an interface representing all methods on the server [Example from week 4](https://github.com/ucsd-ext-android-rja/android-1-week-4-map/blob/master/app/src/main/java/com/ucsdextandroid1/snapmap/DataSources.java#L185-L221)
 3. Building an instance of Retrofit with a custom Gson [Example from week 5](https://github.com/ucsd-ext-android-rja/android-1-week-4-map/blob/master/app/src/main/java/com/ucsdextandroid1/snapmap/DataSources.java#L43-L67)
 4. Adding a custom json deserializer for a specific class. [Example from week 5](https://github.com/ucsd-ext-android-rja/android-1-week-4-map/blob/master/app/src/main/java/com/ucsdextandroid1/snapmap/ActiveUserLocationsResponseDeserializer.java)

For this assignment you will finishing an app that searches using the iTunes Search Api. 
You can see an example of the api results below. You will use a custom deserializer to map this 
response type to the **ItunesSearchResults** object. You will also create an **ItunesSongItem**. You 
do not need to add every field returned by the api, just the ones in the **SongItem** interface.

**https://itunes.apple.com/search?media=music&limit=25&term=Taylor**

Note: Anything a url after the ? is considered a query param. In this case the url has 3 query
params: media, limit, and term. If you want to add a dynamic query param in a **Retrofit** interface 
you can use the **@Query("...")** annotation String param passed to the method and it will be added 
to the url.

```
{
  "resultCount": 1,
  "results": [
    {
      "wrapperType": "track",
      "kind": "song",
      "artistId": 159260351,
      "collectionId": 295757174,
      "trackId": 295757188,
      "artistName": "Taylor Swift",
      "collectionName": "Fearless",
      "trackName": "Love Story",
      "collectionCensoredName": "Fearless",
      "trackCensoredName": "Love Story",
      "artistViewUrl": "https://itunes.apple.com/us/artist/taylor-swift/159260351?uo=4",
      "collectionViewUrl": "https://itunes.apple.com/us/album/love-story/295757174?i=295757188&uo=4",
      "trackViewUrl": "https://itunes.apple.com/us/album/love-story/295757174?i=295757188&uo=4",
      "previewUrl": "https://audio-ssl.itunes.apple.com/apple-assets-us-std-000001/Music/8d/7f/d5/mzm.yppdvtoz.aac.p.m4a",
      "artworkUrl30": "https://is4-ssl.mzstatic.com/image/thumb/Music/v4/ae/35/ac/ae35ac3b-5c14-818e-a54c-a1f73ef13c54/source/30x30bb.jpg",
      "artworkUrl60": "https://is4-ssl.mzstatic.com/image/thumb/Music/v4/ae/35/ac/ae35ac3b-5c14-818e-a54c-a1f73ef13c54/source/60x60bb.jpg",
      "artworkUrl100": "https://is4-ssl.mzstatic.com/image/thumb/Music/v4/ae/35/ac/ae35ac3b-5c14-818e-a54c-a1f73ef13c54/source/100x100bb.jpg",
      "collectionPrice": 7.99,
      "trackPrice": 1.29,
      "releaseDate": "2008-09-12T07:00:00Z",
      "collectionExplicitness": "notExplicit",
      "trackExplicitness": "notExplicit",
      "discCount": 1,
      "discNumber": 1,
      "trackCount": 13,
      "trackNumber": 3,
      "trackTimeMillis": 235267,
      "country": "USA",
      "currency": "USD",
      "primaryGenreName": "Country",
      "isStreamable": true
    }
  ]
}
```

#### Requirements: 
 - Complete the **ItunesSongItem** class
 - Add a method to **ItunesApi** in the **DataSources** class that takes in a search query and returns a **Call<ItunesSearchResults>**
 - Create an instance of **Gson** with a custom type adapter for the **ItunesSearchResults** class
 - Create an instance of the **ItunesApi** using **Retrofit**
 - Finish implementing the **DataSources.search()** method
 
 ![Image](search_screenshot.png)