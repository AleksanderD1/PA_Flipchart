package org.pa;

import org.pa.flipchart.paper_block.PaperBlock;
import org.pa.markers.FlipchartMarker;
import org.pa.markers.WhiterBoardMarker;

public class Main {
    public static void main(String[] args) {
        Flipchart flipchart = new Flipchart();

        PaperBlock paperBlock = new PaperBlock();
        PaperBlock paperBlock1 = new PaperBlock();

        WhiterBoardMarker whiterBoardMarker = new WhiterBoardMarker();
        FlipchartMarker flipchartMarker = new FlipchartMarker();

        // Proof of Notes and Marker Durability Decrease functionality
        flipchart.addPaperBlock(paperBlock);
        System.out.println("Marker Durability: " + whiterBoardMarker.getDurability());
        flipchart.addNote("Notatka 1", whiterBoardMarker);
        System.out.println("Note: " + flipchart.getCurrentPaperBlock().getNotes().get(0));
        System.out.println("Marker Durability: " + whiterBoardMarker.getDurability());

        System.out.println("------------------------------------------------------");

        // Proof of Marker not working
        System.out.println("Adding 10 notes!");
        flipchart.addNote("Notatka 2", whiterBoardMarker);
        flipchart.addNote("Notatka 3", whiterBoardMarker);
        flipchart.addNote("Notatka 4", whiterBoardMarker);
        flipchart.addNote("Notatka 5", whiterBoardMarker);
        flipchart.addNote("Notatka 6", whiterBoardMarker);
        flipchart.addNote("Notatka 7", whiterBoardMarker);
        flipchart.addNote("Notatka 9", whiterBoardMarker);
        flipchart.addNote("Notatka 10", whiterBoardMarker);

        System.out.println("Trying to add 2 more notes!");
        flipchart.addNote("Notatka 11", whiterBoardMarker);
        flipchart.addNote("Notatka 12", whiterBoardMarker);

        System.out.println("------------------------------------------------------");

        System.out.println("Added Notes:");
        flipchart.readNotes(paperBlock);

        System.out.println("------------------------------------------------------");

        // Proof of Highest Note Count and remove functionality
        flipchart.removePaperBlock();
        flipchart.addPaperBlock(paperBlock1);
        flipchart.addNote("Notatka na nowej tablicy", flipchartMarker);

        System.out.println("");
        flipchart.getHighestNoteNumberPaperBlock()
                .ifPresent(c -> System.out.println("The highest note number is: " + c.getNotes().size() + " Notes"));
    }
}