public class Solution {
    LinkedHashMap<Integer,Integer> arr=new LinkedHashMap<Integer,Integer>();
    int c;
    public Solution(int capacity) {
        c=capacity;
    }
    public int get(int key) {
        if(arr.containsKey(key)==true){
            int s=(int)arr.get(key);
            arr.remove(key);
            arr.put(key,s);
            return((int)arr.get(key));
        }
        else{
            return(-1);
        }
    }
    public void set(int key, int value) {
        if(arr.containsKey(key)==true){
            arr.remove(key);
            arr.put(key,value);
            return;
        }
        arr.put(key,value);
        if(arr.size()>c){
            int lKeyFirst=arr.keySet().iterator().next();
            arr.remove(lKeyFirst);
        }
    }
}
