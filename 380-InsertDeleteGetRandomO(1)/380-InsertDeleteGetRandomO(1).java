// Last updated: 4/17/2026, 9:00:39 AM
1class RandomizedSet {
2
3    private Map<Integer, Integer> maps;
4    private List<Integer> lists;
5    private Random random;
6    public RandomizedSet() {
7        maps = new HashMap<>();
8        lists = new ArrayList<>();
9        random = new Random();
10    }
11    
12    public boolean search(int val) {
13        return maps.containsKey(val);
14    }
15
16    public boolean insert(int val) { 
17        if(maps.containsKey(val)) return false;
18        lists.add(val);
19        maps.put(val, lists.size() - 1);
20        return true;
21    }
22    
23    public boolean remove(int val) {
24        if(!maps.containsKey(val)) return false;
25        lists.remove(Integer.valueOf(val));
26        maps.remove(val);
27        return true;
28    }
29    
30    public int getRandom() {
31        return lists.get(random.nextInt(lists.size()));
32    }
33
34}
35
36/**
37 * Your RandomizedSet object will be instantiated and called as such:
38 * RandomizedSet obj = new RandomizedSet();
39 * boolean param_1 = obj.insert(val);
40 * boolean param_2 = obj.remove(val);
41 * int param_3 = obj.getRandom();
42 */