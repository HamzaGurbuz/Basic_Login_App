# Android Login Page

This project contains a simple login page created using Android Studio. The page includes fields for username and password input, along with basic login validation.

## Features

Username and Password Input: Collects login credentials from the user.

Basic Validation: Checks the credentials against predefined values.

Login Success/Failure Messages: Displays appropriate messages based on the login result.

## Installation

Clone the Repository:

  ```bash
git clone https://github.com/HamzaGurbuz/Basic_Login_App
  

Open Android Studio:

Navigate to "File" > "Open" and select the project folder.

Install Required SDKs:

Download the necessary Android SDK version from the project settings.

## Run the Application:

  ```bash
  ./gradlew assembleDebug

Click the "Run" button to launch the app on a real device or emulator.

Usage

Launch the application.

Fill in the username and password fields.

Correct Credentials: A success message appears.

Incorrect Credentials: An error message is displayed.

Configuration

To change the default username and password:

Edit the following lines in MainActivity.java:

  ```bash
  String correctUsername = "admin";
  String correctPassword = "password";

## Contributing

If you’d like to contribute, feel free to submit a pull request or open an issue.
