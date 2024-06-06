package com.example.listwisatasmg.model

data class TouristAttraction(
    val thumbnail: Int,
    val images: ArrayList<Int>,
    val title: String,
    val description: String,
    val address: String,
    val rating: Double,
)
