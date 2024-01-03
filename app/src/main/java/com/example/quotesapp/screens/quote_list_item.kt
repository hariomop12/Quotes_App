package com.example.quotesapp.screens

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview





@Preview
@Composable
fun quoteListItem() {
    Card(
        shape = RoundedCornerShape(20.dp),
        elevation = CardDefaults.elevation(defaultElevation = 10.dp)
    ) {
        Row(modifier = Modifier.padding(top = 10.dp)) {
            androidx.compose.foundation.Image(
                imageVector = Icons.Filled.Close,
                contentDescription = "Quote",
                modifier = Modifier
                    .size(50.dp)
                    .rotate(45f)
                    .background(Color.Red),
                colorFilter = ColorFilter.tint(Color.White)
            )
            Spacer(modifier = Modifier.padding(10.dp))
            Column {
                Text(
                    text = "Time is the most important thing a man can spend",
                    style = MaterialTheme.typography.body2,
                    modifier = Modifier.padding(bottom = 10.dp),
                    color = Color.White
                )
                Box(
                    modifier = Modifier
                        .background(Color(0xFFE0E0E0))
                        .fillMaxSize(.4f)
                        .height(1.dp)
                )
                Text(
                    text = "Benjamin Franklin",
                    modifier = Modifier.padding(top = 10.dp),
                    color = Color.White,
                    style = MaterialTheme.typography.body2,
                    fontWeight = FontWeight.Thin
                )
            }
        }
    }
}
