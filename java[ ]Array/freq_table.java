public class freq_table {
    public static void main(String[] args)
    {
        String str = "abcdabcd";
        int[] freq = new int[26];

        for(int i = 0;i<str.length();i++)
        {
            freq[ str.charAt(i) - 'a']++;
        }

        for(int i =0;i<26;i++)
        {
            System.out.print(freq[i]+" ");
        }
    }

    
}
