package Heap;



public class MinHeap extends Heap{
    
     @Override
    public void headUp(){
        
    int index = size -1;
    while(hasParent(index) && parent(index) > stuff[index]){
    swap(getParentIndex(index), index);
    index = getParentIndex(index);
    }
    }
    
     @Override
    public void headDown(){
    int index = 0;
    while(hasLeftChild(index)){
    int smallerChildIndex = getLeftChildIndex(index);
    if(hasRightChild(index) && rightChild(index) < leftChild(index)){
    smallerChildIndex = getRightChildIndex(index);
    }
    if(stuff[index] < stuff[smallerChildIndex]){
    break;
    }else{
    swap(index,smallerChildIndex);
    }
    index = smallerChildIndex;
    }
    }
    
}
