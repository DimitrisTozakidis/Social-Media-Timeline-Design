package com.example.kotlinintrolbta

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private class Student(val name: String, val age: Int)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val student= Student( "george", 12)

      //  val thisIsAVariable= "some string"
      //  Log.d("onCreate", thisIsAVariable)
        for(i in 0..100) {
            if(i % 3== 0 && i % 5==0) {
                Log.i("FizzBuzz", i.toString())
            }
            else if(i % 3!= 0 && i % 5==0){
                Log.i("Buzz", i.toString())
            }
            else if(i % 3== 0){
                Log.i("Fizz", i.toString())

            }
            else{
                Log.i("nothng", i.toString())
            }
        }
    }
}