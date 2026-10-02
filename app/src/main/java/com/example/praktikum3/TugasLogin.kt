package com.example.praktikum3

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

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
}