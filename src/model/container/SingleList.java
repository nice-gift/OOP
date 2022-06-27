package model.container;

import model.entity.Flower;

class FlowerNode {
    public Flower value;
    public FlowerNode next;

}

public class SingleList {
    private FlowerNode first;

    public SingleList() {
        first = new FlowerNode();
    }

    public SingleList(Flower[] flowers) {
        first = new FlowerNode();
//        FlowerNode temp = first;

        for (int i = 0; i < flowers.length - 1; i++) {
            first.value = flowers[i];
            first.next = new FlowerNode();
            first = first.next;
        }

        first.value = flowers[flowers.length - 1];
        first.next = null;
    }

    public boolean isEmpty() {
        return first.value == null;
    }

//    public int size() {
//        int count = 0;
//
//        FlowerNode temp = first;
//        while (temp != null) {
//            count++;
//            temp = temp.next;
//        }
//
//        return count;
//    }
//
//    public Flower get(int index) {
//        int count = 0;
//
//        FlowerNode temp = first;
//
//        while (temp != null) {
//            count++;
//
//            if (index == count) {
//                break;
//            }
//
//            temp = temp.next;
//        }
//
//        return temp.value;
//    }
}