package com.mygdx.game.cheese.actors

import com.badlogic.gdx.graphics.g2d.Animation
import com.badlogic.gdx.graphics.g2d.Batch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.math.MathUtils

class AnimatedActor: BaseActor() {
    private lateinit var animation: Animation<TextureRegion>
    private var elapsedTime = 0f

    fun setAnimation(animation: Animation<TextureRegion>) {
        setTexture(animation.keyFrames[0].texture)
        this.animation = animation
    }

    override fun act(dt: Float) {
        super.act(dt)
        elapsedTime += dt
        if (velocityX != 0f || velocityY != 0f) {
            rotation = MathUtils.atan2(velocityY, velocityX) * MathUtils.radiansToDegrees
        }
    }

    override fun draw(batch: Batch, parentAlpha: Float) {
        region.texture = animation.getKeyFrame(elapsedTime).texture
        super.draw(batch, parentAlpha)
    }
}