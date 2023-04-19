package Controller;

import Model.ArbolRojoNegro;
import Model.ArbolSplay;
import Model.EstructuraArbol;
import structure5.RedBlackTree;
import structure5.SplayTree;

public class TreesFactory<T extends Comparable<T>> {




    public EstructuraArbol<T> crearArbol(String tipo) {
        switch (tipo) {
            case "SPLAY_TREE":
                return new ArbolSplay<>();
            case "RED_BLACK_TREE":
                return new ArbolRojoNegro<>();
            default:
                throw new IllegalArgumentException("Tipo de árbol no encontrado....");
        }
    }
}
