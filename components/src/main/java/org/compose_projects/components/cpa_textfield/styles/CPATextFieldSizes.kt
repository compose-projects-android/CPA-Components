package org.compose_projects.components.cpa_textfield.styles

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.compose_projects.components.cpa_textfield.config.CPASizes

object CPATextFieldSizes {

    val defaultSize: CPASizes
        get() = object : CPASizes {
            override val maxLines: Int = 1
            override val height: Dp = 56.dp
            override val width: Dp = 260.dp
            override val maxChar: Int = 28
            override val shape: RoundedCornerShape = RoundedCornerShape(25.dp)
        }
    val descriptionSize: CPASizes
        get() = object : CPASizes {
            override val maxLines: Int = 5
            override val height: Dp = 150.dp
            override val width: Dp = 250.dp
            override val maxChar: Int = 150
            override val shape: RoundedCornerShape = RoundedCornerShape(10.dp)
        }

    val bottom_chat: CPASizes
        get() = object : CPASizes {
            override val height: Dp = 55.dp
            override val width: Dp = 300.dp
            override val shape: RoundedCornerShape = RoundedCornerShape(20.dp)
            override val maxLines: Int = 300
            override val maxChar: Int = 10000

        }

}