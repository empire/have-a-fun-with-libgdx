package com.mygdx.game.blocks

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.Pixmap
import com.badlogic.gdx.graphics.Texture
import com.mygdx.game.cheese.actors.BaseActor

class SetExpressionBlockActor: BaseActor() {
    private val pixmap: Pixmap = Pixmap(100, 100, Pixmap.Format.RGBA8888)
    private val leftMargin = 5
    private val width = 100
    private val height = 40
    private val triangleSide = 5
    private val cornerRadius = 5

    init {
        val color = Color.YELLOW

        pixmap.setColor(color)

        var relativeX = 0
        relativeX = drawLeftSide(relativeX)
        relativeX = drawMiddleSide(relativeX)

        setTexture(Texture(pixmap))
    }

    private fun drawLeftSide(relativeX: Int): Int {
        pixmap.fillCircle(cornerRadius, cornerRadius, cornerRadius)
        pixmap.fillCircle(cornerRadius, height - cornerRadius - 1, cornerRadius)

        //        pixmap.fillRectangle(cornerRadius, 0, width - cornerRadius, height)
        pixmap.fillRectangle(0, cornerRadius, cornerRadius + 1, height - cornerRadius * 2)
        pixmap.fillRectangle(cornerRadius + 1, 0, cornerRadius + leftMargin, height)

        return relativeX + cornerRadius * 2 + leftMargin
    }

    private fun drawMiddleSide(relativeX: Int): Int {
        var margin = relativeX - (triangleSide / 2 + 2)
        val triangleMargin = (triangleSide * .65).toInt()
        val secondTriangleX = triangleMargin + 2 * triangleSide + 1

        // Top part
        pixmap.fillTriangle(margin, triangleSide, margin + triangleSide, 0, margin + 2 * triangleSide, triangleSide)
        pixmap.fillTriangle(secondTriangleX + margin, triangleSide, secondTriangleX + margin + triangleSide, 0, secondTriangleX + margin + 2 * triangleSide, triangleSide)
        pixmap.fillRectangle(margin + 2 * triangleSide + 1, triangleSide, triangleMargin, 1)

        // Right margin
        pixmap.fillRectangle(secondTriangleX + 2 * triangleMargin + margin, 0, cornerRadius + leftMargin, height)

        // Bottom part
        margin += triangleSide
        pixmap.fillTriangle(
                margin, height - 1,
                margin + triangleSide, height + triangleSide - 1,
                margin + 2 * triangleSide, height - 1)
        pixmap.fillTriangle(
                margin + triangleMargin + 1, height - 1,
                margin + triangleSide + triangleMargin + 1, height + triangleSide - 1,
                margin + 2 * triangleSide + triangleMargin + 1, height - 1)
        pixmap.fillRectangle(margin + triangleSide + 1, height - 1, triangleMargin, triangleSide + 1)

        // Fill gap
        pixmap.fillRectangle(margin, triangleSide + 1, triangleMargin + 2 * (triangleSide + 1), height - triangleSide - 2)

        return 0
    }
}