package org.compose_projects.cpa_textfield.styles

import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.sp
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_default_textFocused
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_default_textUnFocused
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_default_textSelection_handleColor
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_default_unSelectedFieldBorder
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_default_containerFocused
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_default_containerUnFocused
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_default_cursorColor
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_default_selectedFieldBorder
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_default_textSelection_background
import org.compose_projects.cpa_textfield.config.CPAColors
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_default_textColor
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_green_containerFocused
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_green_containerUnFocused
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_green_cursorColor
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_green_selectedFieldBorder
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_green_textColor
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_green_textSelection_background
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_green_textSelection_handleColor
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_green_unSelectedFieldBorder
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_green_textFocused
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_green_textUnFocused
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_red_containerFocused
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_red_containerUnFocused
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_red_cursorColor
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_red_selectedFieldBorder
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_red_textColor
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_red_textFocused
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_red_textSelection_background
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_red_textSelection_handleColor
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_red_textUnFocused
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_red_unSelectedFieldBorder
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_yellow_containerFocused
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_yellow_containerUnFocused
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_yellow_cursorColor
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_yellow_selectedFieldBorder
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_yellow_textColor
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_yellow_textFocused
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_yellow_textSelection_background
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_yellow_textSelection_handleColor
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_yellow_textUnFocused
import org.compose_projects.cpa_textfield.ui.theme.cpa_theme_yellow_unSelectedFieldBorder

object CPATextFieldColors {

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
                color = cpa_theme_default_textColor
            )
        }


    val redStyle: CPAColors
        get() = object :
            CPAColors {
            override val imeAction: ImeAction = ImeAction.Done
            override val textFocused: Color = cpa_theme_red_textFocused
            override val textUnFocused: Color = cpa_theme_red_textUnFocused
            override val containerFocused: Color = cpa_theme_red_containerFocused
            override val containerUnFocused: Color = cpa_theme_red_containerUnFocused
            override val cursorColor: Color = cpa_theme_red_cursorColor
            override val colorSelectText: TextSelectionColors =
                TextSelectionColors(
                    handleColor = cpa_theme_red_textSelection_handleColor,
                    backgroundColor = cpa_theme_red_textSelection_background
                )
            override val selectedFieldBorder: Color = cpa_theme_red_selectedFieldBorder
            override val unSelectedFieldBorder: Color = cpa_theme_red_unSelectedFieldBorder
            override val textStyle: TextStyle = TextStyle(
                fontSize = 15.sp,
                color = cpa_theme_red_textColor
            )
        }

    val yellowStyle: CPAColors
        get() = object :
            CPAColors {
            override val imeAction: ImeAction = ImeAction.Done
            override val textFocused: Color = cpa_theme_yellow_textFocused
            override val textUnFocused: Color = cpa_theme_yellow_textUnFocused
            override val containerFocused: Color = cpa_theme_yellow_containerFocused
            override val containerUnFocused: Color = cpa_theme_yellow_containerUnFocused
            override val cursorColor: Color = cpa_theme_yellow_cursorColor
            override val colorSelectText: TextSelectionColors =
                TextSelectionColors(
                    handleColor = cpa_theme_yellow_textSelection_handleColor,
                    backgroundColor = cpa_theme_yellow_textSelection_background
                )
            override val selectedFieldBorder: Color = cpa_theme_yellow_selectedFieldBorder
            override val unSelectedFieldBorder: Color = cpa_theme_yellow_unSelectedFieldBorder
            override val textStyle: TextStyle = TextStyle(
                fontSize = 15.sp,
                color = cpa_theme_yellow_textColor
            )
        }

    val greenStyle: CPAColors
        get() = object :
            CPAColors {
            override val imeAction: ImeAction = ImeAction.Done
            override val textFocused: Color = cpa_theme_green_textFocused
            override val textUnFocused: Color = cpa_theme_green_textUnFocused
            override val containerFocused: Color = cpa_theme_green_containerFocused
            override val containerUnFocused: Color = cpa_theme_green_containerUnFocused
            override val cursorColor: Color = cpa_theme_green_cursorColor
            override val colorSelectText: TextSelectionColors =
                TextSelectionColors(
                    handleColor = cpa_theme_green_textSelection_handleColor,
                    backgroundColor = cpa_theme_green_textSelection_background
                )
            override val selectedFieldBorder: Color = cpa_theme_green_selectedFieldBorder
            override val unSelectedFieldBorder: Color = cpa_theme_green_unSelectedFieldBorder
            override val textStyle: TextStyle = TextStyle(
                fontSize = 15.sp,
                color = cpa_theme_green_textColor
            )
        }

}