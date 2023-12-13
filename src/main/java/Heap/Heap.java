package Heap;



import java.util.Arrays;

public abstract class Heap {
    
    int size;
    int storage = 10;
    int[] stuff;

    public Heap() {
        this.stuff = new int[storage];
        this.size = 0;
    }

    public int getLeftChildIndex(int myIndex) {
        return 2 * myIndex + 1;
    }

    public int getRightChildIndex(int myIndex) {
        return 2 * myIndex + 2;
    }

    public int getParentIndex(int myIndex) {
        return (myIndex - 1) / 2;
    }

    public boolean hasLeftChild(int myIndex) {
        return getLeftChildIndex(myIndex) < size;
    }

    public boolean hasRightChild(int myIndex) {
        return getRightChildIndex(myIndex) < size;
    }

    public boolean hasParent(int myIndex) {
        return getParentIndex(myIndex) >= 0;
    }

    public int leftChild(int myIndex) {
        return stuff[getLeftChildIndex(myIndex)];
    }

    public int rightChild(int myIndex) {
        return stuff[getRightChildIndex(myIndex)];
    }

    public int parent(int myIndex) {
        return stuff[getParentIndex(myIndex)];
    }

    public void swap(int fstIndex, int scdIndex) {
        int num = stuff[fstIndex];
        stuff[fstIndex] = stuff[scdIndex];
        stuff[scdIndex] = num;
    }

    public void storageCheck() {
        if (size == storage) {
            storage *= 2;
            stuff = Arrays.copyOf(stuff, storage);
        }

    }

    public int peak() {
        return stuff[0];
    }

    public int poll() {
        int stuffs = stuff[0];
        stuff[0] = stuff[size - 1];
        size--;
        headDown();
        return stuffs;
    }

    public void add(int stuffs) {
        storageCheck();
        stuff[size] = stuffs;
        size++;
        headUp();
    }

    
    //allows the use of headUp and headDown.
    //They do not implement anything but allows use from subClasses
    public abstract void headUp();

    public abstract void headDown();
}
