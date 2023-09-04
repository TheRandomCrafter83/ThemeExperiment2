package com.coderzf1.themeexperiment2.composables

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LabeledSwitch(modifier: Modifier = Modifier, checked:Boolean, onCheckedChange:(Boolean)->Unit,labelContent:@Composable RowScope.() -> Unit){
    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
        Row(content = labelContent, verticalAlignment = Alignment.CenterVertically)
        Spacer(modifier = Modifier.width(8.dp))
        Switch(checked = checked, onCheckedChange = onCheckedChange)
    }
}