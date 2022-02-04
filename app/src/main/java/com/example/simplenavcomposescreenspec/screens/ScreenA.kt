package com.example.simplenavcomposescreenspec.screens

import android.content.res.Configuration
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.simplenavcomposescreenspec.ui.theme.SimpleNavComposeScreenSpecTheme
import java.lang.reflect.Modifier

@Composable
fun screenAScreenContent(
    scaffoldState: ScaffoldState = rememberScaffoldState(),
) {
    Box() {
        Text("ScreenA")
    }
}

@Preview(
    name = "Light mode",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    showBackground = true,
)
@Preview(
    name = "Dark mode",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
)
@Composable
private fun screenAPreview() {
    SimpleNavComposeScreenSpecTheme {
        Surface {
            screenAScreenContent()
        }
    }
}