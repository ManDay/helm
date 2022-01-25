/*

Public:

parse(filestream)
rotate_center_gestures(count)
merge(layout)
enter_sector(sector)
enter_center()
release()

sector_count (ro)
on_emit_char
on_emit_special
on_mismatch

Private:

center_gestures[]?: steps
 terminal: action?
 plus: steps?
 minus: steps?
 center: action?
  
sector_gestures[]?: sector-step
 terminal: action?
 plus: sector-step?
 minus: sector-step?
 center: sector-center-step
  terminal: action?
  sectors[]?:
   terminal: action?
   plus: sector-step?
   minus: sector-step?

current_sequence:
 type: NONE | CENTER | SECTOR | SECTOR_CENTER
  NONE:
  CENTER:
   *steps?
  SECTOR:
   *sector_step
  SECTOR_CENTER:
   *sector-center-step

Arrays/List associated with sectors are of variable length and grown as-needed because we don't assume a known number of sectors during construction. Non-NULL members of the Array must always be constructed with a terminal (action/leaf) somewhere.

*/
