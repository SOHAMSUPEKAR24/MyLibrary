import NightCipher.*;

public class Main {
    public static void main(String[] args) {
        // LinkedList example
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.display();

        // Stack example
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        System.out.println("Stack pop: " + stack.pop());

        // Queue example
        Queue queue = new Queue();
        queue.enqueue(100);
        System.out.println("Queue dequeue: " + queue.dequeue());

        // Sorting example
        int[] arr = {5, 3, 8, 4, 2};
        SortingAlgorithms.bubbleSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Searching example
        int index = SearchingAlgorithms.binarySearch(arr, 4);
        System.out.println("Binary search index for 4: " + index);

        // Graph example
        Graph graph = new Graph();
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        System.out.print("BFS traversal: ");
        graph.BFS(0);
        System.out.print("\nDFS traversal: ");
        graph.DFS(0);
    }
}
