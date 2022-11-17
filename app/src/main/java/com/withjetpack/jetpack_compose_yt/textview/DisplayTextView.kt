package com.withjetpack.jetpack_compose_yt.textview

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DisplayTextView(s: String) {

    Column(modifier = Modifier.fillMaxSize().padding(20.dp), verticalArrangement = Arrangement.Center) {
        Text(text = "My title is $s", fontSize = 20.sp,color= Color.Red,modifier = Modifier.padding(top = 20.dp) ,fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
        Text(text = "My title is $s", fontSize = 20.sp, fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 10.dp), textDecoration = TextDecoration.Underline)
        Text(text = "My title is $s", fontSize = 20.sp, fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 10.dp))
        Text(text = "My title is $s", fontSize = 20.sp, fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 10.dp))
    }

}