package com.example.pr01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.pr01.ui.theme.PR01Theme
import com.example.pr01.usersmodel.Post
import com.example.pr01.usersmodel.viewmodel.PostViewModel
import com.example.pr01.usersmodel.viewmodel.UserViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //pr01
//            val userViewModel: UserViewModel = viewModel()
//            userViewModel.fetch()

            //pr02
//            val postViewModel: PostViewModel = viewModel()
//
//            val post = Post(
//                title = "Уют в каждой детали: встречайте нашу новинку!",
//                body = "Мы знаем, как важно возвращаться туда, где тепло и спокойно. Наша новая коллекция ароматических свечей из соевого воска создана именно для таких моментов.",
//                tags = listOf(
//                    "декор дома",
//                    "уют в доме",
//                    "аромасвечи",
//                    "подарок девушке",
//                    "ручная работа",
//                    "новинка"
//                ),
//                views = 0
//            )
//
//            postViewModel.createPost(post)
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