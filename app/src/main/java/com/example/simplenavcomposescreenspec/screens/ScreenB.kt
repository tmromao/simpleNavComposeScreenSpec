package com.example.simplenavcomposescreenspec.screens

import android.content.res.Configuration
import androidx.compose.foundation.layout.Box
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.simplenavcomposescreenspec.ui.theme.SimpleNavComposeScreenSpecTheme

@Composable
fun screenBScreenContent(
    scaffoldState: ScaffoldState = rememberScaffoldState(),
) {
    Box() {
        Text("ScreenB")
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
private fun screenBPreview() {
    SimpleNavComposeScreenSpecTheme {
        Surface {
            screenBScreenContent()
        }
    }
}