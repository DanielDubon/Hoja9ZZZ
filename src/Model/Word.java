package Model;


import java.util.Objects;

/**
 * @author MAAG
 *
 */
public class Word implements Comparable<Word> {

    private String spanish;
    private String english;

    public Word(String _english, String _spanish) {
        setSpanish(_spanish.toString());
        setEnglish(_english.toString());
    }

    /**
     * @return the spanish
     */
    public String getSpanish() {
        return spanish;
    }


    /**
     * @param spanish the spanish to set
     */
    public void setSpanish(String spanish) {
        this.spanish = spanish;
    }


    /**
     * @return the english
     */
    public String getEnglish() {
        return english;
    }


    /**
     * @param english the english to set
     */
    public void setEnglish(String english) {
        this.english = english;
    }


    @Override
    public int compareTo(Word word) {
        return english.compareTo(word.getEnglish());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Word other = (Word) obj;
        return english.equals(other.english);
    }

    // Sobreescribe el método hashCode
    @Override
    public int hashCode() {
        return Objects.hash(english);
    }


}