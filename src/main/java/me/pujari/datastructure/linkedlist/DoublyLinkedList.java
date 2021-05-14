package me.pujari.datastructure.linkedlist;

public class DoublyLinkedList<E> implements ILinkedList<E> {

	private INode<E> headNode;

	@Override
	public E add(E e) {
		if (headNode == null) {
			headNode = new DoublyLinkedNode<E>(null, null, e);
		}else {
			INode<E> temp = new DoublyLinkedNode<E>(headNode, null, e);
			headNode.setPrevious(temp);
		}
		return e;
	}

	@Override
	public E remove() {
		E value = headNode.getValue();
		headNode = headNode.getNext();
		headNode.setPrevious(null);
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
