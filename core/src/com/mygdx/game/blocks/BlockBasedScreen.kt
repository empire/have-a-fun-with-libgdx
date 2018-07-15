package com.mygdx.game.blocks

import com.mygdx.game.cheese.BaseScreen

class BlockBasedScreen(game: BlockBasedGame): BaseScreen(game) {


    override fun create() {
        mainStage.addActor(BaseBlockActor().apply {
            setPosition(100f, 300f)
        })

        mainStage.addActor(BaseBlockActor().apply {
            setPosition(200f, 100f)
        })
//        actor.addAction(Actions.forever(
//                Actions.sequence(
//                        Actions.scaleTo(1f, 1f, 1f),
//                        Actions.scaleTo(.3f, .3f, 1f)
//                )
//        ))


    }

    override fun update(dt: Float) {
    }
}