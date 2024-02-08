package com.iessanalberto.dam2.proyectodi2.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController){
    Scaffold(topBar = {
        CenterAlignedTopAppBar(
            title = { Text(text = "Home") },
            colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                containerColor = Color.Magenta,
                titleContentColor = MaterialTheme.colorScheme.primary
            ),
        )

    }) { paddingValues ->
        HomeScreenBodyContent(
            modifier = Modifier.padding(paddingValues),
            navController = navController
        )
    }
}

@Composable
fun HomeScreenBodyContent(modifier: Modifier, navController: NavController) {
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
       Text(text = "Home Screen")
    }
}
