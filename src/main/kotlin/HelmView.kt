/*

The widget class receives cursor/touch events and processes them. on_touch is effectively bound to the initial touching down and subsequent moves. The layout is traversed as a state machine where the state is stored in state_handler

Public:

on_touch( coords ) {
 if( state==STATE_DEFAULT) {
  state_handler.next( coords )
 } else if( state==STATE_CCTRL ) {
 } else { // STATE_SCTRL
 }
}


on_release()

Private:

(state_handler:)
 next(coords)
 release()

state_handler = from_none: state_handler {
 next( coords ) {
  if coords_center( coords )
   state_handler = new begin_center()
  else
   state_handler = new begin_sector(sector(coords))
  destroy this
 }
 release() {
  // Inconsistent
 }
}

begin_center: state_handler {
 next( coords ) {
  // Ignore or err if coords is not consistent (e.g. again the center)
  // ...
  state_handler = new continue_center( sublayout = Layout.center_gestures[ sector(coords) ] )
  destroy this
 } 
 release() {
  Layout.center_gesture.terminal
 }
}

continue_center: state_handler {
 sublayout: center_sector_sublayout
 next( coords ) {
  // Determine change plus, minus, center, or inconsistent
  Plus:
   state_handler = new continue_center( sublayout = sublayout.plus )
  Minus:
   state_handler = new continue_center( sublayout = sublayout.minus )
  Center:
   state_handler = new --- Either we reset ourselfs (not nice) or we let the Layout/Sublayout handle this transparently (nice) --- TODO
  destroy this
 }
 release() {
  Layout.center_gesture.sectors[ sector(coor
}




begin_sector(coords): default_handler
