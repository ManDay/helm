/*

NB: There is no movement and only instantaneous snapshots. Thus, inherently no direction of turn. We can only define a direction of turn from adjacency of sectors in which we are.

Corollaries:
Direction of turn is ill-defined for <3 sectors.
We have to anticipate that an adjacent sector might me spuriously skipped without release (although unlikely in practice).
We can not infer the user-intended direction of turn (movement of finger) if sectors are skipped or <3 sectors are present.

The problem of infering (or being unable to) the direction of turn is handled above the Layout class. The Layout class and its sequences assume a valid direction of turn has been inferred.

Public:

parse(filestream)
rotate_center_gestures(count)
merge(layout)

sector_count: int (ro)
on_emit_char: fun
on_emit_special: fun
on_mismatch: fun

(sequence:)
 terminal: action?
 release()

sector-sequence: sequence
 turn_sector(plus)
 enter_center()

sector_gestures?[]: sector-sector-sequence: sector-sequence
 plus: sector-sector-sequence?
 minus: sector-sector-sequence?
 center: sector-center-sequence: sequence
  enter_sector(number)
  sectors[]?: sector-sector-sequence

center_gesture: center-sequence: sequence
 enter_sector(number)
 sectors?[]: center-sector-sequence: sector-sequence
  plus: center-sector-sequence?
  minus: center-sector-sequence?
  center: action?

No premature optimization (tm): Could use steps -> count,steps to skip over unbound: Rare in practice, wasted effort

Arrays/List associated with sectors are of variable length and grown as-needed because we don't assume a known number of sectors during construction. Non-NULL members of the Array must always be constructed with a terminal (action/leaf) somewhere.

*/
