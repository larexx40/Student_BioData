package com.example.studentbio.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.studentbio.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1. to configure our navigation, setup the navcontroller first then handle the back button
        // NavController helps move to another destination(fragment) using the action in the navGraph
        val navController = Navigation.findNavController(this, R.id.navFragment)
        NavigationUI.setupActionBarWithNavController(this,navController)
    }

    //2. handle back button - override the onsupportNavigateUp() and pass our navController to it
    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(
            Navigation.findNavController(this, R.id.navFragment), null
        )
    }
}
