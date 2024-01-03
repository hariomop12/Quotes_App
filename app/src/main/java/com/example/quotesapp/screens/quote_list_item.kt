package com.example.quotesapp. screens
import androidx.compose.foundation. background import androidx.compose.foundation. layout. *  import androidx.compose.material3. icons. Filled import androidx.compose.material3. icons. filled. Close import androidx.compose.foundation. layout. Box import androidx.compose.foundation. layout. fillMaxSize import androidx.compose.foundation. layout. height import androidx.compose.foundation. layout. padding import androidx.compose.foundation. layout. size import androidx.compose.foundation. layout. width import androidx.compose.foundation. shape. RoundedCornerShape import androidx.compose.material. icons. Icons import androidx.compose.material. icons. filled. Close import androidx.compose.material3. Card import androidx.compose.material3. CardDefaults import androidx.compose.material3. MaterialTheme import androidx.compose.runtime. Composable import androidx.compose.ui. Alignment import androidx.compose.ui. draw. rotate import androidx.compose.ui. graphics. Color import androidx.compose.ui. graphics. ColorFilter import androidx.compose.ui. tooling. preview. Preview import androidx.compose.ui. unit. dp import androidx.compose.material3. Text import androidx.compose.material3. icons. MaterialIcons import androidx.compose.material3. icons. Filled import androidx.compose.ui. text. font. FontWeight import java.lang.reflect.Modifier
@Preview @Composable fun quoteListItem() { Card( shape = RoundedCornerShape(20. dp) ,  elevation = CardDefaults.elevation(  defaultElevation = 10.dp ) ) { Row(modifier = Modifier.padding(top = 10.dp)) {
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
    Column(modifier = Modifier.width(1f)) {
        Text(
            text = "Time is the most important thing a man can spend",
            style = MaterialTheme.typography.body2,
            modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 10.dp),
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
            style = MaterialTheme.typography.body2,
            fontWeight = FontWeight.Thin,
            color = Color.White,
            modifier = Modifier.padding(top = 10.dp)
        )
    }
}
}
}