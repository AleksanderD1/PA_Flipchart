package org.pa.markers;

public class WhiterBoardMarker extends Marker {
    public WhiterBoardMarker() {
        super(10);
    }
    public void decreaseMarkerDurability(){
        durability -= 10;
    };
}
