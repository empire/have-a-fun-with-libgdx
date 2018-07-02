package com.mygdx.game

import com.badlogic.gdx.Game
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch

class CheesePlease1: Game() {
    private lateinit var batch: SpriteBatch
    private lateinit var floorTexture: Texture
    private lateinit var cheeseTexture: Texture
    private lateinit var mouseTexture: Texture
    private lateinit var youWinTexture: Texture

    private val cheeseX = 400f
    private val cheeseY = 200f

    private var mouseX = 200f
    private var mouseY = 200f

    private var win = false

    override fun create() {
        batch = SpriteBatch()
        cheeseTexture = Texture("cheese.png")
        mouseTexture = Texture("mouse.png")
        floorTexture = Texture("tiles.jpg")
        youWinTexture = Texture("you-win.png")
    }

    override fun render() {
        when {
            Gdx.input.isKeyPressed(Input.Keys.UP) -> mouseY ++
            Gdx.input.isKeyPressed(Input.Keys.DOWN) -> mouseY --
            Gdx.input.isKeyPressed(Input.Keys.RIGHT) -> mouseX ++
            Gdx.input.isKeyPressed(Input.Keys.LEFT) -> mouseX --
        }

        win = ((cheeseX <= mouseX) and (mouseX + mouseTexture.width <= cheeseX + cheeseTexture.width)) and
                ((cheeseY <= mouseY) and (mouseY + mouseTexture.height <= cheeseY + cheeseTexture.height))

        Gdx.gl.glClearColor(.8f, .8f, 1f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)

        batch.begin()
        batch.draw(floorTexture, 0f, 0f)
        batch.draw(cheeseTexture, cheeseX, cheeseY)
        batch.draw(mouseTexture, mouseX, mouseY)
        if (win) {
            batch.draw(youWinTexture, 170f, 60f)
        }
        batch.end()
    }

    override fun dispose() {
        batch.dispose()
        floorTexture.dispose()
        cheeseTexture.dispose()
        mouseTexture.dispose()
        youWinTexture.dispose()
    }
}