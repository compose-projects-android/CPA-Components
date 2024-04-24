package org.compose_projects.cpa_textfield.config

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.Dp

interface CPASizes {
    val height: Dp
    val width: Dp
    val shape: RoundedCornerShape
    val maxLines: Int
    val maxChar: Int

}