package com.withjetpack.jetpack_compose_yt.card

import android.util.Log.d
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.withjetpack.jetpack_compose_yt.R

@Composable
fun DisplayCardView (){

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth().fillMaxHeight(), content = {
            Card(elevation = 4.dp,shape = RoundedCornerShape(20.dp),backgroundColor = Color.Yellow, modifier = Modifier.padding(all = 10.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Text("AB CDE", fontWeight = FontWeight.W700)
                    Text("+0 12345678")
                    Text("XYZ city.", color = Color.Gray)
                }
            }
        }
    )
}