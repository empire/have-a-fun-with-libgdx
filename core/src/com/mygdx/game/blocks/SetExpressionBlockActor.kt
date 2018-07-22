package com.mygdx.game.blocks

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.Pixmap
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Batch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.mygdx.game.cheese.actors.BaseActor

class SetExpressionBlockActor: BaseActor() {

    val fillImage = Texture(Pixmap(1, 1, Pixmap.Format.RGB888).apply {
        setColor(Color(0xa55b80))

        fillRectangle(0, 0, 1, 1)
    }).apply {
        setWrap(Texture.TextureWrap.Repeat, Texture.TextureWrap.ClampToEdge)
    }

    private val fillRegion = TextureRegion(fillImage)

    init {
        setTexture(Texture("set-expression.png"))
    }

    override fun draw(batch: Batch, parentAlpha: Float) {
        val topHeight = 15
        val leftWidth = 15
        val bottomHeight = region.texture.height - topHeight

        batch.draw(region.texture,
                x, y + region.texture.height - topHeight,
                0, 0,
                region.texture.width - leftWidth, topHeight)


        batch.draw(fillRegion,
                x + region.texture.width - leftWidth, y + topHeight,
                region.texture.width - leftWidth.toFloat(), region.texture.height.toFloat() - topHeight)

//        batch.draw(fillRegion,
//                x, y + bottomHeight - (height - region.texture.height),
//                width, height - region.texture.height)
//
        batch.draw(region.texture,
                x, y - (height - region.texture.height),
                0, region.texture.height - bottomHeight,
                width.toInt(), bottomHeight)
    }

}