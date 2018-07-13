package com.mygdx.game.cheese

import com.badlogic.gdx.Game
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Animation
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.scenes.scene2d.actions.Actions
import com.mygdx.game.cheese.actors.AnimatedActor
import com.mygdx.game.cheese.actors.BaseActor

class CheesePlease4: Game() {

    private lateinit var mainStage: Stage
    private lateinit var floor: BaseActor
    private lateinit var mousey: AnimatedActor
    private lateinit var cheese: BaseActor
    private lateinit var winText: BaseActor
    private var win = false

    override fun create() {
        mainStage = Stage()
        floor = BaseActor().apply {
            setTexture(Texture("tiles.jpg"))
            setPosition(0f, 0f)
            mainStage.addActor(this)
        }

        cheese = BaseActor().apply {
            setTexture(Texture("cheese.png"))
            setPosition(400f, 200f)
            mainStage.addActor(this)
        }

        mousey = AnimatedActor().apply {
            setAnimation(buildAnimation())
            setTexture(Texture("mouse.png"))
            setPosition(200f, 200f)
            mainStage.addActor(this)
        }
        mousey.setOrigin(mousey.width / 2, mousey.height / 2)

        winText = BaseActor().apply {
            setTexture(Texture("you-win.png"))
            setPosition(170f, 50f)
            isVisible = false
            mainStage.addActor(this)
        }
    }

    private fun buildAnimation(): Animation<TextureRegion> {
        val frames = com.badlogic.gdx.utils.Array((0..3).map {
            TextureRegion(Texture("mouse$it.png").apply {
                setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear)
            })
        }.toTypedArray())
        return Animation(0.1f, frames, Animation.PlayMode.LOOP_PINGPONG)
    }

    override fun render() {
        // process input
        mousey.velocityX = 0f
        mousey.velocityY = 0f

        if(Gdx.input.isKeyPressed(Input.Keys.UP)) {
            mousey.velocityY += 100
        }
        if(Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
            mousey.velocityY -= 100
        }
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            mousey.velocityX += 100
        }
        if(Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            mousey.velocityX -= 100
        }

        // update
        mainStage.act(Gdx.graphics.deltaTime)
        if (!win && cheese.getBoundingRectangle().contains(mousey.getBoundingRectangle())) {
            win = true
            val spinShrinkFadeOut = Actions.parallel(
                    Actions.alpha(1f),
                    Actions.rotateBy(360f, 1f),
                    Actions.scaleTo(0f, 0f, 1f),
                    Actions.fadeOut(1f)
            )
            cheese.addAction(spinShrinkFadeOut)
            cheese.setOrigin(mousey.width / 2, mousey.height / 2)
            val fadeInColorCycleForever = Actions.sequence(
                    Actions.alpha(0f),
                    Actions.show(),
                    Actions.fadeIn(2f),
                    Actions.forever(
                            Actions.sequence(
                                    Actions.color(Color(1f, 0f, 0f, 1f), 1f),
                                    Actions.color(Color(0f, 0f, 1f, 1f), 1f)
                            )
                    )
            )
            winText.addAction(fadeInColorCycleForever)
        }

        // draw graphics
        Gdx.gl.glClearColor(.8f, .8f, 1f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        mainStage.draw()
    }
}