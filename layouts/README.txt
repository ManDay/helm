<line> := <comment> | <entry> | <include>
<comment> := #<char>*
<include> := :<filename>([[:space:]]+<number>)?
<number> := [[:digit:]]+
<turns> := ([+-]<number>(,<number>)*)?
<entry> := <sequence> <action> ... 
<action> := <char> | <special>
<sequence> := <cg> | <sg>
<cg> := C<number><turns>C?
<sg> := <number><turns>(C<number><turns>)*C?

Center-Gestures cg start at center and are automatically broken at return to center. They conventionally end on C. Sector-Gestures sg are not broken at center.
Gestures are implicity non-repeatable. To force repeatability suffix with "!".

Include with ":filename offset". This includes the given layout at the given point. The offset shifts the absolute value of the primary turn into the direction opposite of its sign, wrapping around at maximum of the primary turn at that sector (syntactic sugar for applying shift to a layout).

Specials:

Inherently non-repeatable:
cctrl[north,west,south,east]: Non-repeatable center control pad with variable repeat-rate of keys bound in respective directions
sctrl[positive,negative,anchor]: Non-repeatable sector control pad with variable repat-rate of keys bound in respective sense of turn
copy,paste: Clipboard operations
numpad,emojipad: Gridlike keyboard submenus
layout[name,count,icon]: Push layout given by name onto stack for count characters. If count is 0 clear stack and change permanently
layout-next: Change to next primary layout in list
layout-prev: Change to previous primary layout in list

Potentially repeatable:
left,right,top,down: Cursor keys (collapsing any selection to the end)
ll,lr: Move left selection end left or right, optionally pushing right end to the right
rl,rr: Move right selection end left or right, optionally pushing left end to the left
tab,backspace,enter,pgup,pgdn,home,end: Control keys
space: Space, invariably bound to C
