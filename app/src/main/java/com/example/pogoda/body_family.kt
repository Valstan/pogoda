package com.example.pogoda

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


@Composable
fun BodyFamily() {

    val one = listOf(
        "А не пора ли вам отдохнуть на курортах Краснодарского края? Тогда бегом к нам" + " за билетами!",
        R.drawable.photo,
        "NonaMe: Чо за шмары?",
        5,
        125
    )
    val one2 = listOf(
        "Это вторая запись в этой ленте новостей. Из нее вы ничего толком не узнаете," + " кроме того, что она вечно вторая." + "\nНо если пролистать наверх, то она вполне себе может стать и первой!!!",
        R.drawable.photo10,
        "Санитар: Ничего не понял, да и неинтерсно вовсе..." + " Фотки поменяйте, люди из-за вас в туалет бегают...",
        2,
        456
    )
    val one3 = listOf(
        "Когда, стройна и светлоока,\n" + "Передо мной стоит она…\n" + "Я мыслю: «В день Ильи-пророка\n" + "Она была разведена!»",
        R.drawable.photo2,
        "Пускай поспешит развестись,\n" + "Пока её жизнь не загублена.\n" + "А ты, если холост, женись\n" + "И будь неразлучен с возлюбленной.",
        18,
        45
    )
    val one4 = listOf(
        "В Академии наук\n" + "Заседает князь Дундук.\n" + "Говорят, не подобает\n" + "Дундуку такая честь;\n" + "Почему ж он заседает?\n" + "Потому что <жопа> есть.",
        R.drawable.photo3,
        "Велосипедист — Ах, братец, на месте твоём\n" + "И я бы сказал то же самое…\n" + "Но, знаешь, беда моя в том,\n" + "Что эта злодейка — жена моя.",
        1,
        1089
    )
    val one5 = listOf(
        "В крови горит огонь желанья,\n" + "Душа тобой уязвлена,\n" + "Лобзай меня: твои лобзанья\n" + "Мне слаще мирра и вина.\n" + "Склонись ко мне главою нежной,\n" + "И да почию безмятежный,\n" + "Пока дохнет веселый день\n" + "И двигнется ночная тень.",
        R.drawable.photo4,
        "Велосипедист - Позарастали\n" + "Стежки-дорожки,\n" + "Где разбегались\n" + "Мы от бомбежки.\n" + "\n" + "Позарастали\n" + "Мохом-травою\n" + "Окопы наши\n" + "Перед Москвою.",
        35,
        54
    )
    val one6 = listOf(
        "Кто мне пришлет ее портрет,\n" + "Черты волшебницы прекрасной?\n" + "Талантов обожатель страстный,\n" + "Я прежде был ее поэт.\n" + "С досады, может быть, неправой,\n" + "Когда одна в дыму кадил\n" + "Красавица блистала славой.\n" + "Я свистом гимны заглушил.\n" + "Погибни злобы миг единый,\n" + "Погибни лиры ложный звук:\n" + "Она виновна, милый друг,\n" + "Пред Селименой и Моиной.\n" + "Так легкомысленной душой,\n" + "О боги! смертный вас поносит;\n" + "Но вскоре трепетной рукой\n" + "Вам жертвы новые приносит.",
        R.drawable.photo5,
        "Велосипедист - Водою черной\n" + "Полны землянки,\n" + "Где мы сушили\n" + "В тот год портянки." + "",
        12,
        68
    )

    LazyColumn(
        modifier = Modifier
            .background(Color.Gray)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        itemsIndexed(
            listOf(one, one2, one3, one4, one5, one6)
        ) { _, item ->
            ListName(
                item[0] as String, item[1] as Int, item[2] as String, item[3] as Int, item[4] as Int
            )
        }
    }
}