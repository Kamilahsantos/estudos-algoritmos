int solution(int[] inputArray) {


 return IntStream.range(1, inputArray.length).map(i->inputArray[i]*inputArray[i-1]).max().getAsInt();
 
}
