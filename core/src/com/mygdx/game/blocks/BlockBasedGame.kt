package com.mygdx.game.blocks

import com.badlogic.gdx.Game

class BlockBasedGame: Game() {
    override fun create() {
        setScreen(BlockBasedScreen(this))
    }
}