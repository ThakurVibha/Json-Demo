package com.vibhathakur.jsonproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Gson gson=new Gson();
//Student student=new Student("Hitesh",5,"hitesh@lco.in");
   //     String json=gson.toJson(student);
//        String json="{\"CourseCount\":5,\"email\":\"vibha@com\",\"name\":\"Vibha\"}";
//Student stu   dent=gson.fromJson(json,Student.class);
//        Log.d("test",json);
    }
}
