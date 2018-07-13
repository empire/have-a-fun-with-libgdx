package com.mygdx.game.cheese

import com.badlogic.gdx.Game

class CheeseGame: Game() {
    override fun create() {
        setScreen(CheeseMenu(this))
    }
}