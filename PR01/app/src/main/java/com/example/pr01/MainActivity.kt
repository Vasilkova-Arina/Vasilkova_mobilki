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
import com.example.pr01.data.model.Post
import com.example.pr01.data.model.avtoriz.LoginRequest
import com.example.pr01.ui.theme.viewmodel.LoginViewModel
import com.example.pr01.ui.theme.viewmodel.PostViewModel
import com.example.pr01.ui.theme.viewmodel.TodoViewModel
import com.example.pr01.ui.theme.viewmodel.UserViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //pr14
//            val userViewModel: UserViewModel = viewModel()
//            userViewModel.fetch()

            //pr15
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
//                views = 0,
//                userId = 100
//            )
//
//            postViewModel.createPost(post)

            //pr16
//            val todoViewModel: TodoViewModel = viewModel()
//            todoViewModel.todoUpdate()

            //pr17
//            val userViewModel: UserViewModel = viewModel()
//            userViewModel.deleteUser(18)

            //pr18
            val loginViewModel: LoginViewModel = viewModel()
            val loginRequest = LoginRequest(
                identity = "arinavasilkova123@mail.ru",
                password = "1234"
            )
            loginViewModel.login(loginRequest)
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