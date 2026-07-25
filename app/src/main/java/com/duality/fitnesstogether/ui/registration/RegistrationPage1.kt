package com.duality.fitnesstogether.ui.registration

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.duality.fitnesstogether.R
import com.duality.fitnesstogether.util.TextSnippets

@Composable
fun RegistrationPage1(
    onNext: () -> Unit,
    onBack: () -> Unit
) {
    var name by remember { mutableStateOf("") }

    RegistrationHeader { onBack() }

    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize().padding(horizontal = 25.dp)
    ) {
        Text(
            text = stringResource(R.string.fillInfoAboutYourself),
            fontFamily = TextSnippets.robotoFont,
            fontWeight = FontWeight.Medium,
            fontSize = 20.sp,
            color = colorResource(R.color.black)
        )

        Spacer(modifier = Modifier.height(33.dp))

        OutlinedTextField(
            value = name,
            onValueChange = {name = it},
            placeholder = {
                Text(
                    text = stringResource(R.string.name),
                    fontFamily = TextSnippets.robotoFont,
                    fontWeight = FontWeight.Normal,
                    fontSize = 15.sp,
                    color = colorResource(R.color.placeholderGray)
                )
            },
            shape = RoundedCornerShape(20.dp),
            colors = TextFieldDefaults.colors(
                unfocusedIndicatorColor = colorResource(R.color.containerGray),
                focusedIndicatorColor = colorResource(R.color.orange),
                unfocusedContainerColor = colorResource(R.color.white),
                focusedContainerColor = colorResource(R.color.white)
            ),
            textStyle = TextStyle(
                fontFamily = TextSnippets.robotoFont,
                fontWeight = FontWeight.Medium,
                fontSize = 15.sp,
                color = colorResource(R.color.black)
            )
        )

        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "error")
        }
    }
}