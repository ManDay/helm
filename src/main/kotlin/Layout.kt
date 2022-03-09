/*

NB: There is no movement and only instantaneous snapshots. Thus, inherently no direction of turn. We can only define a direction of turn from adjacency of sectors in which we are.

Corollaries:
Direction of turn is ill-defined for <3 sectors.
We have to anticipate that an adjacent sector might me spuriously skipped without release (although unlikely in practice).
We can not infer the user-intended direction of turn (movement of finger) if sectors are skipped or <3 sectors are present.

The problem of infering (or being unable to) the direction of turn is handled above the Layout class. The Layout class and its sublayouts assume a valid direction of turn has been inferred.

Public:

parse(filestream)
rotate_center_gestures(count)
merge(layout)

sector_count: int (ro)
on_emit_char: fun
on_emit_special: fun
on_mismatch: fun

(sublayout:)
 terminal: action?
 release()

sector-sublayout: sublayout
 turn_sector(plus)
 enter_center()

sector_gestures?[]: sector-sector-sublayout: sector-sublayout
 plus: sector-sector-sublayout?
 minus: sector-sector-sublayout?
 center: sector-center-sublayout: sublayout
  enter_sector(number)
  sectors[]?: sector-sector-sublayout

center_gesture: center-sublayout: sublayout
 enter_sector(number)
 sectors?[]: center-sector-sublayout: sector-sublayout
  plus: center-sector-sublayout?
  minus: center-sector-sublayout?
  center: action?

No premature optimization (tm): Could use steps -> count,steps to skip over unbound: Rare in practice, wasted effort

Arrays/List associated with sectors are of variable length and grown as-needed because we don't assume a known number of sectors during construction. Non-NULL members of the Array must always be constructed with a terminal (action/leaf) somewhere.

*/

package com.github.manday.helm

class Layout {
}
