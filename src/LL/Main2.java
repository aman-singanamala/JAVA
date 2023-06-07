package LL;

import java.util.HashSet;

class N {
    int data;
    N next;

    public N(int data) {
        this.data = data;
        this.next = null;
    }
}

class LL {
    private N head;

    public void insertAtStart(int data) {
        N newN = new N(data);
        newN.next = head;
        head = newN;
    }

    public void insertAtEnd(int data) {
        N newN = new N(data);
        if (head == null) {
            head = newN;
            return;
        }
        N current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newN;
    }

    public void insertAtPosition(int data, int position) {
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 1) {
            insertAtStart(data);
            return;
        }
        N newN = new N(data);
        N current = head;
        int currentPosition = 1;
        while (currentPosition < position - 1 && current != null) {
            current = current.next;
            currentPosition++;
        }
        if (current == null) {
            System.out.println("Invalid position");
            return;
        }
        newN.next = current.next;
        current.next = newN;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    public void deleteEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        N current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public void deleteAtPosition(int position) {
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 1) {
            head = head.next;
            return;
        }
        N current = head;
        int currentPosition = 1;
        while (currentPosition < position - 1 && current != null) {
            current = current.next;
            currentPosition++;
        }
        if (current == null || current.next == null) {
            System.out.println("Invalid position");
            return;
        }
        current.next = current.next.next;
    }

    public void display() {
        N current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


    public void middleOfList() {
        if (head == null) {
            System.out.println("Empty linked list");
            return;
        }
        N slowPtr = head;
        N fastPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        System.out.println("Middle element: " + slowPtr.data);
    }

    public boolean hasCyclebrute() {
        // Create a hash set to store visited nodes
        HashSet<N> visited = new HashSet<>();

        N current = head;

        // Traverse the linked list
        while (current != null) {
            if (visited.contains(current)) {
                // Cycle detected
                return true;
            }

            // Add the current node to the hash set
            visited.add(current);

            // Move to the next node
            current = current.next;
        }

        // No cycle detected
        return false;
    }

    public boolean hasCycle(N head) {
        N slow = head;
        N fast = head;
        if (head == null) {
            return false;
        }
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public N findCyclebrute(N head) {
        HashSet<N> visited = new HashSet<N>();
        N curr = head;
        while (curr != null) {
            if (visited.contains(curr)) {
                return curr;
            }
            visited.add(curr);
            curr = curr.next;
        }
        return null;
    }

    public N findCycle(N head) {
        N slow = head;
        N fast = head;
        N entry = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {  // there is a cycle
                while (slow != entry) {     // found the entry location
                    slow = slow.next;
                    entry = entry.next;
                }
                return entry;
            }
        }
        return null;
    }

    public void removeLoop(N head) {
        if (head == null || head.next == null) {
            return;
        }
        N slow = head;
        N fast = head;
        boolean hasLoop = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                hasLoop = true;
                break;
            }
        }
        if (hasLoop) {
            slow = head;

            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }
            fast.next = null;
        }
    }

    public N reverseInGroups(N head, int groupSize) {
        N curr = head;
        N prev = null;
        N next = null;
        int count = 0;
        while (curr != null && count < groupSize) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        if (next != null) {
            head.next = reverseInGroups(next, groupSize);
        }
        return prev;
    }


}

public class Main2 {
    public static void main(String[] args) {

    }
}

