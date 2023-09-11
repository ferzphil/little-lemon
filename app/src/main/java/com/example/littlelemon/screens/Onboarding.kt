package com.example.littlelemon.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.littlelemon.R
import com.example.littlelemon.components.PersonalInformationInput
import com.example.littlelemon.components.SubmitButton
import com.example.littlelemon.navigation.Profile

@Composable
fun Onboarding(navController: NavHostController) {
    // Container for onboarding page
    Column {
        Header()
        PersonalInformationOnboarding(navController)
    }
}

@Composable
fun Header() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        // Logo
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "logo",
            contentScale = ContentScale.Fit,
            alignment = Alignment.Center,
            modifier = Modifier
                .size(200.dp, 95.dp)
        )
        // Header Text
        Text(
            text = "Let's get to know you",
            textAlign = TextAlign.Center,
            color = Color.White,
            fontSize = 24.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF495E57))
                .padding(vertical = 40.dp)

        )
    }
}

@Composable
fun PersonalInformationOnboarding(navController: NavHostController) {
    // Mutable state values
    val firstName = remember {
        mutableStateOf("")
    }
    val lastName = remember {
        mutableStateOf("")
    }
    val email = remember {
        mutableStateOf("")
    }
    val showErrorMessage = remember {
        mutableStateOf(false)
    }
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        // Text Field input
        Column() {
            Text(
                text = "Personal information",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                modifier = Modifier
                    .padding(horizontal = 15.dp, vertical = 40.dp)
            )
            PersonalInformationInput(inputDescription = "First name", innerText = firstName, isEnabled = true)
            PersonalInformationInput(inputDescription = "Last name", innerText = lastName, isEnabled = true)
            PersonalInformationInput(inputDescription = "Email", innerText = email, isEnabled = true)
            val text = if (showErrorMessage.value) { "Registration unsuccessful. Please enter all data." } else {""}
            Text(
                modifier = Modifier.padding(10.dp),
                text = text,
                color = Color.Red,
            )
        }

        // Register Button
        SubmitButton(text = "Register", onClick = {
            if (firstName.value.isBlank() || lastName.value.isBlank() || email.value.isBlank()) {
                showErrorMessage.value = true
            } else {
                showErrorMessage.value = false
                navController.navigate(Profile.route)
            }
        })
    }
}

@Preview(showBackground = true)
@Composable
fun OnboardingPreview() {
    val navController = rememberNavController()
    Onboarding(navController = navController)
}