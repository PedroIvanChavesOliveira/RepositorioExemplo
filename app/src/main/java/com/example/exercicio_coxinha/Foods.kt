package com.example.exercicio_coxinha

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Foods(val image: String, val name: String, val value: Double): Parcelable {}