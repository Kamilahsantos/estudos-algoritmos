int solution(int[] a) {

LinkedHashSet set = new LinkedHashSet();
        for (int i : a) {
            
           if (set.add(i)== false){
               return i;
           }
        }
        return -1;

    }
