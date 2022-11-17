package com.withjetpack.jetpack_compose_yt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.withjetpack.jetpack_compose_yt.button.DisplayButton
import com.withjetpack.jetpack_compose_yt.textview.DisplayTextView
import com.withjetpack.jetpack_compose_yt.ui.theme.JetpackcomposecomponentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackcomposecomponentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                   // DisplayTextView("Welcome to Jetpack Compose")
                    DisplayButton(LocalContext.current)
                 }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackcomposecomponentTheme {
        DisplayTextView("Welcome to Jetpack Compose")
    }
}