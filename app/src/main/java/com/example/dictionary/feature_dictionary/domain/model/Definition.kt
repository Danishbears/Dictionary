package com.example.dictionary.feature_dictionary.domain.model

data class Definition(
    val antonyms: List<String>,
    val definition: String,
    val synonyms: List<Any>
)
