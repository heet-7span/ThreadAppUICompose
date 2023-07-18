package com.example.threadappuicompose.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController

@Composable
fun SearchScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
        ) {
            Text(text = "Search Screen")
        }
        BottomNavigationMenu(
            selectedItem = BottomNavigationMenu.SEARCH_SCREEN,
            navController = navController
        )
    }

}