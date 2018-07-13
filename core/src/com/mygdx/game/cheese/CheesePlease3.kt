package com.mygdx.game.cheese

import com.badlogic.gdx.Game
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.scenes.scene2d.Stage
import com.mygdx.game.cheese.actors.BaseActor

class CheesePlease3: Game() {

    private lateinit var mainStage: Stage
    private lateinit var floor: BaseActor
    private lateinit var mousey: BaseActor
    private lateinit var cheese: BaseActor
    private lateinit var winText: BaseActor

    override fun create() {
        mainStage = Stage()
        floor = BaseActor().apply {
            setTexture(Texture("tiles.jpg"))
            setPosition(0f, 0f)
        }
        mainStage.addActor(floor)

        cheese = BaseActor().apply {
            setTexture(Texture("cheese.png"))
            setPosition(400f, 200f)
        }
        mainStage.addActor(cheese)

        mousey = BaseActor().apply {
            setTexture(Texture("mouse.png"))
            setPosition(200f, 200f)
        }
        mainStage.addActor(mousey)

        winText = BaseActor().apply {
            setTexture(Texture("you-win.png"))
            setPosition(170f, 50f)
        }
        mainStage.addActor(winText)
    }

    override fun render() {
        // process input
        mousey.velocityX = 0f
        mousey.velocityY = 0f

        when {
            Gdx.input.isKeyPressed(Input.Keys.UP) -> mousey.velocityY += 100
            Gdx.input.isKeyPressed(Input.Keys.DOWN) -> mousey.velocityY -= 100
            Gdx.input.isKeyPressed(Input.Keys.RIGHT) -> mousey.velocityX += 100
            Gdx.input.isKeyPressed(Input.Keys.LEFT) -> mousey.velocityX -= 100
        }

        // update
        mainStage.act(Gdx.graphics.deltaTime)
        winText.isVisible = cheese.getBoundingRectangle().contains(mousey.getBoundingRectangle())

        // draw graphics
        Gdx.gl.glClearColor(.8f, .8f, 1f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        mainStage.draw()
    }
}