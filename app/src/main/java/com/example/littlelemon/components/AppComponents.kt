package com.example.littlelemon.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PersonalInformationInput(inputDescription: String,innerText: MutableState<String>,isEnabled: Boolean) {
    Column(
        modifier = Modifier
            .padding(15.dp)
    ) {
        Text(text = inputDescription, modifier = Modifier.padding(bottom = 5.dp), fontSize = 16.sp)
        BasicTextField(
            value = innerText.value,
            onValueChange = { innerText.value = it },
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .border(1.dp, Color.Black, RoundedCornerShape(10.dp))
                .padding(15.dp),

            textStyle = TextStyle.Default.copy(fontSize = 16.sp),
            enabled = isEnabled
        )
    }
}

@Composable
fun SubmitButton(text: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFF4CE14)),
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
            .clip(RoundedCornerShape(15.dp))
    ) {
        Text(text = text, fontSize = 18.sp)
    }
}