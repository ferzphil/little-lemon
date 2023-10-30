package com.example.littlelemon

import androidx.compose.runtime.Composable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable



@Serializable
@SerialName("MenuNetwork")
data class MenuNetwork(
    val menu: List<MenuItemNetwork>
)

@Serializable
@SerialName("MenuItemNetwork")
data class MenuItemNetwork (
    val id: Int,
    val title: String,
    val description: String,
    val price: String,
    val image: String,
    val category: String
)