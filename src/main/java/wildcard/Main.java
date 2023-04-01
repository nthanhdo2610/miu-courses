package wildcard;

public class Main {

    // A <- B <- C <- D


    public static void main(String[] args) {
        A a = new A();
        System.out.println(myMethod(new int[]{-92, -23, 0, 45, 89, 96, 99, 95, 89, -17, -48}));
        System.out.println(myMethod(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));

    }

    static boolean myMethod(int[] a) {
        int l = a.length;
        int[] b = new int[l];
        int begin = 0;
        int end = l - 1;
        int idx = 0;
        int current = 0;
        while (begin < end) {
            b[idx] = a[begin];
            if (b[idx] < current) {
                return false;
            }
            current = b[idx];
            idx += 1;
            b[idx] = a[end];
            if (b[idx] < current) {
                return false;
            }
            current = b[idx];
            idx += 1;
            begin += 1;
            end -= 1;
        }
        return true;
    }

    public static boolean isValid(int[] a){
        boolean asc = a[0] < a[1];
        boolean desc = a[0] > a[1];
        for(int i=1; i< a.length; i++) {
            if (asc && a[i] < a[i - 1])
                return false;
            if (desc && a[i] > a[i-1])
                return false;
        }
        return true;
    }
//    public static int countSawtooth(int[] a) {
//
//        int count = 0;
//        int l = a.length;
//        if(l<3){
//            return 0;
//        }
//        int subSize = 2;
//        while(subSize<l){
//            for(int i=0; i< l-subSize; i++){
//                if(isValid(Arrays.copyOf(a, i, end + 1, int[].class)));
//            }
//            subSize++;
//        }
//
//        for (int i = 1; i < l - 1; i++) {
//            if ((a[i] > a[i - 1] && a[i] > a[i + 1]) // ^
//                    || (a[i] < a[i - 1] && a[i] < a[i + 1])) // v
//            {
//                count++; // subarray is valid
//                int m = i - 1;
//                int n = i + 1;
//                while (m >= 0 && a[m] != a[i]) { // count left
//                    count++;
//                    m--;
//                }
//                while (n < l && a[n] != a[i]) { // count right
//                    count++;
//                    n++;
//                }
//            }
//        }
//        return count;
//    }
}
