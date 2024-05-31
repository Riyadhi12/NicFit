package com.example.nicfit.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nicfit.R
import com.example.nicfit.componentsTS.poppinFamily

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomizedSearchBar(
    keyword: String,
    onKeywordChange: (String) -> Unit,
    modifier: Modifier
) {
    Box(){
        Card(
            modifier = modifier
                .padding(12.dp)
                .fillMaxWidth()
                .height(64.dp),
            backgroundColor = Color.White,
            elevation = 4.dp,
            shape = RoundedCornerShape(20)
            )
        {
        }
        OutlinedTextField(
            value = keyword,
            onValueChange = onKeywordChange,
            singleLine = true,
            leadingIcon = {
                Icon(imageVector = Icons.Filled.Search, contentDescription = "")
            },
            placeholder = {
                Text(text = stringResource(id = R.string.search_consultant), fontFamily = poppinFamily, fontStyle = FontStyle.Normal)
            },
            modifier = modifier
                .padding(12.dp)
                .fillMaxWidth()
                .height(62.dp)
                .clip(
                    RoundedCornerShape(12.dp)
                )
            ,
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color.White,
                focusedContainerColor = Color.White,
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent
            )
        )
    }
}

@Preview
@Composable
fun CustomizedSearchBarPreview() {
    CustomizedSearchBar(keyword = "", onKeywordChange = {}, modifier = Modifier)
}