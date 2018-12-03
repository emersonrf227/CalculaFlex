package br.com.emerson.calculaflex.extentions

fun Double.format(digits: Int) = String.format("%.${digits}f", this)
