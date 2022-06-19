package com.dina.intentactivity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Siswa (
    var nama : String,
    var umur : Int,
    var tinggi : Double,
    var gender : Char,
    var lulus : Boolean


) : Parcelable