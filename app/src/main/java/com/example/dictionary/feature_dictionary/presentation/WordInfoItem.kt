package com.example.dictionary.feature_dictionary.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dictionary.feature_dictionary.domain.model.WordInfo

@Composable
fun  WordInfoItem(
    wordInfo: WordInfo,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
    ){
        Text(text = wordInfo.word,
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Black)

        Text(text = wordInfo.phonetic, fontWeight = FontWeight.Light)

        Spacer(modifier = Modifier.height(16.dp))
        Text(text = wordInfo.origin)
        wordInfo.meanings.forEach {
            meaning ->
            Text(meaning.partOfSpeech, fontWeight = FontWeight.Bold)
            meaning.definition.forEachIndexed{index, definition ->
                Text(text = "${index+1}. ${definition.definition}")
            }
            Spacer(Modifier.height(8.dp))
        }

    }
}