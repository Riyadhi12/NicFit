package com.example.nicfit.firebase

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FirebaseViewModel @Inject constructor(
    private val repository: AuthRepository
): ViewModel() {
    private val _state = Channel<loginstate>()
    val state = _state.receiveAsFlow()


    fun loginUser(email: String, password: String, callback: (Boolean) -> Unit) {
        viewModelScope.launch {
            repository.loginUser(email, password).collect {
                when (it) {
                    is Resource.Error -> {
                        _state.send(loginstate(error = it.message.toString()))
                        callback(false)
                    }

                    is Resource.Loading -> {
                        _state.send(loginstate(loading = true))
                    }

                    is Resource.Success -> {
                        _state.send(loginstate(success = "Login Berhasil"))
                        callback(true)
                    }
                }
            }
        }
    }

    fun registerUser(email: String, password: String, home: () -> Unit) {
        viewModelScope.launch {
            repository.registerUser(email, password).collect {
                when (it) {
                    is Resource.Error -> {
                        _state.send(loginstate(error = it.message.toString()))
                    }

                    is Resource.Loading -> {
                        _state.send(loginstate(loading = true))
                    }

                    is Resource.Success -> {
                        _state.send(loginstate(success = "Daftar Berhasil"))
                        home()
                    }
                }
            }
        }
    }
}