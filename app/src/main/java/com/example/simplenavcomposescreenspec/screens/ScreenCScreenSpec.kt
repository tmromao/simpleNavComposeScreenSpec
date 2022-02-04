package com.example.simplenavcomposescreenspec.screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Send
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.NavDeepLink
import com.example.simplenavcomposescreenspec.R

object ScreenCScreenSpec : BottomNavScreenSpec {

    override val navHostRoute: String = "screenC"

    override val deepLinks: List<NavDeepLink> = emptyList()

    override val icon: ImageVector = Icons.Outlined.ShoppingCart

    //TODO: CHANGE to the correct label
    override val label: Int = R.string.screenC

    @Composable
    override fun TopBar(navController: NavController, navBackStackEntry: NavBackStackEntry) {
    }

    @Composable
    override fun Content(navController: NavController, navBackStackEntry: NavBackStackEntry) {

        val scaffoldState = rememberScaffoldState()

        val context = LocalContext.current

        screenCScreenContent(
            scaffoldState = scaffoldState,
        )
    }
}