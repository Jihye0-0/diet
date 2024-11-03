package com.example.diet.view

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DietCalender() {

    val datePickerState = rememberDatePickerState()

    val date = DatePickerDialog(
        onDismissRequest = { },
        confirmButton = {
            TextButton(onClick = {


//                val d = datePickerState.selectableDates
//                Log.d("jihye", "selected date : " +  d)

            }) {
                Text("OK")
            }
        },
        dismissButton = { }
    ) {

        DatePicker(
            state = datePickerState,
            showModeToggle = false,     // 날짜 선택 모드 변경
            headline = {
                Text(
                    "나의 다이어트 일기",
                    modifier = Modifier.padding(start = 24.dp),
                    fontSize = 20.sp,
                    color = Color.Gray
                )
            }
        )
    }
}