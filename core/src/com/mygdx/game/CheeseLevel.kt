package com.mygdx.game

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.Screen
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Animation
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.math.MathUtils
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.scenes.scene2d.actions.Actions
import com.badlogic.gdx.scenes.scene2d.ui.Label
import com.mygdx.game.actors.AnimatedActor
import com.mygdx.game.actors.BaseActor

class CheeseLevel(val game: CheeseGame) : Screen {

    private lateinit var mainStage: Stage
    private lateinit var uiStage: Stage
    private lateinit var floor: BaseActor
    private lateinit var mousey: AnimatedActor
    private lateinit var cheese: BaseActor
    private lateinit var winText: BaseActor
    private lateinit var timeLabel: Label
    private var win = false
    private var timeElapsed = 0f

    // game world dimensions
    private val mapWidth = 800f
    private val mapHeight = 800f

    // window dimensions
    private val viewWidth = 640f
    private val viewHeight = 480f

    init {
        create()
    }

    private fun create() {
        mainStage = Stage()
        uiStage = Stage()
        floor = BaseActor().apply {
            setTexture(Texture("tiles-800-800.jpg"))
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

        val font = BitmapFont()
        val labelStyle = Label.LabelStyle(font, Color.NAVY)
        timeLabel = Label("time: 0", labelStyle)
        timeLabel.setFontScale(2f)
        timeLabel.setPosition(500f, 440f)
        uiStage.addActor(timeLabel)

        winText = BaseActor().apply {
            setTexture(Texture("you-win.png"))
            setPosition(170f, 50f)
            isVisible = false
            uiStage.addActor(this)
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

    override fun render(dt: Float) {
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
        uiStage.act(dt)
        mainStage.act(dt)

        mousey.x = MathUtils.clamp(mousey.x, 0f, mapWidth - mousey.width)
        mousey.y = MathUtils.clamp(mousey.y, 0f, mapHeight - mousey.height)

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

        if (!win) {
            timeElapsed += dt
            timeLabel.setText( "time: ${timeElapsed.toInt()}")
        }

        // draw graphics
        Gdx.gl.glClearColor(.8f, .8f, 1f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)

        // camera adjustment
        val cam = mainStage.camera
        cam.position.set(mousey.x + mousey.originX, mousey.y + mousey.originY, 0f)
        cam.position.x = MathUtils.clamp(cam.position.x, viewWidth / 2, mapWidth - viewWidth / 2)
        cam.position.y = MathUtils.clamp(cam.position.y, viewHeight / 2, mapHeight - viewHeight / 2)

        mainStage.draw()
        uiStage.draw()
    }

    override fun hide() {
    }

    override fun show() {
    }

    override fun pause() {
    }

    override fun resume() {
    }

    override fun resize(width: Int, height: Int) {
    }

    override fun dispose() {
    }
}