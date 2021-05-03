package me.pujari.datastructure.stack;

public interface IStack<T> {
	public IStack push(T t);
	public T pop();
	public T peek();
	public void print();
}
