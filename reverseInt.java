class reverseInt{
    public int reverse(int x) {
        Boolean positive = true;
        if(x==0 || x>Integer.MAX_VALUE){
            return 0;
        }
        if(x<0){
            x = Math.abs(x);
            positive = false;
        }
        char[] c = change(String.valueOf(x));
        String re = removeZero(c);
        re = re.trim();
        int t = 0;
        try{
            t = Integer.parseInt(re);
        }catch(NumberFormatException e){
            t = 0;
        }
        
        if(t>Integer.MAX_VALUE){
            return 0;
        }else{
            if(!positive){
                return -t;
            }else{
                return t;
            }
        }
    }

    public char[] change(String x){
        char[] c = x.toCharArray();
        int limit = 0;
        if(c.length % 2 ==0){
            limit = c.length / 2;
        }else{
            limit = (c.length - 1) / 2;
        }
        for(int i=0;i<limit;i++){
            char k = c[i];
            c[i] = c[c.length-1-i];
            c[c.length-1-i] = k;
        }
        return c;
    }

    public String removeZero(char[] x){
        int index = 0;
        char[] target = new char[x.length];
        for(int i=0;i<x.length;i++){
            if(x[i]!='0'){
                index = i;
                break;
            }
        }
        if(index==0){
            return String.valueOf(x);
        }else{
            for(int j=0;j<x.length-index;j++){
                target[j] = x[j + index];
            }
            return String.valueOf(target);
        }
    }


    public static void main(String args[]){
        reverseInt r = new reverseInt();
        int t = r.reverse(9646324531);
        System.out.println(t);
    }
}