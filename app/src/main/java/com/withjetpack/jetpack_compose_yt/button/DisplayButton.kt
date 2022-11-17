package com.withjetpack.jetpack_compose_yt.button

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DisplayButton(LocalContext: Context) {

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = {
            Toast.makeText(
                LocalContext,
                "Click On Submit",
                Toast.LENGTH_SHORT
            ).show()
        }) {

            Text(text = "Submit")
        }
        OutlinedButton(
            onClick = {
                Toast.makeText(
                    LocalContext,
                    "Click On Outline Button",
                    Toast.LENGTH_SHORT
                ).show()
            },
            modifier = Modifier.fillMaxWidth().padding(top = 10.dp)
        ) {
            Text(text = "Login")
        }
    }


}