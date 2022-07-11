package com.najdimu.jetpackcompose

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.foundation.text.appendInlineContent
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.PlaceholderVerticalAlign
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign.Companion.End
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.najdimu.jetpackcompose.ui.theme.BlueCustom
import com.najdimu.jetpackcompose.ui.theme.BlueCustom2
import com.najdimu.jetpackcompose.ui.theme.GrayCustom

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val fontFamily = FontFamily(
                Font(R.font.lobstertwo_regular, FontWeight.Normal),
                Font(R.font.lobstertwo_bold, FontWeight.Bold)
            )
            var textFieldState by remember {
                mutableStateOf("")
            }
            var textFieldState1 by remember {
                mutableStateOf("")
            }
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(painter = painterResource(id = R.drawable.ic_back),
                    contentDescription = "back button",
                    modifier = Modifier
                        .align(Alignment.Start)
                        .offset(20.dp, 30.dp)
                        .clickable {
                            val intent = Intent(this@SecondActivity, MainActivity::class.java)
                            startActivity(intent)
                        })

                Text(
                    text = "Instagram",
                    fontSize = 45.sp,
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(top = 90.dp)
                )
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 50.dp)
                )
                OutlinedTextField(
                    value = textFieldState,
                    label = {
                        Text(text = "Username")
                    },
                    onValueChange = {
                        textFieldState = it
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 25.dp)
                )

                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp)
                )
                OutlinedTextField(
                    value = textFieldState1,
                    label = {
                        Text(text = "Password")
                    },
                    onValueChange = {
                        textFieldState1 = it
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 25.dp)
                )

                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp)
                )
                Text(
                    text = "Forgot password?",
                    style = TextStyle(color = BlueCustom, fontWeight = FontWeight.Bold),
                    modifier = Modifier
                        .align(Alignment.End)
                        .padding(end = 25.dp)
                )
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 25.dp)
                        .padding(top = 25.dp)
                        .height(50.dp),
                    colors = ButtonDefaults.buttonColors(BlueCustom),
                    border = BorderStroke(1.dp, BlueCustom2),
                    shape = RoundedCornerShape(7.dp)
                ) {
                    Text(
                        text = "Log in",
                        color = Color.White,
                        fontSize = 18.sp
                    )
                }
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 35.dp)
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(40.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.logo),
                        modifier = Modifier.size(22.dp),
                        contentDescription = ""
                    )
                    Text(
                        text = "Log in with Facebook",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = BlueCustom
                        ),
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                }
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 40.dp)
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Divider(color = GrayCustom, modifier = Modifier.size(150.dp, 1.dp))
                    Text(text = "OR")
                    Divider(color = GrayCustom, modifier = Modifier.size(150.dp, 1.dp))
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center

                ) {
                    Text(
                        text = "Don't have an account?",
                        color = GrayCustom,
                        modifier = Modifier
                    )
                    Text(
                        text = "Sign up.",
                        fontWeight = FontWeight.Bold,
                        color = BlueCustom,
                        modifier = Modifier.padding(start = 5.dp)

                    )
                }

                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 40.dp)
                )
                Divider(color = GrayCustom)
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center

                ) {
                    Text(
                        text = "Instagram from Facebook",
                        color = GrayCustom,
                        modifier = Modifier
                    )
                }
            }

        }
    }
}

