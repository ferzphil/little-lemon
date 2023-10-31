package com.example.littlelemon.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemon.MenuItem
import com.example.littlelemon.R
import com.example.littlelemon.ui.theme.GreenColorLittleLemon
import com.example.littlelemon.ui.theme.GreyColorLittleLemon
import com.example.littlelemon.ui.theme.OrangeColorLittleLemon
import com.example.littlelemon.ui.theme.Typography

@Composable
fun Home() {
    Column(modifier = Modifier.fillMaxSize()) {
        HomeHeader()
        HeroSection()
    }
}


@Composable
fun HomeHeader() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround,
    ) {
        Spacer(modifier = Modifier.size(26.dp))
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "logo",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(200.dp, 95.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.profile),
            contentDescription = "profile",
            contentScale = ContentScale.Fit,

            modifier = Modifier
                .clip(CircleShape)
                .size(50.dp, 50.dp)
        )
    }
}


@Composable
fun HeroSection() {
    Column(modifier = Modifier.fillMaxWidth().background(GreenColorLittleLemon).padding(10.dp)) {
        Text(text = "Little Lemon", style = Typography.subtitle1, color = OrangeColorLittleLemon)
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
        ) {
            Column (modifier = Modifier.fillMaxWidth(0.65f)) {
                Text(text = "Chicago", style = Typography.h2, color = GreyColorLittleLemon)
                Text(
                    modifier = Modifier.padding(top = 10.dp),
                    text = "We are a family-owned Mediterranean restaurant, " +
                            "focused on traditional recipes " +
                            "served with a modern twist",
                    color = GreyColorLittleLemon,
                    style = Typography.h5
                )
            }
            Image(
                painter = painterResource(R.drawable.hero),
                contentDescription = "hero image",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .clip(RoundedCornerShape(10.dp))
                    .size(130.dp, 130.dp)
            )
        }
    }
}


@Composable
fun MenuItems(menuItems: List<MenuItem>) {
    
}










