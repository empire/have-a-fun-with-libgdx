package com.mygdx.game.cheese

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.InputMultiplexer
import com.badlogic.gdx.InputProcessor
import com.badlogic.gdx.Screen
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.utils.viewport.FitViewport

@Suppress("LeakingThis")
abstract class BaseScreen(val game: CheeseGame): Screen, InputProcessor {
    // window dimensions
    protected val viewWidth = 640f
    protected val viewHeight = 480f

    var paused = false

    protected val uiStage = Stage(FitViewport(viewWidth, viewHeight))
    protected val mainStage = Stage(FitViewport(viewWidth, viewHeight))

    init {
        Gdx.input.inputProcessor = InputMultiplexer(this, mainStage, uiStage)
        create()
    }

    abstract fun create()
    abstract fun update(dt: Float)

    fun togglePaused() {
        paused = !paused
    }

    override fun render(dt: Float) {
        // update
        uiStage.act(dt)

        // update graphics
        Gdx.gl.glClearColor(.8f, .8f, 1f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)

        if (!paused) {
            update(dt)
            mainStage.act(dt)
        }

        mainStage.draw()
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
        mainStage.viewport.update(width, height)
        uiStage.viewport.update(width, height)
    }

    override fun dispose() {
    }

    override fun touchUp(screenX: Int, screenY: Int, pointer: Int, button: Int) = false

    override fun mouseMoved(screenX: Int, screenY: Int) = false

    override fun keyTyped(character: Char) = false

    override fun scrolled(amount: Int) = false

    override fun keyUp(keycode: Int) = false

    override fun touchDragged(screenX: Int, screenY: Int, pointer: Int) = false

    override fun keyDown(keycode: Int) = false

    override fun touchDown(screenX: Int, screenY: Int, pointer: Int, button: Int) = false
}
