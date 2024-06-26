package org.compose_projects.components.cpa_textfield.config

import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction

interface CPAColors {
    val imeAction: ImeAction
    val textFocused: Color
    val textUnFocused: Color
    val containerFocused: Color
    val containerUnFocused: Color
    val cursorColor: Color
    val colorSelectText: TextSelectionColors
    val selectedFieldBorder: Color
    val unSelectedFieldBorder: Color
    val textStyle: TextStyle
}
