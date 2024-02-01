/**
 * @author Charlize Aponte
 * 1/31/24
 * Assignment: Demo from Chapter 7: Screen Message
 * The program allows you to write a secret message and loop back to the welcome screen by using navigation
 */
package edu.quinnipiac.sercetmessage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}