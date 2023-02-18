package org.pa.interfaces;

import org.pa.flipchart.paper_block.PaperBlock;
import org.pa.markers.Marker;

import java.util.Optional;

public interface FlipchartInterface {
    void addPaperBlock(PaperBlock paperBlock);
    void removePaperBlock();
    void addNote(String note, Marker marker);
    void readNotes(PaperBlock paperBlock);
    Optional<PaperBlock> getHighestNoteNumberPaperBlock();
}
