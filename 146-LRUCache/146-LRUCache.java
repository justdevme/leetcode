// Last updated: 4/8/2026, 2:59:42 PM
1class LRUCache {
2
3    class Node {
4        int key, val;
5        Node prev, next;
6
7        Node(int key, int val) {
8            this.key = key;
9            this.val = val;
10        }
11    }
12
13    private int capacity;
14    private Map<Integer, Node> map;
15    private Node head, tail;
16
17    public LRUCache(int capacity) {
18        this.capacity = capacity;
19        map = new HashMap<>();
20
21        head = new Node(0,0);
22        tail = new Node(0,0);
23
24        head.next = tail;
25        tail.prev = head;
26    }
27    
28    private void remove (Node node) {
29        node.prev.next = node.next;
30        node.next.prev = node.prev;
31    }
32
33    private void insertToHead(Node node) {
34        node.next = head.next;
35        node.prev = head;
36
37        head.next.prev = node;
38        head.next = node;
39    }
40
41    public int get(int key) {
42        if (!map.containsKey(key)) return -1;
43
44        Node node = map.get(key);
45        remove(node);
46        insertToHead(node);
47
48        return node.val;
49    }
50
51    
52    public void put(int key, int value) {
53        if (map.containsKey(key)) {
54            Node node = map.get(key);
55            node.val = value;
56
57            remove(node);
58            insertToHead(node);
59        } else {
60            Node node = new Node(key, value);
61            map.put(key, node);
62            insertToHead(node);
63
64            if (map.size() > capacity) {
65                Node lru = tail.prev;
66                remove(lru);
67                map.remove(lru.key);
68            }
69        }
70    }
71}
72
73/**
74 * Your LRUCache object will be instantiated and called as such:
75 * LRUCache obj = new LRUCache(capacity);
76 * int param_1 = obj.get(key);
77 * obj.put(key,value);
78 */