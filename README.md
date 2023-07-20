# HWApp
I need Help, I need some help to develop this assignment app. 
The assignment description: 
App Name: (HW App),
Empty Activity, 
 Minimum SDK is API 12: Android 5.0 ( Lolipop )
Kotlin Language

It is an Android application designed to help users store and organizees with associated questions and answers. The app is divided into four sections: Math Questions, Computer Questions, English Questions,Other Questions, and each section can store pictures depending on the free storage the users have on their phones.
When the app opens, users are presented with a home screen that displays the four sections. Each Section has a different background color, Math Questions has yellow colour, English questions has blue colour, Computer questions has green colour, Other Questions has Red Colour. 
Within each section, users has three buttons to press. 
Number one (Camera), users can take pictures with their device's camera. 
Number two is called (Gallery), users can select an existing picture from their gallery. Number three is called (Saved Images). All the three buttons have the same colour background, not like the four buttons on the home screen. This is a general explanation of the app. 

Now I will explain specifically what will happen when users interact and use the app. Once users opens the app, they find four buttons, let's start with the first button which is called (Math Questions) , when users press this button, it moves to the other screen that consists of three buttons (Camera, Gallery, and Saved Images). Let's assume that users choose to press the camera to take a picture of an image which has a question on it, this question may be written in English, Arabic, or in both languages. 
The app utilizes OCR (optical character recognition) technology to detect any text in the image and automatically extract the question. If the user's image has no similarity with any previously stored images in that section's database, they will be prompted to enter an answer to the question and save it with the picture. But if there is similarity, the app will display the top three images along with their corresponding percentage score indicating the level of similarity. The user can then choose to save or ignore the new image. If they choose to save the new image, they will be asked to enter an answer for the question in the new image and save it with the old images and their corresponding answers.
But if the user press ignore, the app just shows them the 3 similar pictures, and if there is only 2 or 1 similar picture , it's okay to shows them one picture, but no more than 3 pictures. 
Now , let's just to the next button which is (Gallery) if the user press this button, it moves them to all the images stored in his mobile. Then the user chooses one image, to do the same process that it is done with the Camera button, they only differ in the way the user includes the image. Remember, it's necessary to ask the users permissions the first time when they press the Canera button or the Gallery button. Finally, the third button consists of all math saved images associated with their questions, and anwers which were given by the users. So the new image which is taken or selected by the two buttons above, are compared to the saved images that are in the third button. 
The Saved Images button allows users to view all of their saved images in a section, sorted by date and section. Each image is displayed along with its associated question and answer. Users can tap on an image to view it in full-screen mode and edit the associated question and answer if needed.

After explaining everything about the Math Questions button. We still have to three more buttons, so let's get back to the home screen. The second button is English Questions, When the users press this button, it moves to 3 similar buttons which Math Questions has, but there is only one small difference, when users choose English Questions button, then the take or select a new picture, the new picture is only comoared with only the Saved Images in  English Questions section.
So it shouldn't be compared to the Saved Math Images or any other section. The same goes to the rest two buttons which are the Third button that is called Computer Questions, the Forth Button that is called Other Questions.  The app also includes integration with cloud storage services, allowing users to backup their data in the cloud and access it from any device.


Overall, the app is not difficult to develop, all the four buttons on the home screen are similar to each other, but they only differ in their background colours and the similarity issue whith the saved images that I have explained before.
