package com.example.nicfit.componentsTS

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.nicfit.R
import com.example.nicfit.components.ConfirmationButton

@Composable
fun TemanSehatModalSheet(
    modifier: Modifier,
    imageInt: Int,
    title: String,
    membersCount : String,
    description : String,
    onDismiss : () -> Unit,
    navHostController: NavHostController
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 28.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = modifier.size(16.dp))
        Row(
            modifier = modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(painter = painterResource(id = imageInt), contentDescription = "", modifier = modifier
                .size(56.dp)
                .clip(
                    RoundedCornerShape(40)
                ))
            Column(
                modifier = modifier.padding(start = 16.dp)
            ){
                Text(text = title, fontWeight = FontWeight.Normal, fontFamily = poppinFamily, fontSize = 18.sp)
                Text(text = "$membersCount Members", fontWeight = FontWeight.Normal, fontFamily = poppinFamily, fontSize = 12.sp, color = Color.Gray)
            }
        }
        Text(text = description, fontWeight = FontWeight.Normal, fontFamily = poppinFamily, modifier = modifier.padding(top = 18.dp))
        ConfirmationButton(text = "Kembali", toConfirm = false, onClickButton = {
            navHostController.navigateUp()
        }, modifier = Modifier
            .padding(top = 16.dp)
            .fillMaxWidth())
        ConfirmationButton(text = "Gabung Komunitas", toConfirm = true, onClickButton = onDismiss, modifier = Modifier
            .padding(top = 16.dp)
            .fillMaxWidth())
        Spacer(modifier = modifier.size(24.dp))
    }
}

//@Preview
//@Composable
//fun TemanSehatModalSheetPreview() {
//    TemanSehatModalSheet(Modifier, imageInt = R.drawable.pasukan_berhenti_merokok, title = "Pasukan Berhenti Merokok", membersCount = "4,412", description = "Berbincang santuy tips andtrik untuk berhenti merokok", {})
//}