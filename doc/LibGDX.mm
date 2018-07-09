<map version="freeplane 1.6.0">
<!--To view this file, download free mind mapping software Freeplane from http://freeplane.sourceforge.net -->
<node TEXT="LibGDX" FOLDED="false" ID="ID_1604154175" CREATED="1531134068612" MODIFIED="1531134076994" STYLE="oval">
<font SIZE="18"/>
<hook NAME="MapStyle">
    <properties edgeColorConfiguration="#808080ff,#ff0000ff,#0000ffff,#00ff00ff,#ff00ffff,#00ffffff,#7c0000ff,#00007cff,#007c00ff,#7c007cff,#007c7cff,#7c7c00ff" fit_to_viewport="false"/>

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
<hook NAME="AutomaticEdgeColor" COUNTER="3" RULE="ON_BRANCH_CREATION"/>
<node TEXT="Actor" POSITION="right" ID="ID_435225354" CREATED="1531134155747" MODIFIED="1531134162862">
<edge COLOR="#ff0000"/>
</node>
<node TEXT="Action" POSITION="right" ID="ID_1882539444" CREATED="1531141303268" MODIFIED="1531141306480">
<edge COLOR="#0000ff"/>
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
<node TEXT="Image based Animations" POSITION="right" ID="ID_313740414" CREATED="1531148964434" MODIFIED="1531148975334">
<edge COLOR="#00ff00"/>
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
</map>
