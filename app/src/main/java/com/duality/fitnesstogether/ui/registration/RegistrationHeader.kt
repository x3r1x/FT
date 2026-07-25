package com.duality.fitnesstogether.ui.registration

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.duality.fitnesstogether.R
import com.duality.fitnesstogether.util.TextSnippets

@Composable
fun RegistrationHeader(
    onBack: () -> Unit
) {
    OutlinedButton(
        onClick = onBack,
        shape = RoundedCornerShape(10.dp),
        border = BorderStroke(1.5.dp, colorResource(R.color.gray)),
        modifier = Modifier.size(40.dp).offset(x = 25.dp, y = 50.dp),
        contentPadding = PaddingValues(1.dp)
    ) {
        Icon(
            bitmap = ImageBitmap.imageResource(R.drawable.back_icon),
            contentDescription = "BackIcon",
            modifier = Modifier.height(17.dp).width(10.dp),
            tint = colorResource(R.color.gray)
        )
    }

    Row(
        modifier = Modifier.padding(vertical = 50.dp).fillMaxWidth().height(43.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            text = stringResource(R.string.registration),
            fontFamily = TextSnippets.robotoFont,
            fontWeight = FontWeight.SemiBold,
            fontSize = 24.sp,
            color = colorResource(R.color.black)
        )
    }
}