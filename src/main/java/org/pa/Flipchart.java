package org.pa;

import lombok.Getter;
import lombok.Setter;
import org.pa.flipchart.paper_block.PaperBlock;
import org.pa.interfaces.FlipchartInterface;
import org.pa.markers.Marker;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Getter
@Setter
public class Flipchart implements FlipchartInterface {
    private List<PaperBlock> listOfPaperBlocks = new ArrayList<PaperBlock>();
    private PaperBlock currentPaperBlock;
    @Override
    public void addPaperBlock(PaperBlock paperBlock) {
        currentPaperBlock = paperBlock;
    }
    @Override
    public void removePaperBlock() {
        listOfPaperBlocks.add(currentPaperBlock);
        currentPaperBlock = null;
    }
    @Override
    public void addNote(String note, Marker marker) {
        if (currentPaperBlock != null && marker.isMarkerWorking()) {
            currentPaperBlock.addNote(note);
            marker.decreaseMarkerDurability();
        } else {
            System.out.println("There is no Paperblock installed or the marker is not working!");
        }
    }
    public void readNotes(PaperBlock paperBlock) {
        paperBlock.getNotes().forEach(System.out::println);
    }
    @Override
    public Optional<PaperBlock> getHighestNoteNumberPaperBlock() {
        return listOfPaperBlocks.stream()
                .sorted()
                .findFirst();
    }
}
