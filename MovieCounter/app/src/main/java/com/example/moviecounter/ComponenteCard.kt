package com.example.moviecounter

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
@Composable
fun CardDemo() { Card( modifier = Modifier.fillMaxWidth()
) { Text( text = "Este contenido está dentro de una Card.",
    modifier = Modifier.padding(16.dp) ) } }