package com.example.dictionary.feature_dictionary.data.remote.dto

import com.example.dictionary.feature_dictionary.domain.model.Definition

data class DefinitionDto(
    val antonyms: List<String>,
    val definition: String,
    val synonyms: List<Any>
){
    fun toDefinition():Definition{
        return Definition(
            antonyms = antonyms,
            definition = definition,
            synonyms = synonyms
        )
    }
}