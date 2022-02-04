package com.example.simplenavcomposescreenspec.screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.NavDeepLink
import com.example.simplenavcomposescreenspec.R

object ScreenAScreenSpec : BottomNavScreenSpec {

    override val navHostRoute: String = "screenA"

    override val deepLinks: List<NavDeepLink> = emptyList()

    override val icon: ImageVector = Icons.Outlined.Star

    //TODO: CHANGE to the correct label
    override val label: Int = R.string.screenA

    @Composable
    override fun TopBar(navController: NavController, navBackStackEntry: NavBackStackEntry) {}

    @Composable
    override fun Content(navController: NavController, navBackStackEntry: NavBackStackEntry) {

        val scaffoldState = rememberScaffoldState()

        val context = LocalContext.current

        screenAScreenContent(
            scaffoldState = scaffoldState,
        )
    }
}
