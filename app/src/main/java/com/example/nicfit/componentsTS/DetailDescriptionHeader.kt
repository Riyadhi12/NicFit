package com.example.nicfit.components

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nicfit.R

@Composable
fun DetailDescriptionHeader (
    modifier: Modifier
){
    Column (
        modifier = modifier.padding(12.dp)
    ){
        Log.d("Logging Screen","di detail description header")
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = stringResource(id = R.string.doctor_name))
            Image(painter = painterResource(id = R.drawable.ic_heart), contentDescription = "", modifier = modifier.size(16.dp))
        }
        Text(text = stringResource(id = R.string.doctor_spec))

        Row (
            modifier.padding(top = 12.dp)
        ){
            Row(modifier.padding(end = 12.dp)) {
                Image(painter = painterResource(id = R.drawable.ic_star), contentDescription = "", modifier.size(20.dp).padding(end = 4.dp))
                Text(text = "4.6 Review")
            }
            Row {
                Image(painter = painterResource(id = R.drawable.clarity_employee_solid), contentDescription = "", modifier.size(20.dp).padding(end = 4.dp))
                Text(text = "8 tahun")
            }
        }
    }
}

@Preview
@Composable
fun DetailDescriptionHeaderPreview(){
    DetailDescriptionHeader(modifier = Modifier)
}