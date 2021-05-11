package me.pujari.datastructure.linkedlist;

public class BasicNode<E> implements INode<E> {

	private E value;
	private INode<E> next;

	
	public BasicNode(E value, INode<E> next) {
		super();
		this.value = value;
		this.next = next;
	}

	@Override
	public E getValue() {
		return value;
	}

	@Override
	public INode<E> getNext() {
		return next;
	}

}
