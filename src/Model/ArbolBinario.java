package Model;

import structure5.BinarySearchTree;


public class ArbolBinario<T extends Comparable<T>> implements EstructuraArbol<T>{

    private BinarySearchTree<T> miArbolInterno;

    public ArbolBinario() {
        miArbolInterno = new BinarySearchTree<T>();
    }


    @Override
    public void add(T value) {

        miArbolInterno.add(value);
    }

    @Override
    public T get(T key) {
        return miArbolInterno.get(key);
    }

    @Override
    public T remove(T key) {
        return miArbolInterno.remove(key);
    }

    @Override
    public int count() {
        return miArbolInterno.size();
    }

    @Override
    public boolean isEmpty() {
        return miArbolInterno.isEmpty();
    }

    @Override
    public boolean contains(T key) {
        return miArbolInterno.contains(key);
    }

    public BinarySearchTree<T> getInternalTree(){
        return miArbolInterno;
    }
}
