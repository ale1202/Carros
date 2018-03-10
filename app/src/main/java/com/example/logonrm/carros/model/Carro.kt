package com.example.logonrm.carros.model

import android.accessibilityservice.AccessibilityService
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter

data class Carro(var id: String?,
                 var marca: String,
                 var modelo: String,
                 var ano: Int,
                 var placa:String,
                 var urlImage:String?)