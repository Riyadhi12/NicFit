package com.example.nicfit.searchBar

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue


//@Composable
//fun searchbar() {
//    var text by remember { mutableStateOf("") }
//    var active by remember { mutableStateOf(false) }
//
//    Scaffold {
//        SearchBar(
//            query = text,
//            onQueryChange = {
//                            text = it
//            },
//            onSearch = {
//                   active = false
//            },
//            active = active ,
//            onActiveChange = {
//                active = it
//            }
//        ){
//
//        }
//    }
//}