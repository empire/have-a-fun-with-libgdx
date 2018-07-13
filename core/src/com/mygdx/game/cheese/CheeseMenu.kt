package com.mygdx.game.cheese

import com.badlogic.gdx.Input
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.scenes.scene2d.actions.Actions
import com.badlogic.gdx.scenes.scene2d.ui.Label
import com.mygdx.game.cheese.actors.BaseActor

class CheeseMenu(game: CheeseGame) : BaseScreen(game) {
    private lateinit var floor: BaseActor

    private lateinit var titleText: BaseActor
    private lateinit var instructions: Label
    override fun create() {
        floor = BaseActor().apply {
            setTexture(Texture("tiles-menu.jpg"))
            setPosition(0f, 0f)
            uiStage.addActor(this)
        }

        titleText = BaseActor().apply {
            setTexture(Texture("cheese-please.png"))
            setPosition(20f, 100f)
            uiStage.addActor(this)
        }

        val font = BitmapFont()
        val labelStyle = Label.LabelStyle(font, Color.YELLOW)
        instructions = Label("Press S to start, M for main menu ", labelStyle)
        instructions.setFontScale(2f)
        instructions.setPosition(100f, 50f)
        instructions.addAction(Actions.forever(
                Actions.sequence(
                        Actions.color(Color(1f, 1f, 0f, 1f), 0.5f),
                        Actions.delay(0.5f),
                        Actions.color(Color(0.5f, 0.5f, 0f, 1f), 0.5f)
                )
        ))
        uiStage.addActor(instructions)
    }

    override fun update(dt: Float) {

    }

    override fun keyDown(keycode: Int): Boolean {
        if (keycode == Input.Keys.S) {
            game.screen = CheeseLevel(game)
        }

        return false
    }
}