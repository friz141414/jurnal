public class Main {
    public static void main(String[] args) {
        Kota graf = new Kota(9);

        graf.insertEdge(0, 1);
        graf.insertEdge(0, 2);
        graf.insertEdge(1, 3);
        graf.insertEdge(2, 4);
        graf.insertEdge(2, 5);
        graf.insertEdge(3, 5);
        graf.insertEdge(3, 6);
        graf.insertEdge(4, 5);
        graf.insertEdge(4, 8);
        graf.insertEdge(5, 6);
        graf.insertEdge(5, 7);
        graf.insertEdge(6, 7);
        graf.insertEdge(7, 8);

        System.out.println("kota di negara-negara terdekat berikutnya:");
        graf.DFS(0);
        System.out.println();

        System.out.println("kota di negara-negara yang lebih menjauh:");
        graf.BFS(0);

    }
}
