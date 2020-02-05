package br.com.rteodorodev.internal

import android.content.Context
import android.widget.Toast


/**
 * How to create your own Android Library and publish it
 * https://medium.com/@anujguptawork/how-to-create-your-own-android-library-and-publish-it-750e0f7481bf
 * https://jitpack.io/#rodrigoteodoro/TesteAndroidLibrary/0.1.0
 */

class TesteInternal {

    companion object {

        const val TAG = "TesteInternal"

    }

    fun teste(c : Context) {

        val versao = "$TAG versão ${BuildConfig.VERSION_NAME}"
        Toast.makeText(c, versao, Toast.LENGTH_SHORT).show();

    }

}