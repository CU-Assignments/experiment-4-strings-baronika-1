// FirstOccurrence

public class ap4 {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null)
            return -1;
        if (needle.isEmpty())
            return 0;
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        String param_1 = "hello";
        String param_2 = "ll";

        ap4 obj = new ap4();
        int ret = obj.strStr(param_1, param_2);

        System.out.println(ret);
    }

}