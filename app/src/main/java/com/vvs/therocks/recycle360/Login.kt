package com.vvs.therocks.recycle360

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vvs.therocks.recycle360.ui.theme.MetalMania

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {
    Box() {
        Image(
            painter = painterResource(R.drawable.background_mobile),
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop,
            contentDescription = ""
        )
        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {
            Image(
                painter = painterResource(R.drawable.logo_text),
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.3f)
                    .padding(20.dp),
                contentDescription = ""
            )
            var text by remember { mutableStateOf(TextFieldValue("")) }
            OutlinedTextField(
                value = text,
                onValueChange = {
                    text = it
                },

                modifier = Modifier.padding(30.dp,0.dp,30.dp,0.dp).fillMaxWidth().fillMaxHeight(1/6f),
                shape = RoundedCornerShape(100.dp),
                colors = TextFieldDefaults.textFieldColors(containerColor = Color(0xff268e5c))

            )

            OutlinedTextField(
                value = text,
                onValueChange = {
                    text = it
                },
                modifier = Modifier.padding(30.dp,0.dp,30.dp,0.dp).fillMaxWidth().fillMaxHeight(1/5f),
                shape = RoundedCornerShape(100.dp),
                colors = TextFieldDefaults.textFieldColors(containerColor = Color(0xff268e5c))

            )

            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(30.dp, 0.dp, 30.dp, 0.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(
                    onClick = {}, modifier = Modifier
                        .fillMaxWidth(0.65f)
                        .height(90.dp),
                    colors = ButtonColors(
                        containerColor = Color(0xff29a1b9),
                        contentColor = Color.White,
                        disabledContentColor = Color.White,
                        disabledContainerColor = Color(0xff29a1b9)
                    )
                ) {
                    Text("Forgot Password", color = Color.White, style = MaterialTheme.typography.bodySmall )
                }
                Button(
                    onClick = {}, modifier = Modifier
                        .width(90.dp)
                        .height(90.dp),
                    colors = ButtonColors(
                        containerColor = Color(0xff29a1b9),
                        contentColor = Color.White,
                        disabledContentColor = Color.White,
                        disabledContainerColor = Color(0xff29a1b9)
                    )
                ) {

                }
            }
            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(1 / 3.5f)
                    .padding(30.dp, 0.dp, 30.dp, 0.dp),
                shape = RoundedCornerShape(30.dp),
                colors = ButtonColors(
                    containerColor = Color(0xff82200c),
                    contentColor = Color.White,
                    disabledContentColor = Color.White,
                    disabledContainerColor = Color(0xff82200c)
                )

                ) {
Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
    Text("Not Recycling Yet! Sign-Up", style = MaterialTheme.typography.bodySmall)
}
            }
            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(1 / 3f)
                    .padding(30.dp, 0.dp, 30.dp, 0.dp),
                shape = RoundedCornerShape(30.dp, 30.dp, 0.dp, 0.dp),
                colors = ButtonColors(
                    containerColor = Color(0xff887907),
                    contentColor = Color.White,
                    disabledContentColor = Color.White,
                    disabledContainerColor = Color(0xff887907)
                )
            ) {
                Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
                    Text("More Sign-In Options", style = MaterialTheme.typography.bodySmall)
                }
            }


        }


    }


}