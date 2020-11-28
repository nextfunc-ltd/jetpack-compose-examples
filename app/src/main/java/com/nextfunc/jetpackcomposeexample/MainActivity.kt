package com.nextfunc.jetpackcomposeexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import com.nextfunc.jetpackcomposeexample.ui.demo.snackbar.ComposeSnackbarDemo1
import com.nextfunc.jetpackcomposeexample.ui.JetpackComposeExampleTheme
import com.nextfunc.jetpackcomposeexample.ui.white

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = white, modifier = Modifier.fillMaxSize()) {
                    ComposeSnackbarDemo1()
                }
            }
        }
    }
}