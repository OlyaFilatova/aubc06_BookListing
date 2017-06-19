# Books Listing

Sixth task from Udacity's [Android basics course](https://www.udacity.com/course/android-basics-nanodegree-by-google--nd803)

Android Basics: Networking

[Lesson 4: Book Listing App](https://review.udacity.com/#!/rubrics/164/view)

This app fetches data from Google Books.

The user can enter a word or phrase to serve as a search query. 

The app fetches book data related to the query via an HTTP request from the [Google Books API](https://developers.google.com/books/docs/overview).

![When you open this application it looks like this.](docs/screenshot_empty_search.png)

App contains a ListView which becomes populated with list items.

List items display authors and title information.

![This how search result looks like.](docs/screenshot_search.png)

When there is no data to display, the app shows a default TextView that informs the user that na data was found.

![When search got no result.](docs/screenshot_no_books.png)

or how to populate the list

![If User tries to search with empty input.](docs/screenshot_empty_search.png)

The app checks whether the device is connected to the internet and responds appropriately.

![When user got no connection.](docs/screenshot_no_connection.png)

The network call occurs off the UI thread using an AsyncTask.