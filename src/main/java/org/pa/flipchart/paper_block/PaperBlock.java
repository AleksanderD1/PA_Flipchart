package org.pa.flipchart.paper_block;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.pa.flipchart.paper_block.interfaces.PaperBlockInterface;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class PaperBlock implements PaperBlockInterface {
    private List<String> notes = new ArrayList<String>();
    @Override
    public void addNote(String note) {
        notes.add(note);
    }
}
