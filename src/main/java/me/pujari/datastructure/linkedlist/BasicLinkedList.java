package me.pujari.datastructure.linkedlist;

import java.util.List;

public class BasicLinkedList<E> implements ILinkedList<E> {

	private INode<E> headNode;

	@Override
	public E add(E e) {
		headNode = new BasicNode<E>(e, headNode);
		return e;
	}

	@Override
	public E remove() {
		E value = headNode.getValue();
		headNode = headNode.getNext();
		return value;
	}

	@Override
	public void print() {
		INode<E> temp = headNode;
		if (temp != null) {
			while (temp.getNext() != null) {
				System.out.println("value = " + temp.getValue());
				temp = temp.getNext();
			}
		}else {
			System.out.print("List is empty");
		}

	}

}
