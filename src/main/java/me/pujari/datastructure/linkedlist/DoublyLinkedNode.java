package me.pujari.datastructure.linkedlist;

public class DoublyLinkedNode<E> implements INode<E>{

	private INode<E> next;
	private INode<E> previous;
	private E value;
	
	public DoublyLinkedNode(INode<E> next, INode<E> previous, E value) {
		super();
		this.next = next;
		this.previous = previous;
		this.value = value;
	}

	@Override
	public E getValue() {
		return value;
	}

	@Override
	public INode<E> getNext() {
		return next;
	}
	
	@Override
	public INode<E> getPrevious() {
		return previous;
	}

	@Override
	public INode<E> setNext(INode<E> next) {
		this.next = next;
		return this;
	}
	
	@Override
	public INode<E> setPrevious(INode<E> previous) {
		this.previous = previous;
		return this;
	}
}
