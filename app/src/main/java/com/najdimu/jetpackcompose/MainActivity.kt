package com.najdimu.jetpackcompose

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.najdimu.jetpackcompose.ui.theme.BlueCustom
import com.najdimu.jetpackcompose.ui.theme.BlueCustom2
import com.najdimu.jetpackcompose.ui.theme.GrayCustom
import com.najdimu.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val fontFamily = FontFamily(
                Font(R.font.lobstertwo_regular, FontWeight.Normal),
                Font(R.font.lobstertwo_bold, FontWeight.Bold)
            )
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Instagram",
                    fontSize = 45.sp,
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(top = 120.dp)
                )
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 50.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = "Profile image",
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp)
                )
                Text(
                    text = "umidjanjumabayev",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                )

                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 25.dp)
                        .padding(top = 10.dp)
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
                        .padding(top = 40.dp)
                )
                Text(
                    text = "Switch accounts",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = BlueCustom,
                    modifier = Modifier.clickable {
                        val intent = Intent(this@MainActivity, SecondActivity::class.java)
                        startActivity(intent)
                    })
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 200.dp)
                )
                Divider(color = GrayCustom)
                Row(
                    modifier = Modifier.fillMaxWidth()
                        .height(80.dp),
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
                        color = Color.Black,
                        modifier = Modifier.padding(start = 15.dp)

                    )
                }
            }

        }
    }
}
