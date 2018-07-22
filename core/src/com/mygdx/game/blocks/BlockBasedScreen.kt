package com.mygdx.game.blocks

import com.mygdx.game.cheese.BaseScreen

class BlockBasedScreen(game: BlockBasedGame): BaseScreen(game) {


    override fun create() {
        mainStage.addActor(SetExpressionBlockActor().apply {
            setPosition(200f, 320f)
        })

        mainStage.addActor(SetExpressionBlockActor().apply {
            setPosition(100f, 300f)
            width = 200f
            height = region.texture.height.toFloat() + 40
        })
    }

    override fun update(dt: Float) {
    }
}