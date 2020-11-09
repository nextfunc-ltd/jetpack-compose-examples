package com.nextfunc.jetpackcomposeexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.platform.setContent
import com.nextfunc.jetpackcomposeexample.demo.dialog.ComposeDialogDemo
import com.nextfunc.jetpackcomposeexample.ui.JetpackComposeExampleTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    ComposeDialogDemo()
                }
            }
        }
    }
}