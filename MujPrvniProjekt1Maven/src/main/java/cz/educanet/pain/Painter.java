package cz.educanet.pain;

import java.util.ArrayList;

public class Painter {
    public final String name;
    public final ArrayList<Paint> paints;

    public Painter(String name) {
        this.name = name;
        this.paints = new ArrayList<>();
    }


    public void addPainting(Paint paint){
        paints.add(paint);
    }
}
