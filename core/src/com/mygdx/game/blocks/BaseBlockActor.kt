package com.mygdx.game.blocks

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.Pixmap
import com.badlogic.gdx.graphics.Texture
import com.mygdx.game.cheese.actors.BaseActor

class BaseBlockActor: BaseActor() {
    var pixmap: Pixmap = Pixmap(100, 100, Pixmap.Format.RGBA8888)

    init {
        val width = 100
        val height = 20
        val color = Color.YELLOW
        val cornerRadius = 2

        pixmap.setColor(color)

        pixmap.fillCircle(cornerRadius, cornerRadius, cornerRadius)
        pixmap.fillCircle(width - cornerRadius - 1, cornerRadius, cornerRadius)
        pixmap.fillCircle(cornerRadius, height - cornerRadius - 1, cornerRadius)
        pixmap.fillCircle(width - cornerRadius - 1, height - cornerRadius - 1, cornerRadius)
        pixmap.fillRectangle(cornerRadius, 0, width - cornerRadius * 2, height);
        pixmap.fillRectangle(0, cornerRadius, width, height - cornerRadius * 2);

        setTexture(Texture(pixmap))
    }
}