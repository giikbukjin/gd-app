package com.example.gd.Button

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gd.ui.theme.suite

@Composable
fun FollowButton(isUserPage: Boolean = false) {
    var isFollowing by remember { mutableStateOf(true) }

    val buttonColors = if (isFollowing) {
        ButtonDefaults.buttonColors(
            backgroundColor = Color.White
        )
    } else {
        ButtonDefaults.buttonColors(
            backgroundColor = MaterialTheme.colors.primaryVariant
        )
    }

    OutlinedButton(
        onClick = { isFollowing = !isFollowing },
        colors = buttonColors,
        modifier = if (isUserPage){
            Modifier
                .padding(start = 0.dp, end = 0.dp)
                .fillMaxWidth()
        } else{
            Modifier.size(80.dp, 40.dp)
              },
        shape = RoundedCornerShape(30)
    ) {
        Text(
            text = if (isFollowing) "팔로우" else "팔로잉",
            color = if (isFollowing) Color.Black else Color.White,
            fontFamily = suite,
            fontWeight = FontWeight.SemiBold,
            fontSize = 15.sp,
        )
    }
}

