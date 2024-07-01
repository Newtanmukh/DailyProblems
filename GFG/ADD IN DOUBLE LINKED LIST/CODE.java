 void addNode(Node head, int pos, int data)
	{
	       if (head == null) {
        return; // This is correct.
    }

    Node newNode = new Node(data); // Correct.
    Node current = head;

    // Traverse to the p-th node
    for (int i = 0; i < pos && current != null; i++) {
        current = current.next;
    }

    // If current is null, position is out of bounds
    if (current == null) {
        return; // Correctly handle out-of-bounds positions.
    }

    // Correct logic for inserting newNode after current
    Node nextNode = current.next; // Store the next node of current.

    // Insert newNode after current
    current.next = newNode; // Correctly link current to newNode.
    newNode.prev = current; // Correctly link newNode's prev to current.
newNode.next = nextNode; // Correctly link newNode's next to nextNode.


    if (nextNode != null) {
        nextNode.prev = newNode; // Correctly link nextNode's prev to newNode.
    }

    
	}