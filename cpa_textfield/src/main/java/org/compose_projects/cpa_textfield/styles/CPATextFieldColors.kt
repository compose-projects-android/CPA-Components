package org.compose_projects.cpa_textfield.styles

import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.sp
import cpa_theme_default_textFocused
import cpa_theme_default_textUnFocused
import cpa_theme_default_textSelection_handleColor
import cpa_theme_default_unSelectedFieldBorder
import cpa_theme_default_containerFocused
import cpa_theme_default_containerUnFocused
import cpa_theme_default_cursorColor
import cpa_theme_default_selectedFieldBorder
import cpa_theme_default_textSelection_background
import org.compose_projects.cpa_textfield.config.CPAColors

object CPATextFieldColors {

    //estilos oscuros
    val defaultStyle: CPAColors
        get() = object :
            CPAColors {
            override val imeAction: ImeAction = ImeAction.Done
            override val textFocused: Color = cpa_theme_default_textFocused
            override val textUnFocused: Color = cpa_theme_default_textUnFocused
            override val containerFocused: Color = cpa_theme_default_containerFocused
            override val containerUnFocused: Color = cpa_theme_default_containerUnFocused
            override val cursorColor: Color = cpa_theme_default_cursorColor
            override val colorSelectText: TextSelectionColors =
                TextSelectionColors(
                    handleColor = cpa_theme_default_textSelection_handleColor,
                    backgroundColor = cpa_theme_default_textSelection_background
                )
            override val selectedFieldBorder: Color = cpa_theme_default_selectedFieldBorder
            override val unSelectedFieldBorder: Color = cpa_theme_default_unSelectedFieldBorder
            override val textStyle: TextStyle = TextStyle(
                fontSize = 15.sp,
                color = Color.White.copy(alpha = 0.85F)
            )
        }

}