package example.code.tddexample;

public class SimpleSet {

    private int[] container = new int[10];
    private int addedElements = 0;

    public boolean isEmpty() {
        return addedElements == 0;
    }

    public boolean addElement(int i) {
        if (this.contains(i)) return false;
        container[addedElements++] = i;
        return true;
    }

    public int elementCount() {
        return addedElements;
    }

    public boolean contains(int i) {
        for(int element : container) {
            if(element == i) return true;
        }
        return false;
    }
//changes by Aamir Majeed
}
