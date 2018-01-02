package com.example.user.android_assignment_5;
//Package objects contain version information about the implementation and specification of a Java package.

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //public is a method and fields can be accessed by the members of any class.
    //class is a collections of objects.
    //created MainActivity and extends with AppCompatActivity which is Parent class.

    TextView text;
    Button button;

    @Override
    //we use override to tells the compiler that the following method overrides a method of its superclass.
    protected void onCreate(Bundle savedInstanceState) {
        //protected can be accessed by within the package and class and subclasses
        //The Void class is an uninstantiable placeholder class to hold a reference to the Class object
        //representing the Java keyword void.
        //The savedInstanceState is a reference to a Bundle object that is passed into the onCreate method of every Android Activity
        // Activities have the ability, under special circumstances, to restore themselves to a previous state using the data stored in this bundle.
        super.onCreate(savedInstanceState);
        //Android class works in same.You are extending the Activity class which have onCreate(Bundle bundle) method in which meaningful code is written
        //So to execute that code in our defined activity. You have to use super.onCreate(bundle)
        setContentView(R.layout.activity_main);
        //R means Resource
        //layout means design
        //main is the xml you have created under res->layout->main.xml
        //Whenever you want to change your current Look of an Activity or when you move from one Activity to another .
        //he other Activity must have a design to show . So we call this method in onCreate and this is the second statement to set
        //the design

        text= findViewById(R.id.text);
        //TextView displays text to the user and optionally allows them to edit it. A TextView is a complete text editor,
        // however the basic class is configured to not allow editing.
        //Typecating textview with connecting an id
        button=findViewById(R.id.button);
        //Button is a Push-button which can be pressed, or clicked, by the user to perform an action.
        //setOnClickListener-Register a callback to be invoked when this view is clicked. If this view is not clickable, it becomes
        // clickable.
        button.setOnClickListener(new View.OnClickListener() {
            // View.OnClickListener: The callback that will run.This value may be null.
            @Override
            public void onClick(View v) {
                //onClick(View v)-Called when a view has been clicked.
                //Animation is the process of creating motion and shape change
                Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.animation);
                text.startAnimation(animation);
                //AnimationUtils-Defines common utilities for working with animations.
                //loadAnimation(Context context, int id)-Loads an Animation object from a resource


            }
        });
    }
}

