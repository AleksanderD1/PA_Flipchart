package org.pa.markers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.pa.markers.interfaces.MarkerInterface;

@Getter
@Setter
public abstract class Marker implements MarkerInterface {
    protected int decreaseValue;
    protected int durability = 100;
    public Marker(int decreaseValue) {
        this.decreaseValue = decreaseValue;
    }
    @Override
    public Boolean isMarkerWorking() {
        if(durability > decreaseValue){
            return true;
        }
        System.out.println("Marker is not working!");
        return false;
    }
    public void decreaseMarkerDurability(){
    };
}
