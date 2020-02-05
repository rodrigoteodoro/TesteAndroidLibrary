package br.com.rteodorodev.internal

import android.content.Context
import android.widget.Toast

class TesteInternal {

    companion object {

        const val TAG = "TesteInternal"

    }

    fun teste(c : Context) {

        Toast.makeText(c, TAG, Toast.LENGTH_SHORT).show();

    }

}