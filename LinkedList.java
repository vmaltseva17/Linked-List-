public class LinkedList <T> {

    // declares a class which can hold objects of any type "T"
    private Node<T> head;

    // declares private member variable "head" of type Node<T> which is the starting point of the linked list

    static class Node<T> {
        // defines an inner class named node within the linkedlist class which represents a node in the linked list
        private Node<T> previous;
        private Node<T> next;

        // declares private member variables of type Node<T> which represent references to the previous and next nodes in the linked list

        private T obj;

        // private varible which represents the object stored in the node


        Node(T obj)
        // constructor for the Node class
                // takes an object of type T as a parameter and updates the "obj" member variable
                // with the new object
        {
            this.obj = obj;
        }


        public void changeObject(T newObject)
        //method that allows changing the object stored in the node
                // takes new object of type T as a parameter
                // updates the obj member variable with the new object
        {
            this.obj = newObject;
        }

        public T getObj() {

            // returns the object stored in the node
            return this.obj;
        }

        public void setNext(Node<T> nextNode) {

            // sets the next node in the linked list
            this.next = nextNode;
            // takes a Node<T> parameter representing the next node and assings it to the next member variable
        }

        public Node<T> getNextNode() {

            // returns the next node in the linkedlist
            return this.next;
        }

        public void changePreviousNode(Node<T> newPrevious)
        // method that allows to change the previous node in the linked list
        {
            this.previous = newPrevious;
        }

        public Node<T> returnPreviousNode() {

            //returns the previous node in the linked list
            return this.previous;

        }
    }
}
