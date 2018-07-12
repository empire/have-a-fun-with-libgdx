package com.mygdx.game

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.Screen
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.scenes.scene2d.actions.Actions
import com.badlogic.gdx.scenes.scene2d.ui.Label
import com.mygdx.game.actors.BaseActor

class CheeseMenu(val game: CheeseGame) : Screen {

    private lateinit var uiStage: Stage
    private lateinit var floor: BaseActor
    private lateinit var titleText: BaseActor
    private lateinit var instructions: Label

    init {
        create()
    }

    private fun create() {
        uiStage = Stage()
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

    override fun render(dt: Float) {
        // process input

        if(Gdx.input.isKeyPressed(Input.Keys.S)) {
            game.screen = CheeseLevel(game)
        }

        // update
        uiStage.act(dt)

        // draw graphics
        Gdx.gl.glClearColor(.8f, .8f, 1f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)

        uiStage.draw()
    }

    override fun hide() {
    }

    override fun show() {
    }

    override fun pause() {
    }

    override fun resume() {
    }

    override fun resize(width: Int, height: Int) {
    }

    override fun dispose() {
    }
}