package com.example.littlelemon.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemon.R
import com.example.littlelemon.components.PersonalInformationInput
import com.example.littlelemon.components.SubmitButton

@Composable
fun Profile() {
    Column(modifier = Modifier.fillMaxWidth()) {
        ProfileHeader()
        PersonalInformationProfile()
    }
}

@Composable
fun ProfileHeader() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "logo",
            contentScale = ContentScale.Fit,
            modifier = Modifier.size(200.dp, 95.dp)
        )
    }

}

@Composable
fun PersonalInformationProfile() {
    // TODO: use sharedPreferences to store data
    val firstName = remember {
        mutableStateOf("asd")
    }
    val lastName = remember {
        mutableStateOf("my last name")
    }
    val email = remember {
        mutableStateOf("my email")
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(
                text = "Personal information",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                modifier = Modifier
                    .padding(horizontal = 15.dp, vertical = 40.dp)
            )
            PersonalInformationInput("First name", firstName, false)
            PersonalInformationInput("Last name", lastName, false)
            PersonalInformationInput("Email", email, false)
        }
        SubmitButton(text = "Log out", onClick = {})

    }
}

@Preview(showBackground = true)
@Composable
fun ProfilePreview() {
    Profile()
}