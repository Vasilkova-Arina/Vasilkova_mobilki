package com.example.pr01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.pr01.ui.theme.PR01Theme
import com.example.pr01.ui.theme.viewmodel.UserViewModel
import com.example.pr01.usersmodel.service.UserAdd

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //pr01
            //val userViewModel: UserViewModel = viewModel()
            //userViewModel.fetch()

            //pr02
            val userViewModel: UserViewModel = viewModel()

            val user = UserAdd(
                Id = 31,
                Task = "Пропылесосить ковер",
                Mark = "Нет"
            )

            userViewModel.userTask(user)
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PR01Theme {
        Greeting("Android")
    }
}