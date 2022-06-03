package com.example.daggertest2.first_layer

import javax.inject.Inject

class DatabaseHelper @Inject constructor(private val repository: Repository) {
}