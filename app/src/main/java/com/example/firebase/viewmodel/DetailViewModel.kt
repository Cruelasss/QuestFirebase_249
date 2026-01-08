@file:OptIn(InternalSerializationApi::class)

package com.example.firebase.viewmodel

sealed interface StatusUIDetail {
    data class Success(val satusiswa: Siswa?) : StatusUIDetail
    object Error : StatusUIDetail
    object Loading : StatusUIDetail
}
