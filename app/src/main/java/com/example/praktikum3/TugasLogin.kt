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

    }
}