package com.mygdx.game.actors

import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Batch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.math.Rectangle
import com.badlogic.gdx.scenes.scene2d.Actor

class BaseActor: Actor() {
    private val region = TextureRegion()
    private val boundary = Rectangle()
    var velocityX = 0f
    var velocityY = 0f

    fun setTexture(texture: Texture) {
        width = texture.width.toFloat()
        height = texture.height.toFloat()
        this.region.setRegion(texture)
    }

    fun getBoundingRectangle(): Rectangle = boundary.set(x, y, width, height)

    override fun act(dt: Float) {
        super.act(dt)
        moveBy(velocityX * dt, velocityY * dt)
    }

    override fun draw(batch: Batch, parentAlpha: Float) {
        batch.color = color
        if (!isVisible) {
            return
        }
        batch.draw(region, x, y, originX, originY, width, height, scaleX, scaleY, rotation)
    }
}
