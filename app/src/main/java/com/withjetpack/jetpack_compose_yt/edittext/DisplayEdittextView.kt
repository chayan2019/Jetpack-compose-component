package com.withjetpack.jetpack_compose_yt.edittext

import android.inputmethodservice.KeyboardView
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp

@Composable
fun DisplayEdittextView() {

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(10.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {

        var text by remember { mutableStateOf("") }
        var text1 by remember {
            mutableStateOf("")
        }

        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("username") },
            placeholder = { Text(text = "user Name")},
         //   Icon(painter = painterResource(id = R.drawable.capture_more_images), contentDescription ="" ,tint = colorResource(R.color.disabled)),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next)
         )

        OutlinedTextField(value =text1 , onValueChange = { text=it },
            label = { Text(text = "password")},
            placeholder = { Text(text = "password")},
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next)
            )

    }

}