class RandomizedSet {
    ArrayList<Integer> list;
    HashMap<Integer, Integer> map;
    Random random;
    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        if(!map.containsKey(val)) {
            list.add(val);
            map.put(val, map.size());
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)) {
            return false;
        }
        int getIndex = map.get(val);
        if(getIndex < list.size() - 1) {
            int lastElem = list.get(list.size() - 1);
            list.set(getIndex, lastElem);
            map.put(lastElem, getIndex);
        }
        list.remove(list.size() - 1);
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        int index = random.nextInt(list.size());
        return list.get(index);
    }
}

/*
Idea: 
As insert and get element by index of arraylist is O(1) but remove by search isn't O(1). In that case Hashmap can be used as get an element from hashmap is O(1). so we can insert position and val in hashmap.
One problem is when removing an element from list but the removable element isn't the last one. so we have to take the last element, move it from last to removable position. And lastly remove the last element of the list as we already move it from last position.
*/
