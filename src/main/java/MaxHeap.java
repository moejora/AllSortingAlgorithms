

public class MaxHeap extends Heap {

     @Override
    public void headUp() {
        int index = size - 1;
        while (hasParent(index) && parent(index) < stuff[index]) {
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

     @Override
    public void headDown() {
        int index = 0;
        while (hasLeftChild(index)) {
            int largerChildIndex = getLeftChildIndex(index);
            if (hasRightChild(index) && rightChild(index) > leftChild(index)) {
                largerChildIndex = getRightChildIndex(index);
            }
            if (stuff[index] > stuff[largerChildIndex]) {
                break;
            } else {
                swap(index, largerChildIndex);
            }
            index = largerChildIndex;
        }
    }
}
