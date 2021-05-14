package me.pujari.datastructure.linkedlist;

public interface INode<E> {
	default E getValue() {
		throw new UnsupportedOperationException();
	}
	default INode<E> getNext(){
		throw new UnsupportedOperationException();
	}
	default INode<E> getPrevious(){
		throw new UnsupportedOperationException();
	}
	default INode<E> setNext(INode<E> next){
		throw new UnsupportedOperationException();
	}
	default INode<E> setPrevious(INode<E> previous){
		throw new UnsupportedOperationException();
	}
}
