package com.vishnu.core.extension

import com.vishnu.core.base.BaseConstants.Companion.EMPTY_STRING

fun String?.getText(): String = this ?: EMPTY_STRING
