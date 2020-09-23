package ru.x5.hw06.task1;

import ru.x5.hw06.task1.ArrayCollection.ArrayCollection;
import ru.x5.hw06.task1.LinkedCollection.LinkedCollection;

public class Main {
    public static void main(String[] args) {
        ArrayCollection<String> arrayCollection = new ArrayCollection<>();
        LinkedCollection<String> linkedCollection = new LinkedCollection<>();


    }


    void checkLink(LinkedCollection<String> liCol) {
        for (int i = 0; i < 50; i++) {
            liCol.add("Str " + i);
        }
        for (int i = 0; i < liCol.size(); i++) {
            System.out.println(liCol.get(i));
        }
        liCol.remove(25);
        liCol.remove(22);
        liCol.remove(11);
        liCol.remove(43);
        //System.out.println(liCol.size());
        System.out.println(liCol.get(liCol.size() - 1));
        liCol.remove(liCol.size() - 1);
        for (int i = 0; i < liCol.size(); i++) {
            System.out.println(liCol.get(i));
        }
//        System.out.println(liCol.get(1));
        String in = liCol.get(10);
        System.out.println("INDEX " + in);
        liCol.remove(in);
        for (int i = 0; i < liCol.size(); i++) {
            System.out.println(liCol.get(i));
        }
    }

    void checkArr(ArrayCollection<String> arCol) {
        for (int i = 0; i < 50; i++) {
            arCol.add("smstr " + i);
        }
//        for(int i=0;i<arCol.size();i++){
//            System.out.println(arCol.get(i));
//        }
        arCol.remove(25);
        arCol.remove(22);
        arCol.remove(11);
        arCol.remove(68);
//        for(int i=0;i<=arCol.size();i++){
//            System.out.println(arCol.get(i));
//        }
        String toDel = arCol.get(27);
        arCol.remove(toDel);
//                for(int i=0;i<=arCol.size();i++){
//            System.out.println(arCol.get(i));
//        }

        arCol.clear();
        System.out.println(arCol.size());
        for (int i = 0; i <= arCol.size(); i++) {
            System.out.println(arCol.get(i));
        }
    }
}
