package com.nextfunc.jetpackcomposeexample.ui.demo.floating_action_button

import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun FloatingActionButtonDemo() {
    Scaffold(
        backgroundColor = Color.White,
        floatingActionButton = {
            FloatingActionButton(
                backgroundColor = Color.Red,
                icon = {
                    Icon(
                        asset = Icons.Filled.Add,
                        // If tint color is provided, it will override contentColor below
                        tint = Color.White
                    )
                },
                contentColor = Color.Blue,
                onClick = {
                    print("Floating Action Button Clicked.")
                }
            )
        }
    ) {}
}