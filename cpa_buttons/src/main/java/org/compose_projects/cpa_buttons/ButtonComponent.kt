package org.compose_projects.cpa_buttons

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun CPAButton(
    text: String,
    onClick: () -> Unit
) {
    Button(onClick = { onClick() }) {
        Text(text = text)
    }
}