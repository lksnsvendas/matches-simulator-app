package com.lukas.simulator.domain

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Match(
    @SerializedName("descrição")
    val description: String,
    @SerializedName("Local")
    val place: Place,
    @SerializedName("Mandante")
    val homeTeam: Team,
    @SerializedName("Visitante")
    val awayTeam: Team
) : Parcelable