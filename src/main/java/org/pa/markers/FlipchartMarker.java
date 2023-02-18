package org.pa.markers;

public class FlipchartMarker extends Marker{
    public FlipchartMarker() {
        super(1);
    }
    public void decreaseMarkerDurability(){
        durability -= 1;
    };
}
