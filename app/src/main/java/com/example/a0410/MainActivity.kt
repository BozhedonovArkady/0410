package com.example.a0410

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a0410.ui.theme._0410Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _0410Theme {
                Scaffold(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0xFFF2E8CE)) // Светло-зеленый цвет
                ) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize()
                            .background(Color(0xFFF2E8CE)),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceBetween // Распределение по вертикали
                    ) {
                        // Верхняя часть с изображением и текстом
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f), // Занять доступное пространство
                            horizontalAlignment = Alignment.CenterHorizontally, // Центрирование содержимого
                            verticalArrangement = Arrangement.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.arka),
                                contentDescription = null,
                                modifier = Modifier.size(200.dp) // Размер изображения
                            )
                            Spacer(modifier = Modifier.height(5.dp))
                            Text(
                                text = stringResource(id = R.string.name),
                                style = MaterialTheme.typography.bodyLarge.copy(fontSize = 24.sp),
                                textAlign = TextAlign.Center
                            )
                            Spacer(modifier = Modifier.height(5.dp))
                            Text(
                                text = stringResource(id = R.string.apple),
                                style = MaterialTheme.typography.bodyMedium.copy(fontSize = 12.sp),
                                textAlign = TextAlign.Center
                            )
                        }


                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 100.dp, end = 16.dp), // Отступы для удобства
                            horizontalAlignment = Alignment.Start, // Выровнять по левому краю
                            verticalArrangement = Arrangement.SpaceEvenly // Вертикальное распределение
                        ) {
                            Spacer(modifier = Modifier.height(16.dp))
                            ContactItem(iconId = R.drawable.telefon, text = stringResource(id = R.string.contact))
                            ContactItem(iconId = R.drawable.podelitsa, text = stringResource(id = R.string.mail))
                            ContactItem(iconId = R.drawable.papka, text = stringResource(id = R.string.pochta))
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun ContactItem(iconId: Int, text: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = iconId),
            contentDescription = null,
            modifier = Modifier.size(24.dp) // Размер иконки
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = text,
            style = MaterialTheme.typography.bodyMedium.copy(fontSize = 12.sp),
            textAlign = TextAlign.Left
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    _0410Theme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF2E8CE)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween // Распределение по вертикали
        ) {
            // Верхняя часть с изображением и текстом
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f), // Занять доступное пространство
                horizontalAlignment = Alignment.CenterHorizontally, // Центрирование содержимого
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.dr),
                    contentDescription = null,
                    modifier = Modifier.size(200.dp) // Размер изображения
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = stringResource(id = R.string.name),
                    style = MaterialTheme.typography.bodyLarge.copy(fontSize = 28.sp),
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = stringResource(id = R.string.apple),
                    style = MaterialTheme.typography.bodyMedium.copy(fontSize = 12.sp),
                    textAlign = TextAlign.Center
                )
            }

            // Контактная информация в превью
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 100.dp, end = 16.dp), // Отступы для удобства
                horizontalAlignment = Alignment.Start, // Выровнять по левому краю
                verticalArrangement = Arrangement.SpaceEvenly // Вертикальное распределение
            ) {
                Spacer(modifier = Modifier.height(16.dp))
                ContactItem(iconId = R.drawable.telefon, text = stringResource(id = R.string.contact))
                ContactItem(iconId = R.drawable.podelitsa, text = stringResource(id = R.string.mail))
                ContactItem(iconId = R.drawable.telefon, text = stringResource(id = R.string.pochta))
            }
        }
    }
}