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

Center-Gestures cg start at center and are automatically broken at return to center. If they do not end on C, they will also match when releasing in the sector without returning to the center.
Sector-Gestures sg are not broken at center.
Gestures are implicity non-repeatable. To force repeatability suffix with "!".
The icon of a gesture is inferred from the first action in an entry.

Include with ":filename offset". This includes the given layout at the given point. The offset shifts the absolute value of the primary turn of all center gestures into the direction opposite of its sign, wrapping around at non-empty assignments of that file's layout at that sector (syntactic sugar for applying shift to a layout). E.g.:

Turns Before After offset 2
1     -      -
2     a      c
3     -      -
4     b      a
5     c      b

Note non-disociative behaviour: Applying an offset to a file with two includes is not the same as applying the offset to both includes, as the latter will be rotated and wrapped on their individual assignments. If filename starts with a slash, it will be resolved among all currently loaded layouts. Otherwise, relative to the current file.

Specials:

Inherently non-repeatable:
noop[icon]: No action, used to override icon (icon is a text, possibly with unicode symbols)
cctrl[north,west,south,east]: Non-repeatable center control pad with variable repeat-rate of keys bound in respective directions
sctrl[positive,negative,anchor]: Non-repeatable sector control pad with variable repat-rate of keys bound in respective sense of turn
copy,paste: Clipboard operations
numpad,emojipad: Gridlike keyboard submenus
layout[name,count]: Push layout given by name onto stack for count characters. If count is 0 clear stack and change permanently. Layout resolved by the same rules as file inclusion above.
layout-next: Change to next primary layout in list
layout-prev: Change to previous primary layout in list

Potentially repeatable:
left,right,top,down: Cursor keys (collapsing any selection to the end)
ll,lr: Move left selection end left or right, optionally pushing right end to the right
rl,rr: Move right selection end left or right, optionally pushing left end to the left
tab,backspace,enter,pgup,pgdn,home,end: Control keys
space: Space, invariably bound to C
