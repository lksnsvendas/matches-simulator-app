package com.lukas.simulator.domain

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Team (
    @SerializedName("Nome")
    val name: String,
    @SerializedName("Força")
    val stars: Int,
    @SerializedName("Imagem")
    val image: String,
    var score: Int?
) : Parcelable