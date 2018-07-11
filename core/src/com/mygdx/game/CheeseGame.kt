package com.mygdx.game

import com.badlogic.gdx.Game

class CheeseGame: Game() {
    override fun create() {
        setScreen(CheeseLevel(this))
    }
}