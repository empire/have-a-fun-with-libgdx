package com.mygdx.game

import com.badlogic.gdx.Game
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Sprite
import com.badlogic.gdx.graphics.g2d.SpriteBatch

class CheesePlease2: Game() {
    private lateinit var batch: SpriteBatch

    private lateinit var floorSprite: Sprite
    private lateinit var cheeseSprite: Sprite
    private lateinit var mouseSprite: Sprite
    private lateinit var youWinSprite: Sprite

    private var win = false

    override fun create() {
        batch = SpriteBatch()
        cheeseSprite = Sprite(Texture("cheese.png")).apply {
            setPosition(400f, 200f)
        }
        mouseSprite = Sprite(Texture("mouse.png")).apply {
            setPosition(200f, 200f)
        }
        floorSprite = Sprite(Texture("tiles.jpg")).apply {
            setPosition(0f, 0f)
        }
        youWinSprite = Sprite(Texture("you-win.png")).apply {
            setPosition(170f, 50f)
        }
    }

    override fun render() {
        when {
            Gdx.input.isKeyPressed(Input.Keys.UP) -> mouseSprite.translateY(1f)
            Gdx.input.isKeyPressed(Input.Keys.DOWN) -> mouseSprite.translateY(-1f)
            Gdx.input.isKeyPressed(Input.Keys.RIGHT) -> mouseSprite.translateX(1f)
            Gdx.input.isKeyPressed(Input.Keys.LEFT) -> mouseSprite.translateX(-1f)
        }

        win = cheeseSprite.boundingRectangle.contains(mouseSprite.boundingRectangle)

        Gdx.gl.glClearColor(.8f, .8f, 1f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)

        batch.begin()
        floorSprite.draw(batch)
        cheeseSprite.draw(batch)
        mouseSprite.draw(batch)
        if (win) {
            youWinSprite.draw(batch)
        }
        batch.end()
    }

    override fun dispose() {
        batch.dispose()
    }
}