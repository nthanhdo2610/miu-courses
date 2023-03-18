package lesson11.labs.prob2;

import java.util.List;

public class Group <T>{
    private T specialElement;
    private List<T> elements;

    public Group(T specialElement, List<T> elements) {
        this.specialElement = specialElement;
        this.elements = elements;
    }

    public T getSpecialElement() {
        return specialElement;
    }

    public void setSpecialElement(T specialElement) {
        this.specialElement = specialElement;
    }

    public List<T> getElements() {
        return elements;
    }

    public void setElements(List<T> elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        return "Group{" +
                "specialElement=" + specialElement +
                ", elements=" + elements +
                '}';
    }
}
