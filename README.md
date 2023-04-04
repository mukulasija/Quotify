# Quote App

(![QuotifyScreen](https://user-images.githubusercontent.com/78532621/229735759-493c252f-1521-4a29-bd84-a9360178d460.jpeg)
)

The Quote App is a simple one screen Android application that allows the user to view and share quotes from different authors. The app is built using the Model-View-ViewModel (MVVM) architecture pattern and makes use of a ViewModel and a ViewModelFactory to manage the presentation logic and data.

## Features

- Display quotes on a card with author name
- Navigate to the next and previous quotes using buttons
- Share the current quote via any app as text

## Installation

To install the app on your Android device, follow these steps:

1. Clone the repository from Github:
https://github.com/mukulasija/Quotify.git

2. Open the project in Android Studio.

3. Build and run the app on your Android device or emulator.

## Usage

When you open the Quote App, you will see a card displaying a quote from a famous author, along with their name. You can use the next and previous buttons to navigate to other quotes.

To share the current quote, simply tap the share button on the card. This will open a menu of apps that you can share the quote to as text. 

## Architecture

The Quote App is built using the Model-View-ViewModel (MVVM) architecture pattern. The ViewModel handles the presentation logic, while the View is responsible for displaying the data and handling user input. The ViewModelFactory is used to create instances of the ViewModel.

## Libraries

The Quote App makes use of the following libraries:

- AndroidX: a set of libraries that provide backward-compatibility and other features for Android.
- ViewModel: a component of the Android Jetpack library that provides a way to manage the presentation logic of an app.
- LiveData: a component of the Android Jetpack library that provides a way to observe changes in data.
- Gson: a library that provides a way to convert Java objects to and from JSON.
- Material Components: a set of UI components that implement Google's Material Design.

## Credits

The Quote App was created by [Mukul Asija](https://github.com/mukulasija). The app uses quotes from various sources, including books, speeches, and interviews.


