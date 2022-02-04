/*

Design - Center-Gesture hinting:

- Does not work well with center gestures which are sector-releasable (don't end on C):
- Starts after commencing turn, thus direction of turn known
- Sectors hint actions when keeping the direction of turn (nested variants will not be shown before actually reversing the direction)
- Center hints the action which would be obtained on release (if sector-releasable, this is not necessarily the action which you get on moving to Center)

Design - Sector-Gesture hinting:

- Only adjacent sectors hint (ill-defined for 2 sectors) with respective direction of turn

Settings:

--Appearance--
Dialog Theme (Dark/Light etc.)
Color Settings
 Trail
 Dominant Lines (Sector Cross)
 Dimmed Lines (Ctrl Isolines)
 Layout Mismatch (Corner triangles light up)
 Labels
 Sector Labels & Hints
 Highlight (Circle on CG, Sectors on SG, Isolines on Ctrl - Circle flickers twice on automatic break)
Trail Width
--Layouts--
Autoshifting (From layout.hlm/shifted.txt)
Layout Configuration (From layout.hlm/main.txt)
 ... Draggable ordered list of loaded Layouts like [ <Layout ID> (Preview-Button - Eye) (Delete-Button - Trashcan) ]
 ... Load-Button to open HLM file: Every subdirectory will be an ID and loaded as a layout, existing IDs will be overwritten.
--Interaction--
Feedback (each Haptic, Sound, None)
 Start Circle
 Start Sector
 Turn Sectors
 Cross Circle
Geometry
 Circle Percentage (1% to 99%)
 Tolerance (Circle + Sector Line width)
 Portrait Height (0-100% of available shorter edge)
 Portrait H-Align (-100% to 100%)
 Landscape Height (0-100% of available shorter edge)
 Landscape H-Align (-100% to 100%)
--Help--
Help & About


"Open With Helm" Android Action performs Load-Button method

*/
