package com.example.praktikum3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.shape.CircleShape

@Composable
fun TugasLogin(modifier: Modifier = Modifier) {
    val bgImage = painterResource(id = R.drawable.gambar_background)
    val logoInstitusi = painterResource(id = R.drawable.gambar_logo)
    val photoLingkaran = painterResource(id = R.drawable.gambar_pemandangan)

    Box(modifier = modifier.fillMaxSize()) {
        Image(
            painter = bgImage,
            contentDescription = "Background",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }

    Column(
        modifier = Modifier.fillMaxSize().padding(top = 80.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Login",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Blue
        )

        Text(
            text = "Ini adalah halaman login,",
            fontSize = 16.sp,
            color = Color.White
        )
    }

    Spacer(
        modifier = Modifier.height(30.dp)
    )

    Image(
        painter = logoInstitusi,
        contentDescription = "Logo",
        modifier = Modifier.size(130.dp)
    )

    Spacer(
        modifier = Modifier.height(20.dp)
    )

    Text(
        text = "Nama",
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Red
    )

    Text(
        text = "Derek Dzakir Cadudasa",
        fontSize = 22.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Blue
    )

    Text(
        text = "20240140018",
        fontSize = 26.sp,
        fontWeight = FontWeight.ExtraBold,
        color = Color.Black
    )

    Spacer(modifier = Modifier.height(40.dp))
    Image(
        painter = photoLingkaran,
        contentDescription = "Foto Lingkaran",
        contentScale = ContentScale.Crop,
        modifier = Modifier.size(220.dp).clip(CircleShape)
    )
}