import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class accountMerge {
    public ArrayList<ArrayList<String>> accountsMerge(ArrayList<ArrayList<String>> accounts) {
        Map<String,String> test = new HashMap<String, String>();
        for(int i=0;i<accounts.size();i++){
            for(int j=1;j<accounts.get(i).size();j++){
                if(test.get(accounts.get(i).get(j))!=null){
                    continue;
                }else{
                    test.put(accounts.get(i).get(j),accounts.get(i).get(0));
                }
            }
        }

        Map<String,ArrayList<String>> middle = new HashMap<String, ArrayList<String>>();
        for(Map.Entry<String,String> entry: test.entrySet()){
            if(middle.get(entry.getValue())!=null){
                ArrayList<String> at = middle.get(entry.getValue());
            }else{
                ArrayList<String> a2 = new ArrayList<String>();
                a2.add(entry.getKey());
                middle.put(entry.getValue(),a2);
            }
        }

        ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
        for(String key:middle.keySet()){
            ArrayList<String> t = middle.get(key);
            t.add(0,key);
            result.add(t);
        }

        return result;
    }

    public static void main(String args[]){
        accountMerge m = new accountMerge();
        ArrayList<ArrayList<String>> accounts = new ArrayList<ArrayList<String>>();
        ArrayList<String> t = new ArrayList<String>();
        t.add("John");t.add("johnsmith@mail.com");t.add("john00@mail.com");
        accounts.add(t);
        ArrayList<String> p = new ArrayList<String>();
        p.add("John");p.add("johnnybravo@mail.com");
        accounts.add(p);
        ArrayList<String> q = new ArrayList<String>();
        q.add("John");q.add("johnsmith@mail.com");q.add("john_newyork@mail.com");
        accounts.add(q);
        ArrayList<String> r = new ArrayList<String>();
        r.add("Mary");r.add("mary@mail.com");
        accounts.add(r);
        System.out.println(m.accountsMerge(accounts));
    }
}