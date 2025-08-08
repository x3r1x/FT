package com.duality.fitnesstogether.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.duality.fitnesstogether.R
import com.duality.fitnesstogether.util.TextSnippets

@SuppressLint("ResourceAsColor")
@Composable
fun GreetingMenuScreen(
    navigateToRegistration: () -> Unit,
    navigateToLogin: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier.height(250.dp),
            verticalAlignment = Alignment.Bottom
        ) {
            Text(
                text = stringResource(R.string.fitness),
                color = colorResource(R.color.black),
                fontSize = 32.sp,
                fontFamily = TextSnippets.robotoFont,
                fontWeight = FontWeight.SemiBold
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = stringResource(R.string.together),
                color = colorResource(R.color.orange),
                fontSize = 32.sp,
                fontFamily = TextSnippets.robotoFont,
                fontWeight = FontWeight.SemiBold
            )
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier.height(200.dp)
        ) {
            Button(
                onClick = navigateToRegistration,
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.orange)),
                modifier = Modifier.height(54.dp).width(341.dp),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text(
                    text = stringResource(R.string.register),
                    fontSize = 16.sp,
                    color = colorResource(R.color.white),
                    fontFamily = TextSnippets.robotoFont,
                    fontWeight = FontWeight.SemiBold
                )
            }

            Spacer(modifier = Modifier.height(12.5.dp))

            OutlinedButton(
                onClick = navigateToLogin,
                modifier = Modifier.height(height = 54.dp).width(width = 341.dp),
                border = BorderStroke(1.5.dp, colorResource(R.color.orange)),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text(
                    text = stringResource(R.string.login),
                    fontSize = 16.sp,
                    color = colorResource(R.color.orange),
                    fontFamily = TextSnippets.robotoFont,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
    }
}