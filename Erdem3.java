public class Erdem {
    
    public static void findInArray(int[] a, int[] b) {
        for (int i=0; i<a.length; i++){
            for (int j=i+1; j<a.length; j++){
                if (a[i] == a[j]) {
                    a[j] = -1;
                }
            }
        }
        for (int i=0; i<a.length; i++){
            boolean isTrue = false;
            for (int j=0; j<b.length; j++){
                if (a[i] == b[j] || a[i] == -1) {
                    isTrue = true;
                    break;
                }
            }
            if (!isTrue)
                System.out.print(a[i] + ", ");
        }
    }


    public static void main(String[] args) {
        int[] a = {4,3,4,3,6,7,4,8,2,9};
        int[] b = {2,3,6,8,1,5};

        findInArray(a, b);
    }
}
