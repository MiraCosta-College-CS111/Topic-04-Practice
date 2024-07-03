class CharacterFormatting {
  public static void main(String[] args) {
    /* DECLARATION AND INITIALIZATION SECTION */
    char c1 = 'k';
    char c2 = 'r';
    char c3 = 'm';
    char c4 = 'a';
    
    /* PRINTF SECTION */
    System.out.printf("%c%c%c%c%n", c1, c2, c3, c4);
    System.out.printf("%C%C%C%C%n", c3, c4, c2, c1);
    System.out.printf("%3c%-3C%3c%-3C%n", c3, c4, c2, c1);
    
  }
}
