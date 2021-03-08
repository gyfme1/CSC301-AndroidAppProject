#  myPlanBook

## Content
1. Introduction
2. Installation
3. Financial Hub
4. Login pages
5. Health and Fitness Loggers

---

## Introduction

myPlanBook is an Android mobile application that runs on Android API 16 to the latest release as of this application's first release (API 29). The application aims to be its users own virtual personal secretary by helping its users track their engagements and upcoming deadlines using its Calendar feature. Through the app's Financial Hub, users can track their monthly and yearly spending while setting yearly saving goals to help manage their spending. The Health and Fitness feature allows users to measure their body weight, body fat and workout routines. The app also provides a wish list feature.

---

## Installation

https://developer.android.com/studio/run/device

1. Install Android Studio
2. Clone the repository and import the build.gradle file in Android Studio
3. On your Android device open the Settings app, select Developer options, and then enable USB debugging.
   - Note: If you do not see Developer options, follow the instructions to [enable developer options](https://developer.android.com/studio/debug/dev-options).
4. When you are set up and plugged in over USB, you can click Run in Android Studio to build and run the app on the device.

---

## Financial Hub


<img align="right" src="https://github.com/UTMCSC301/project-thebrogrammers/blob/master/doc/screenshots/financialHub.png" width="216" height="384">


### Load Transactions

This feature of the **Financial Hub** provides a few features which include: a auto-load feature, a manual load feature, and deletion features. The auto-load feature allows users to upload their banking transactions via a CSV file, provided by their bank. Most banks provide this functionality through their online account services. When you click on "Load CSV File", the user is presented with the Android local file explorer, from where they can import a banking .csv file. After clicking the csv of revelance, the app will report through a popup window either success of the operation or error. You can verify that your transactions were imported properly by navigating to the **Manage Finances** feature.


**Note**: the application expects the format of the csv file as follows: "<dd/mm/yyyy>, \<store name/category> \<debit amount\>, \<credit amount\>, \<credit card number\>). 

Load Transactions also allows users to mannually enter every transaction they wish after clicking on the "Manually Load" button. To commit a transaction to your account, first fill all text fields and the click on a date on the calendar at the top of the screen. Once you've entered all requistory information, click either "Debit" or "Credit" based on the type of transaction, to queue the transaction to be loaded (you can view the queue of transactions at the bottom of the screen). Once you are done queuing all transactions you wish, then click on the "Commit Collection" button. If you make a mistake or don't wish to commit all the queued transactions, then you can click "Clear Collection" to delete all queued transactions without commiting them.

To delete financial data already imported and saved to your account, you can either delete all banking data by clicking the "Delete All" button at the bottom of the screen in the **Load Transactions** main window or delete by a specific month by scrolling to the preferred month and clicking on the "Delete Month" button.

### Set Goals

This feature of the **Financial Hub** allows a way for users to set a goal for themselves, and a way to see how close they are to achieiving that goal. Most people have something that they want to buy and are saving for, and this function helps with that. A user can enter the name and price of whatever they want, and allows users to enter income and expenditures. Whenever something is entered, a progress bar is altered to show progress towards the goal amount, and below the bar tells you how much money you've gained/lost since tracking, and how close you are to the goal amount (in %).

The information is stored in the database, this way whenever you leave the app you're inputs and progress are saved. You are also able to switch goals. For example, if the price of your goal changes, then you can re-enter the changed amount, and the progress bar will reflect those changes. 

### Manage Finances

<img align="right" src="https://github.com/UTMCSC301/project-thebrogrammers/blob/master/doc/screenshots/manageFinances1.png" width="216" height="384">

After loading transactions into the account either manually or automatically,
the **Manage Finances** feature graphically displays the transactions in a user friendly way. The first pie chart labeled "Transactions by Category" displays the top 5 transactions by amount over the given year. Clicking on a percentile of the pie chart produces a information box about that transaction category. 

The second pie chart, labeled "Monthly Transactions", charts the amount of transactions made each month as a portion of the pie chart. The bottom charts display debit and credit expenditures for each month as a line graph. The interactive graph responds to zooms and clicks on mapped data points.

## Login Pages

### Login

This is a standard login page, where you are able to enter an email address and password of your account. Using the Firebase API, if the information is linked to an account then the login will be successful, and if not a popup will notify you that the email/password is incorrect. If you do not have an account, then there is a button that takes you to a signup page.

### Signup 

This is another standard signup page, asking for your name, username, password and cell number. If you enter an invalid email, then the signup will fail, if not and all fields have input then the signup will succeed, and your account will be registered in Firebase.

## Wish List

### Enter Wish

<img align="right" src="https://github.com/UTMCSC301/project-thebrogrammers/blob/master/doc/screenshots/wishlist.png" width="216" height="384">

At the top of this page, there is an input zone which allows user to enter their wishes, and on the right side of the input zone, there is a button named "ADD TO LIST". This button can not be clicked if user hasn't entered anything. After the user click this button, the entered wish will be saved and will show up at the middle of this page. There is a wish list at the middle of this page, all entered wishes will be showed up there. The wish list part was designed to be a scrollview so no matter how many wishes the user entered, it is able to store all of them.

### Delete Wish

Above the wish list show up zone, there is a button named "DELETE". Whenever the user click this button, all wishes will be deleted, and a toast message will pop up at the bottom of this page says that "All Wishes Deleted :(". And then the wish list show up zone will be cleared.

### Share Wish

At the right side of the "DELETE" button, there is another button named "SHARE". When user entered some of his/her wishes, he can click this button, so a small choose panel will pop up at the bottom of this page. It will let the user share their wishes either through email or through text message. No matter which way the user choose, all his/her wished will be copied automatically. Say we use email, then all user's wishes will be copied in to the email, then all you have to do is just enter your friend's email address and click send. After a few seconds, your friend will receive a list of your wishes.

## Main Page

This is the main page you will see after login. You can select to go to Calender, Financial Hub, Body Log, Wish List, or Setting page from this page.
<p float="left">
  <img src="https://github.com/UTMCSC301/project-thebrogrammers/blob/master/doc/screenshots/MainPage.png" width="512" height="384" />
</p>

## Setting Page

### Change Password

This is the page where you can change your account password. You are asked to enter your old password to verify your account. Then you need to enter a new password and reenter the new password again to verify your new password. Using the Firebase API, if the old password is correct, then the new password will be updated if the new password and the reentered new password are the same. If the old password is not correct, a popup will notify you that the old password is incorrect.

### Provide Feedback
This is the page you can provide any feedback to the developers. You can type in text box and click Submit to upload your advice.

<p float="left">
  <img src="https://github.com/gyfme1/CSC301-AndroidAppProject/blob/3b6c1587c26a79c762efd9539ac1389c68d4082a/CSC301-PROJECT/screenshots/Profile.PNG" width="216" height="384" />
  <img src="https://github.com/gyfme1/CSC301-AndroidAppProject/blob/3b6c1587c26a79c762efd9539ac1389c68d4082a/CSC301-PROJECT/screenshots/ChangePassword.png" width="216" height="384" /> 
  <img src="https://github.com/gyfme1/CSC301-AndroidAppProject/blob/3b6c1587c26a79c762efd9539ac1389c68d4082a/CSC301-PROJECT/screenshots/Feedback.png" width="216" height="384" />
</p>

### Profile

<img align="right" src="https://github.com/gyfme1/CSC301-AndroidAppProject/blob/3b6c1587c26a79c762efd9539ac1389c68d4082a/CSC301-PROJECT/screenshots/profilesetting.png" width="216" height="384">
<img align="right" src="https://github.com/gyfme1/CSC301-AndroidAppProject/blob/3b6c1587c26a79c762efd9539ac1389c68d4082a/CSC301-PROJECT/screenshots/Profile.PNG" width="216" height="384">

This page allows the user to view their personal information such as name, email addess, account number, phone number, city, and country. This is a scrollview so it is suitable for most of the screen sizes. It also allows the user to choose their icon from the android gallery. Whenever the user click the icon at the top of this page, a selector will pop up which allows user to choose picture from android gallery. If user wants their own picture to be the icon, they can also upload their own pictures to the android gallery first, and then choose from the gallery.

### Profile Setting

At the bottom of the Profile page, there is a button named "CHANGE INFORMATION" which will lead to the profile setting page. Whenever user click that button, it will lead the user to the profile setting page. In that page, user can change any of their personal information including name, email address, account number, phone number, city, and country. When the user finish entering information, there is a button at the bottom of this page named "CONFIRM". When user click it, the application will bring him back to the profile page and there a toast message will come up at the bottom of the screen says that all the changed have been successfully made. 

## Calendar

### Add Events

<img align="right" src="https://github.com/UTMCSC301/project-thebrogrammers/blob/master/doc/screenshots/calendar.png" width="216" height="384">

This feature of the Calendar allows the user to input events into the calendar. When you select a certain date on the calendar then click on "Add Event", the user is presented with a new activity where they can input their event details. The user can specify a description for the event, a time for the event and they can choose a color to be displayed on the calendar for that event. Once the event is ready you click "save" to save the event into the calendar. You can then view the event with its corresponding color on the calendar.

### Update/Delete Events

This feature of the Calendar allows the user to update or delete events in the calendar. When you select a certain date with events the user will be able to see a list of the events for that day under the calendar. From there you can either click the update or delete button to make changes to the calendar. If you click the update button the user will go back to the add events screen to make changes to that event. If you click the delete button, the event will be removed from the calendar.

## Health and Fitness Loggers

There are 3 loggers as part of the Health and Fitness loggers: the calorie logger, the body fat logger, and the body weight logger.
To get to these loggers, simply login, tap Health and Fitness, and then tap one of the appropriate buttons to get to a specific logger.
These three tools allow you to log your daily caloric intake, calculate and log your daily body fat percentages, and log your body weight.
To use these three logging tools, simply input the required data and tap enter. If you want to remove any entries, simply tap the pencil edit icon,
check the entries via the check boxes, and tap the garbage icon. Tap X to exit edit mode. For the body fat and the body weight loggers, you can
see a graphical representation of the change in body fat or body weight at the bottom for the given month with the x axis being the days of the month.
As for the calorie logger, you'll see the total calories for a given date. Also, tap on KG or LBS to toggle the body weight unit in the body weight
logger. Finally, tap on a date in the calendar at the top to change the date and see the data for that specific date.

<p float="left">
  <img src="https://github.com/UTMCSC301/project-thebrogrammers/blob/master/doc/screenshots/bodyWeight.png" width="216" height="384" />
  <img src="https://github.com/UTMCSC301/project-thebrogrammers/blob/master/doc/screenshots/bodyFat.png" width="216" height="384" /> 
  <img src="https://github.com/UTMCSC301/project-thebrogrammers/blob/master/doc/screenshots/calories.png" width="216" height="384" />
</p>
