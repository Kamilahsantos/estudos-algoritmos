char solution(String s) {
    
 char[] chars = s.toCharArray();
		for (char c : chars) {
            //The lastIndexOf() method returns the position of the last occurrence of specified character(s) in a string
            //indexOf - The indexOf() method returns the position of the first occurrence of specified character(s) in a string
			if(s.lastIndexOf(c)==s.indexOf(c))
			{
				return c;
			}
		}
		return '_';

}
