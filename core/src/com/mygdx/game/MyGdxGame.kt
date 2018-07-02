package com.mygdx.game

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch

class MyGdxGame : ApplicationAdapter() {
    private lateinit var batch: SpriteBatch
    private lateinit var texture: Texture

    override fun create() {
        batch = SpriteBatch()
        texture = Texture("badlogic.jpg")
    }

    override fun render() {
        Gdx.gl.glClearColor(1f, 1f, 1f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        batch.begin()
        batch.draw(texture, 192f, 112f)
        batch.end()
    }

    override fun dispose() {
        batch.dispose()
        texture.dispose()
    }
}
