import java.util.Arrays;

public class MyList<E> {
    private int size =0;
    private static final int DEFAULT_CAPACITY = 10 ;
    private Object elements[];
    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    private void ensure(){
        int newSize = elements.length *2;
        elements = Arrays.copyOf(elements,newSize);
    }
    public boolean add (E e){
        if (size == elements.length){
            ensure();
        }
        elements[size++]= e;
        return true;
    }
    public int getSize(){
        return size;
    }
    public E get(int index){
        return (E) elements[index];
    }
    public E remote(int index){
        elements[index] = null;
        for (int i = index; i < size; i++) {
            elements[i]=elements[i+1];
        }
        elements[size-1]=null;
        return (E) elements[index];
    }
    public MyList<E> clone(){
        MyList<E> newElement = new MyList<>();
        for (int i = 0; i < size; i++) {
            newElement.add((E) elements[i]);
        }
        return (MyList<E>)newElement;
    }
    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
