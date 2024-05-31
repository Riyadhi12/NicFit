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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nicfit.R
import com.example.nicfit.componentsTS.poppinFamily

@Composable
fun DetailDescriptionHeader (
    modifier: Modifier
){
    Column (
        modifier = modifier.padding(12.dp)
    ){
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = stringResource(id = R.string.doctor_name), fontWeight = FontWeight.Bold, fontFamily = poppinFamily, fontSize = 20.sp)
            Image(painter = painterResource(id = R.drawable.ic_heart), contentDescription = "", modifier = modifier.size(24.dp))
        }
        Text(text = stringResource(id = R.string.doctor_spec),fontWeight = FontWeight.Normal, fontFamily = poppinFamily, fontSize = 14.sp, color = Color.Gray, modifier = modifier)

        Row (
            modifier.padding(top = 4.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Row(Modifier.padding(end = 12.dp),
                verticalAlignment = Alignment.CenterVertically) {
                Image(painter = painterResource(id = R.drawable.ic_star), contentDescription = "", Modifier.size(32.dp).padding(end = 4.dp))
                Text(text = "4.6 Review (100 ulasan)", fontWeight = FontWeight.Normal, fontFamily = poppinFamily, fontSize = 14.sp, modifier = Modifier.padding(top = 4.dp))
            }
            Row(
                verticalAlignment = Alignment.CenterVertically) {
                Image(painter = painterResource(id = R.drawable.clarity_employee_solid), contentDescription = "", Modifier.size(32.dp).padding(end = 4.dp))
                Text(text = "8 tahun", fontWeight = FontWeight.Normal, fontFamily = poppinFamily, fontSize = 14.sp, modifier = Modifier.padding(top = 4.dp))
            }
        }
    }
}

@Preview
@Composable
fun DetailDescriptionHeaderPreview(){
    DetailDescriptionHeader(modifier = Modifier)
}