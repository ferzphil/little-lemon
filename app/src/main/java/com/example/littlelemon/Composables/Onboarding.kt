package com.example.littlelemon.Composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemon.R

@Composable
fun Onboarding() {

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

    // Container for onboarding page
    Column {
        Header()

        // Column for Input and Register Button
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
                        .padding(horizontal=15.dp, vertical = 40.dp)
                )
                PersonalInformationInput("First name", firstName)
                PersonalInformationInput("Last name", lastName)
                PersonalInformationInput("Email", email)
            }

            // Register Button
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFF4CE14)),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
                    .clip(RoundedCornerShape(15.dp))

            ) {
                Text(text = "Register", fontSize = 18.sp)
            }
        }
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
fun PersonalInformationInput(inputDescription: String, inputValue: MutableState<String>) {
    Column(modifier = Modifier
        .padding(15.dp)
    ) {
    Text(text = inputDescription, modifier = Modifier.padding(bottom = 5.dp), fontSize = 16.sp)
    BasicTextField(
        value = inputValue.value,
        onValueChange = { inputValue.value = it },
//        colors = TextFieldDefaults.textFieldColors(
//            backgroundColor = Color.White,
//        ),
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .border(1.dp, Color.Black, RoundedCornerShape(10.dp))
            .padding(15.dp)
        ,
        textStyle = TextStyle.Default.copy(fontSize = 16.sp)


        )
    }
}


@Preview(showBackground = true)
@Composable
fun OnboardingPreview() {
    Onboarding()
}