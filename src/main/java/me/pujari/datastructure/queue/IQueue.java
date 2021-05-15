package me.pujari.datastructure.queue;

public interface IQueue<E> {
	public IQueue<E> enqueue(E e);
	public E dequeue();
}
