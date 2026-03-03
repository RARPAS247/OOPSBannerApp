public class uc7 {
   public uc7() {
   }

   public static CharacterPatternMap[] createCharacterPatternMaps() {
      CharacterPatternMap[] var0 = new CharacterPatternMap[]{new CharacterPatternMap('O', new String[]{" ***** ", "**   **", "**   **", "**   **", "**   **", "**   **", " ***** "}), new CharacterPatternMap('P', new String[]{" ******", " **   **", " **   **", " ******", " **", " **", " **"}), new CharacterPatternMap('S', new String[]{" ***** ", "**      ", "**      ", " ***** ", "        **", "        **", "     ***** "}), new CharacterPatternMap(' ', new String[]{"   ", "   ", "   ", "   ", "   ", "   ", "   "})};
      return var0;
   }

   public static String[] getCharacterPattern(char var0, CharacterPatternMap[] var1) {
      for(CharacterPatternMap var5 : var1) {
         if (var5.getCharacter() == var0) {
            return var5.getPattern();
         }
      }

      return getCharacterPattern(' ', var1);
   }

   public static void printMessage(String var0, CharacterPatternMap[] var1) {
      byte var2 = 7;

      for(int var3 = 0; var3 < var2; ++var3) {
         StringBuilder var4 = new StringBuilder();

         for(int var5 = 0; var5 < var0.length(); ++var5) {
            char var6 = var0.charAt(var5);
            String[] var7 = getCharacterPattern(var6, var1);
            var4.append(var7[var3]).append("  ");
         }

         System.out.println(var4);
      }

   }

   public static void main(String[] var0) {
      CharacterPatternMap[] var1 = createCharacterPatternMaps();
      String var2 = "OOPS";
      printMessage(var2, var1);
   }

   static class CharacterPatternMap {
      private final char character;
      private final String[] pattern;

      public CharacterPatternMap(char var1, String[] var2) {
         this.character = var1;
         this.pattern = var2;
      }

      public char getCharacter() {
         return this.character;
      }

      public String[] getPattern() {
         return this.pattern;
      }
   }
}
