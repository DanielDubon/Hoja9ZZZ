package Controller;
/**
 *
 */


import Model.Word;

import java.util.Comparator;

/**
 * @author MAAG
 *
 */
public class ComparadorPalabra<T> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        Word pal1 = (Word)o1;
        Word pal2 = (Word)o2;
        return pal1.getEnglish().compareTo(pal2.getEnglish());
    }

}
