package com.example.diet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.ui.Modifier
import com.example.diet.view.DietCalender
import com.example.diet.ui.theme.DietTheme





class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DietTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
//                    topBar = {
//                        TopAppBar(
//                            title = { Text("홈화면")},
//                            colors = topAppBarColors(
//                                containerColor = MaterialTheme.colorScheme.primaryContainer,
//                                titleContentColor = MaterialTheme.colorScheme.primary,
//                            )
//                        )
//                    }
                ) { innerPadding ->

                    val none = innerPadding

                    DietCalender()
//                    TodayFood()


                }
            }
        }
    }
}



//@Preview( showBackground = true, showSystemUi = true )
//
//@Composable
//fun GreetingPreview() {
//    DietTheme {

//    }
//}