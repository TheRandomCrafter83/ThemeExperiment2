package com.coderzf1.themeexperiment2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.coderzf1.themeexperiment2.ui.theme.CustomComposeTheme
import com.coderzf1.themeexperiment2.ui.theme.Purple40
import com.coderzf1.themeexperiment2.ui.theme.ThemeExperiment2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //var isDarkMode:Boolean by  remember{mutableStateOf(true)}
            var testColor by remember {
                mutableStateOf(Purple40.toArgb())
            }
            ThemeExperiment2Theme(
                customComposeTheme = CustomComposeTheme(
                    darkTheme = isSystemInDarkTheme(),
                    primaryColor = 
                    if(!isSystemInDarkTheme()) {
                        colorResource(id = R.color.purple_200)
                    } else {
                        colorResource(id = R.color.purple_700)
                    }
                )
            ) {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(8.dp)
                    ) {
                        Image(painter = painterResource(id = R.drawable.ic_message), contentDescription = null)
//                        Button(onClick = {
//                            testColor = Color.Blue.toArgb()
//                        }) {
//                            Text("Blue")
//                        }
//                        Spacer(modifier = Modifier.height(8.dp))
//                        Button(onClick = {
//                            testColor = Color.Yellow.toArgb()
//                        }) {
//                            Text("Yellow")
//                        }
//                        Spacer(modifier = Modifier.height(8.dp))
//                        Button(onClick = {
//                            testColor = Color.LightGray.toArgb()
//                        }) {
//                            Text("Light Gray")
//                        }
//                        Spacer(modifier = Modifier.height(8.dp))
//                        Button(onClick = {
//                            testColor = Color.DarkGray.toArgb()
//                        }) {
//                            Text("Dark Gray")
//                        }
//                        LabeledSwitch(checked = isDarkMode, onCheckedChange = {isDarkMode = it}){
//                            Text("Dark Mode")
//                        }
                    }
                }
            }
        }
    }
}

