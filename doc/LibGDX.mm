<map version="freeplane 1.6.0">
<!--To view this file, download free mind mapping software Freeplane from http://freeplane.sourceforge.net -->
<node TEXT="LibGDX" FOLDED="false" ID="ID_1604154175" CREATED="1531134068612" MODIFIED="1531134076994" STYLE="oval">
<font SIZE="18"/>
<hook NAME="MapStyle">
    <properties fit_to_viewport="false" edgeColorConfiguration="#808080ff,#ff0000ff,#0000ffff,#00ff00ff,#ff00ffff,#00ffffff,#7c0000ff,#00007cff,#007c00ff,#7c007cff,#007c7cff,#7c7c00ff"/>

<map_styles>
<stylenode LOCALIZED_TEXT="styles.root_node" STYLE="oval" UNIFORM_SHAPE="true" VGAP_QUANTITY="24.0 pt">
<font SIZE="24"/>
<stylenode LOCALIZED_TEXT="styles.predefined" POSITION="right" STYLE="bubble">
<stylenode LOCALIZED_TEXT="default" ICON_SIZE="12.0 pt" COLOR="#000000" STYLE="fork">
<font NAME="SansSerif" SIZE="10" BOLD="false" ITALIC="false"/>
</stylenode>
<stylenode LOCALIZED_TEXT="defaultstyle.details"/>
<stylenode LOCALIZED_TEXT="defaultstyle.attributes">
<font SIZE="9"/>
</stylenode>
<stylenode LOCALIZED_TEXT="defaultstyle.note" COLOR="#000000" BACKGROUND_COLOR="#ffffff" TEXT_ALIGN="LEFT"/>
<stylenode LOCALIZED_TEXT="defaultstyle.floating">
<edge STYLE="hide_edge"/>
<cloud COLOR="#f0f0f0" SHAPE="ROUND_RECT"/>
</stylenode>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.user-defined" POSITION="right" STYLE="bubble">
<stylenode LOCALIZED_TEXT="styles.topic" COLOR="#18898b" STYLE="fork">
<font NAME="Liberation Sans" SIZE="10" BOLD="true"/>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.subtopic" COLOR="#cc3300" STYLE="fork">
<font NAME="Liberation Sans" SIZE="10" BOLD="true"/>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.subsubtopic" COLOR="#669900">
<font NAME="Liberation Sans" SIZE="10" BOLD="true"/>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.important">
<icon BUILTIN="yes"/>
</stylenode>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.AutomaticLayout" POSITION="right" STYLE="bubble">
<stylenode LOCALIZED_TEXT="AutomaticLayout.level.root" COLOR="#000000" STYLE="oval" SHAPE_HORIZONTAL_MARGIN="10.0 pt" SHAPE_VERTICAL_MARGIN="10.0 pt">
<font SIZE="18"/>
</stylenode>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,1" COLOR="#0033ff">
<font SIZE="16"/>
</stylenode>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,2" COLOR="#00b439">
<font SIZE="14"/>
</stylenode>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,3" COLOR="#990000">
<font SIZE="12"/>
</stylenode>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,4" COLOR="#111111">
<font SIZE="10"/>
</stylenode>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,5"/>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,6"/>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,7"/>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,8"/>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,9"/>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,10"/>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,11"/>
</stylenode>
</stylenode>
</map_styles>
</hook>
<hook NAME="AutomaticEdgeColor" COUNTER="4" RULE="ON_BRANCH_CREATION"/>
<node TEXT="abbreviation" POSITION="right" ID="ID_1165904564" CREATED="1530515675012" MODIFIED="1530527058699">
<edge COLOR="#00007c"/>
<node TEXT="LWJGL: Light Weight Java Game Library" ID="ID_671956441" CREATED="1530514669122" MODIFIED="1530515675040"/>
</node>
<node TEXT="the major stages that a game program progresses through, and the tasks that game program must perform in each stage" POSITION="right" ID="ID_631098730" CREATED="1530515689907" MODIFIED="1530515770974">
<edge COLOR="#007c00"/>
<node TEXT="Game stages" FOLDED="true" ID="ID_327760039" CREATED="1530516286935" MODIFIED="1530516585078">
<node TEXT="Startup" ID="ID_1220292751" CREATED="1530515770980" MODIFIED="1530515773567">
<node TEXT="is carried out by the create method" ID="ID_1504925934" CREATED="1530516313082" MODIFIED="1530516349184"/>
</node>
<node TEXT="The game loop" FOLDED="true" ID="ID_1700121533" CREATED="1530515773765" MODIFIED="1530515778176">
<node TEXT="A stage that repeats continuously while the game is running" ID="ID_556850052" CREATED="1530515798224" MODIFIED="1530515819277"/>
<node TEXT="Process input" ID="ID_1312847657" CREATED="1530515831109" MODIFIED="1530515838079">
<node TEXT="e.g., Gdx.input.isKeyPressed(Input.Keys.UP)" ID="ID_603249290" CREATED="1530524680732" MODIFIED="1530524683542"/>
</node>
<node TEXT="Update" ID="ID_505158351" CREATED="1530515839126" MODIFIED="1530515841048">
<node TEXT="Perform tasks that involve the state of the game world and entities within it" ID="ID_489755535" CREATED="1530515874850" MODIFIED="1530515902832"/>
<node TEXT="This could include" ID="ID_747741227" CREATED="1530515937642" MODIFIED="1530516005564">
<node ID="ID_1847078269" CREATED="1530516005974" MODIFIED="1530516005974"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      changing positions of entities based on user input or physics simulation
    </p>
  </body>
</html>
</richcontent>
</node>
<node TEXT="perform collision detection to determine when two entities come in contact with each other and what action to perform in response" ID="ID_1817970781" CREATED="1530516006763" MODIFIED="1530516072037"/>
<node TEXT="selecting actions for non-player characters" ID="ID_1783625708" CREATED="1530516080276" MODIFIED="1530516096240"/>
</node>
</node>
<node TEXT="Render" ID="ID_1958775413" CREATED="1530515843662" MODIFIED="1530515846064">
<node TEXT="Draw all graphics on the screen" ID="ID_805475241" CREATED="1530515925257" MODIFIED="1530515935868"/>
<node TEXT="render method will be called 60 times per seconds" ID="ID_624643443" CREATED="1530515827724" MODIFIED="1530515829303"/>
</node>
<node TEXT="Process input, the update and render stages are handled by render method" ID="ID_1836218129" CREATED="1530516374833" MODIFIED="1530524789222"/>
</node>
<node TEXT="Shutdown" ID="ID_1029101435" CREATED="1530515778326" MODIFIED="1530515782569">
<node TEXT="removing images or data from memory" ID="ID_1363177798" CREATED="1530516153285" MODIFIED="1530516167209"/>
<node TEXT="saving player data or the game state" ID="ID_1033921465" CREATED="1530516167807" MODIFIED="1530516181715"/>
<node TEXT="signaling the computer to stop monitoring hardware devices for user input" ID="ID_144480469" CREATED="1530516182425" MODIFIED="1530516218288"/>
<node TEXT="closing any windows that were created by the game" ID="ID_699815420" CREATED="1530516218526" MODIFIED="1530516230481"/>
</node>
</node>
<node TEXT="An Application in LibGDX requires user-created classes to implement the ApplicationListener interface so that it can handle all stages of a game program&apos;life cycle" ID="ID_1778830979" CREATED="1530516607759" MODIFIED="1530516675321"/>
</node>
<node TEXT="Game element" POSITION="right" ID="ID_656983790" CREATED="1530527038343" MODIFIED="1530527047450">
<edge COLOR="#7c007c"/>
<node TEXT="Texture" ID="ID_27126633" CREATED="1530514005959" MODIFIED="1530514008672">
<node TEXT="A Texture is an object that stores image-related data" ID="ID_1718108295" CREATED="1530514020648" MODIFIED="1530514037324"/>
</node>
<node TEXT="SpriteBatch" ID="ID_1085582911" CREATED="1530514008894" MODIFIED="1530514018986">
<node TEXT="is an object that draws images to the screen" ID="ID_1634829406" CREATED="1530514040458" MODIFIED="1530514057630"/>
</node>
<node TEXT="Encapsulate logic associated with game entities" ID="ID_405167443" CREATED="1530528639124" MODIFIED="1530528710167">
<node TEXT="The Sprite Class" ID="ID_261304857" CREATED="1530527077716" MODIFIED="1530527084942">
<node TEXT="Sprites contain fields that store coordinates, a texture, and additional information such as angle of rotation and scaling factors" ID="ID_317071881" CREATED="1530527084944" MODIFIED="1530527145934"/>
</node>
<node TEXT="Actor class" ID="ID_1165082628" CREATED="1530528648244" MODIFIED="1530528652806">
<node TEXT="You are free to implement graphics, bounding shapes, a draw method" ID="ID_199780273" CREATED="1530528856751" MODIFIED="1530528886668">
<node TEXT="e.g., select texture to render based on the internal state of the object" ID="ID_1019806568" CREATED="1530528909854" MODIFIED="1530529119492"/>
<node TEXT="You could even store one or more animation in your actor" ID="ID_579818354" CREATED="1530529140867" MODIFIED="1530529235324"/>
</node>
</node>
<node TEXT="Sprite vs Actor" ID="ID_611275744" CREATED="1530529333660" MODIFIED="1530529342392">
<node TEXT="in addition to a draw method, the Actor class has an act method, which can serve as a form of an update method for the Actor" ID="ID_1918385708" CREATED="1530529275637" MODIFIED="1530529385409"/>
<node TEXT="the Actor class was designed to be used in concert with a class called Stage" ID="ID_1665558030" CREATED="1530529393259" MODIFIED="1531281473713">
<arrowlink SHAPE="CUBIC_CURVE" COLOR="#000000" WIDTH="2" TRANSPARENCY="200" FONT_SIZE="9" FONT_FAMILY="SansSerif" DESTINATION="ID_126647831" STARTINCLINATION="792;0;" ENDINCLINATION="792;0;" STARTARROW="NONE" ENDARROW="DEFAULT"/>
</node>
</node>
</node>
<node TEXT="Stage" ID="ID_1943118719" CREATED="1530529492408" MODIFIED="1530529494698">
<node TEXT="Stage stores a list of Actor instances and contains methods (named act and draw) that call the act and draw methods of every actor that has been added to it" ID="ID_126647831" CREATED="1530529454211" MODIFIED="1530529541385"/>
</node>
<node TEXT="Actor" ID="ID_435225354" CREATED="1531134155747" MODIFIED="1531281493804">
<node TEXT="Action" ID="ID_1882539444" CREATED="1531141303268" MODIFIED="1531281496012">
<node TEXT="Visual effect can be added to game by using LibGDX&apos; Action class" ID="ID_935410604" CREATED="1531142119511" MODIFIED="1531142155469"/>
<node TEXT="An Action is an object that can be added to an Actor, which automatically changes the values of various fields over time" ID="ID_1286713928" CREATED="1531142565456" MODIFIED="1531142611622">
<node TEXT="such as position, rotation, scale, color" ID="ID_1828736419" CREATED="1531142594983" MODIFIED="1531142608235"/>
</node>
<node TEXT="To create an Action, it is recommended to use the static methods available in the Actions class" ID="ID_496356996" CREATED="1531146583704" MODIFIED="1531146632707"/>
<node TEXT="You can also create complex, compound visual effects by combining Actions objects" ID="ID_1994975614" CREATED="1531146686111" MODIFIED="1531146718495">
<node TEXT="These effects can be configured to run one after the other (in sequence)" ID="ID_600936863" CREATED="1531146718504" MODIFIED="1531146747097"/>
<node TEXT="or all at the same time (in parallel)" ID="ID_1119904256" CREATED="1531146747341" MODIFIED="1531146759521"/>
</node>
<node TEXT="Additionally, actions can be set to repeat a finite or infinite number of times" ID="ID_826851610" CREATED="1531146761605" MODIFIED="1531146798471">
<node TEXT="Actions class greatly simplify this process" ID="ID_948204705" CREATED="1531146799821" MODIFIED="1531146812560"/>
</node>
</node>
</node>
</node>
<node TEXT="Visual effects" POSITION="right" ID="ID_1812482217" CREATED="1531281504753" MODIFIED="1531281511664">
<edge COLOR="#ff00ff"/>
<node TEXT="Image based Animations" FOLDED="true" ID="ID_313740414" CREATED="1531148964434" MODIFIED="1531281504771">
<node TEXT="Creating an animation requires three pieces of information" ID="ID_57315688" CREATED="1531148986122" MODIFIED="1531149002773">
<node TEXT="An Array of TextureRegion objects (the images to be used in the animation)" ID="ID_690510622" CREATED="1531149005058" MODIFIED="1531149042846"/>
<node TEXT="The amount of time that each image should be displayed" ID="ID_1305397824" CREATED="1531149043761" MODIFIED="1531149061155"/>
<node TEXT="A value that indicates how the frame should be played" ID="ID_1114910902" CREATED="1531149061449" MODIFIED="1531149085083">
<node TEXT="In the order given" ID="ID_1767523740" CREATED="1531149090920" MODIFIED="1531149097091"/>
<node TEXT="in reverse order" ID="ID_970084194" CREATED="1531149097384" MODIFIED="1531149102651"/>
<node TEXT="from first to last to first again (ping-pong order)" ID="ID_385437727" CREATED="1531149103368" MODIFIED="1531149122610"/>
<node TEXT="and whether to repeat (loop) the animation" ID="ID_1046489511" CREATED="1531149123192" MODIFIED="1531149142213"/>
</node>
</node>
</node>
</node>
</node>
</map>
