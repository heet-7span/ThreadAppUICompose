package com.example.threadappuicompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.threadappuicompose.screen.ActivityScreen
import com.example.threadappuicompose.screen.HomeScreen
import com.example.threadappuicompose.screen.NewThreadScreen
import com.example.threadappuicompose.screen.ProfileScreen
import com.example.threadappuicompose.screen.SearchScreen
import com.example.threadappuicompose.ui.theme.ThreadAppUIComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThreadAppUIComposeTheme {
                // A surface container using the 'background' color from the theme
                ThreadApp()
            }
        }
    }

    sealed class DestinationScreen(val route: String) {
        object Home : DestinationScreen("home")
        object Signup : DestinationScreen("signup")
        object Login : DestinationScreen("login")
        object Search : DestinationScreen("search")
        object Profile : DestinationScreen("profile")
        object NewThread : DestinationScreen("new_thread")
        object Activity : DestinationScreen("activity")

    }


    @Composable
    fun ThreadApp() {
        val navController = rememberNavController()
//
       NavHost(navController = navController, startDestination = DestinationScreen.Home.route) {
           composable(DestinationScreen.Home.route) {
               HomeScreen(navController = navController)
           }
           composable(DestinationScreen.NewThread.route) {
               NewThreadScreen(navController = navController)
           }
           composable(DestinationScreen.Search.route) {
               SearchScreen(navController = navController)
           }
           composable(DestinationScreen.Profile.route) {
               ProfileScreen(navController = navController)
           }
           composable(DestinationScreen.Activity.route) {
               ActivityScreen(navController = navController)
           }
//           composable(DestinationScreen.Signup.route) {
//               SignupScreen(navController = navController, vm = vm)
//           }
//            composable(DestinationScreen.Login.route) {
//                LoginScreen(navController = navController, vm = vm)
//            }
//            composable(DestinationScreen.Feed.route) {
//                FeedScreen(navController = navController, vm = vm)
//            }
//            composable(DestinationScreen.Search.route) {
//                SearchScreen(navController = navController, vm = vm)
//            }
//            composable(DestinationScreen.MyPosts.route) {
//                MyPostsScreen(navController = navController, vm = vm)
//            }
//            composable(DestinationScreen.Profile.route) {
//                ProfileScreen(navController = navController, vm = vm)
//            }
//            composable(DestinationScreen.NewPost.route) { navBackStachEntry ->
//                val imageUri = navBackStachEntry.arguments?.getString("imageUri")
//                imageUri?.let {
//                    NewPostScreen(navController = navController, vm = vm, encodedUri = it)
//                }
//            }
//            composable(DestinationScreen.SinglePost.route) {
//                val postData = navController
//                    .previousBackStackEntry
//                    ?.arguments
//                    ?.getParcelable<PostData>("post")
//                postData?.let {
//                    SinglePostScreen(
//                        navController = navController,
//                        vm = vm,
//                        post = postData
//                    )
//                }
//            }
//            composable(DestinationScreen.CommentsScreen.route) { navBackStackEntry ->
//                val postId = navBackStackEntry.arguments?.getString("postId")
//                postId?.let { CommentsScreen(navController = navController, vm = vm, postId = it) }
//            }
        }
    }
}
