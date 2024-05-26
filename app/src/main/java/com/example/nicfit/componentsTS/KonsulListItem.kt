package com.example.nicfit.components

import android.graphics.drawable.shapes.RectShape
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nicfit.R

@Composable
fun KonsulListItem(
    modifier: Modifier
) {
    Card(
        colors = CardDefaults.cardColors(Color.White),
        modifier = modifier.fillMaxWidth().padding(12.dp),
        elevation = CardDefaults.cardElevation(8.dp)
        ) {
        Column(
            modifier = modifier.padding(10.dp)
        ){
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.doctor),
                    contentDescription = "",
                    modifier.size(100.dp)
                        .width(50.dp)
                        .padding(8.dp)
                )
                Column {
                    Text(text = stringResource(id = R.string.doctor_name))
                    Text(text = stringResource(id = R.string.doctor_spec))
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row {
                            Box {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_star),
                                    contentDescription = "", modifier.size(17.dp)
                                )
                            }
                            Text(text = " 4.6 Review    ")
                        }
                        Row {
                            Image(
                                painter = painterResource(id = R.drawable.clarity_employee_solid),
                                contentDescription = "",
                                modifier.size(17.dp)
                            )
                            Text(text = " 8 tahun")
                        }

                    }
                }
            }
            Row {
                Image(
                    painter = painterResource(id = R.drawable.ic_clock),
                    contentDescription = "",
                    modifier.size(24.dp)
                )
                Text(text = "Waktu yang tersedia")
            }
        }
    }
}


@Preview
@Composable
fun KonsulListItemPreview() {
    KonsulListItem(modifier = Modifier)
}