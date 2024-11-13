public void DFS(int start) {
    Set<Integer> visited = new HashSet<>();
    DFSUtil(start, visited);
}

private void DFSUtil(int node, Set<Integer> visited) {
    visited.add(node);
    System.out.print(node + " ");

    for (int neighbor : adjList.getOrDefault(node, Collections.emptyList())) {
        if (!visited.contains(neighbor)) {
            DFSUtil(neighbor, visited);
        }
    }
}
