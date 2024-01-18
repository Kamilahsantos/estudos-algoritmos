boolean solution(String inputString) {
    
    String validatePalindrome = inputString.replaceAll("\\s+", " ") .toLowerCase();
    return IntStream.range(0, validatePalindrome.length()/2)
    .noneMatch(p ->  validatePalindrome.charAt(p) !=validatePalindrome.charAt(validatePalindrome.length()- p-1));
}
