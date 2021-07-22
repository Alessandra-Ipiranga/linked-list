package de.neuefische.linkedlist;

public class AnimalList {

    private AnimalListItem head;

    public void add(Animal animal) {
        AnimalListItem newItem = new AnimalListItem(animal);
        if(isEmpty()){
            setFirstItem(newItem);
        }else {
            appendToLastItem(newItem);
        }
    }

    public boolean isFirstElement(Animal animal){
        AnimalListItem toRemove = new AnimalListItem(animal);
        return head.getValue() == toRemove.getValue();
    }

    /*public void remove(Animal animal){
        if(isEmpty()) {
            System.out.println("Already empty!");
        } else if (isFirstElement(animal)){
            removeFirst(animal);
        }

    }*/

    /*public void removeFirst(Animal animal){
        AnimalListItem toRemove = new AnimalListItem(animal);
        if (head.getValue() == toRemove.getValue()){
            head = head.getNext();
        }
    }*/

    public void removeFirst(Animal animal){
        if (isFirstElement(animal)){
            head = head.getNext();
        }
    }

    public void removeLast(Animal animal){
        AnimalListItem current = head;
        AnimalListItem pre = head;
        while(current.getNext() != null){
            current = current.getNext();
        }
        while (pre.getNext() != current){
            pre = pre.getNext();
        } pre.setNext(null);
    }

    /*public boolean isLast(){
        AnimalListItem toRemove;
        AnimalListItem current = head;
        while(current.getNext() != null){
            current = current.getNext();
        } return current.getValue() == toRemove.getValue();
    }*/

    public void removeMiddle(Animal animal){
        AnimalListItem current = head;
        AnimalListItem pre = head;
        while (current.getValue().getName() != animal.getName()){
            current = current.getNext();
        }
        while (pre.getNext() != current ){
            pre = pre.getNext();
        } pre.setNext(current.getNext());
        current.setNext(null);
    }

    private boolean isEmpty() {
        return head == null;
    }

    private void setFirstItem(AnimalListItem item){
        head = item;
    }

    private void appendToLastItem(AnimalListItem item){
        AnimalListItem current = head;
        while(current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(item);
    }

    @Override
    public String toString(){
        if(isEmpty()){
            return "";
        }

        StringBuilder builder = new StringBuilder(head.getValue().getName());

        AnimalListItem current = head.getNext();
        while(current != null){
            builder.append(" -> ").append(current.getValue().getName());
            current = current.getNext();
        }

        return builder.toString();
    }

}