package com.example.pr01.data.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pr01.ui.theme.FonCards

@Composable
fun Cards(
    modifier: Modifier = Modifier,
    title: String,
    summa: Double
){
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 157.dp, vertical = 253.dp)
            .border(
                width = 15.dp,
                color = FonCards
            ),
        colors = CardDefaults.cardColors(
            containerColor = FonCards
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {

            Text(
                text = title,
                fontSize = 14.sp,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(15.dp))

            Text(
                text = "$ $summa",
                fontSize = 14.sp,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
private fun CardPreview(){
    Cards(
        title = "Black Simple Lamp",
        summa = 12.00
    )
}