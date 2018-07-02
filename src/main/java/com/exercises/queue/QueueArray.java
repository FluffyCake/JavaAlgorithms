package com.exercises.queue;

// --- Description
// Create a queue data structure.  The queue
// should be a class with methods 'add' and 'remove'.
// Adding to the queue should store an element until
// it is removed
// --- Examples
//     const q = new QueueArray();
//     q.add(1);
//     q.remove(); // returns 1;

public class QueueArray<T> {

    private T[] arr;

    private int total, first, next;

    public QueueArray()
    {
        arr = (T[]) new Object[2];
    }

    private void resize(int capacity)
    {
        T[] tmp = (T[]) new Object[capacity];

        for (int i = 0; i < total; i++)
            tmp[i] = arr[(first + i) % arr.length];

        arr = tmp;
        first = 0;
        next = total;
    }

    public QueueArray<T> enqueue(T ele)
    {
        if (arr.length == total) resize(arr.length * 2);
        arr[next++] = ele;
        if (next == arr.length) next = 0;
        total++;
        return this;
    }

    public T dequeue()
    {
        if (total == 0) throw new java.util.NoSuchElementException();
        T ele = arr[first];
        arr[first] = null;
        if (++first == arr.length) first = 0;
        if (--total > 0 && total == arr.length / 4) resize(arr.length / 2);
        return ele;
    }

    public T peek(){
        T ele = arr[first];
        return ele;
    }

    @Override
    public String toString()
    {
        return java.util.Arrays.toString(arr);
    }

}