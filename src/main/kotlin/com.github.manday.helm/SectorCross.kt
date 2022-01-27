/*

Design - Center-Gesture hinting:

- Does not work well with center gestures which are sector-releasable (don't end on C):
- Starts after commencing turn, thus direction of turn known
- Sectors hint actions when keeping the direction of turn (nested variants will not be shown before actually reversing the direction)
- Center hints the action which would be obtained on release (if sector-releasable, this is not necessarily the action which you get on moving to Center)

Design - Sector-Gesture hinting:

- Only adjacent sectors hint (ill-defined for 2 sectors) with respective direction of turn

*/
